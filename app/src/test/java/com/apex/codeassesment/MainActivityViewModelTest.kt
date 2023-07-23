import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.apex.codeassesment.data.model.Name
import com.apex.codeassesment.data.model.User
import com.apex.codeassesment.data.remote.DataResult
import com.apex.codeassesment.data.repository.IUserRepository
import com.apex.codeassesment.data.viewmodels.MainActivityViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit


@ExperimentalCoroutinesApi
class MainActivityViewModelTest {

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    private val testDispatcher = TestCoroutineDispatcher()

    @Mock
    private lateinit var userRepository: IUserRepository

    private lateinit var viewModel: MainActivityViewModel

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        viewModel = MainActivityViewModel(userRepository)
    }

    @Test
    fun `test refreshRandomUser updates randomUser LiveData on success`() =
        testDispatcher.runBlockingTest {
            val user = User("John Doe", Name("title", "first", "last"))
            Mockito.`when`(userRepository.getUser(true)).thenReturn(DataResult.Success(user))
            val randomUserObserver = Observer<User?> { }
            viewModel.refreshRandomUser()
            val observedUser = observeForValue(viewModel.randomUser)
            assertEquals(user, observedUser)

        }

    @Test
    fun `test refreshRandomUser handles error`() = testDispatcher.runBlockingTest {
        val errorMessage = "Error fetching random user"
        Mockito.`when`(userRepository.getUser(true))
            .thenReturn(DataResult.Failure(errorMessage))
        viewModel.refreshRandomUser()
        advanceUntilIdle()
        assert(viewModel.randomUser.value == null)
    }

    @Test
    fun `test loadUsersList updates usersList LiveData on success`() =
        testDispatcher.runBlockingTest {
            // Given
            val userList = listOf(
                User("User1", Name("title", "first", "last")),
                User("User2", Name("title", "first", "last"))
            )
            Mockito.`when`(userRepository.getUsersList())
                .thenReturn(DataResult.Success(userList))
            val usersListObserver = Observer<List<User>?> {}

            try {
                viewModel.usersList.observeForever(usersListObserver)
                viewModel.loadUsersList()
                advanceUntilIdle()
                assert(viewModel.usersList.value == userList)
            } finally {
                viewModel.usersList.removeObserver(usersListObserver)
            }
        }

    @Test
    fun `test loadUsersList handles error`() = testDispatcher.runBlockingTest {
        val errorMessage = "Error fetching random users"
        Mockito.`when`(userRepository.getUsersList())
            .thenReturn(DataResult.Failure(errorMessage))
        viewModel.loadUsersList()
        advanceUntilIdle()
        assert(viewModel.usersList.value == null)
    }

    fun <T> observeForValue(liveData: LiveData<T>): T? {
        var value: T? = null
        val latch = CountDownLatch(1)

        val observer = Observer<T> {
            value = it
            latch.countDown()
        }

        liveData.observeForever(observer)

        latch.await(5, TimeUnit.SECONDS)

        liveData.removeObserver(observer)

        return value
    }
}

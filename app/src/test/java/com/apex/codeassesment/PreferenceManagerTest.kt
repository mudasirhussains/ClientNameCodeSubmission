import android.content.Context
import com.apex.codeassesment.data.local.PreferencesManager
import com.apex.codeassesment.ui.main.MainActivity
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.Test

class PreferencesManagerTest {

    private val preferencesManager = PreferencesManager()

    @Test
    fun saveUser_shouldSaveTheUserToSharedPreferences() {
        val user = "John Doe"
        preferencesManager.saveUser(user)

        val sharedPreferences = MainActivity.sharedContext?.getSharedPreferences("random-user-preferences", Context.MODE_PRIVATE)
        val savedUser = sharedPreferences?.getString("saved-user", null)

        assertThat(savedUser, equalTo(user))
    }

    @Test
    fun loadUser_shouldReturnTheSavedUser() {
        val user = "Jane Doe"
        preferencesManager.saveUser(user)

        val savedUser = preferencesManager.loadUser()

        assertThat(savedUser, equalTo(user))
    }

    @Test
    fun loadUser_shouldReturnNullIfNoUserIsSaved() {
        val savedUser = preferencesManager.loadUser()

        assertThat(savedUser, null)
    }
}

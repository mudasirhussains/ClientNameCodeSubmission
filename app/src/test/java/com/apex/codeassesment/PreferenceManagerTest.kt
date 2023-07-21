package com.apex.codeassesment


import android.content.SharedPreferences
import com.apex.codeassesment.data.local.PreferencesManager
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.reset
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class PreferencesManagerTest {

    private lateinit var preferencesManager: PreferencesManager

    @Mock
    private lateinit var mockSharedPreferences: SharedPreferences

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        preferencesManager = PreferencesManager()

        preferencesManager.setSharedPreferences(mockSharedPreferences)
    }

    @After
    fun clearSharedPreferences() {
        reset(mockSharedPreferences)
    }

    @Test
    fun saveUserAndLoadUser_Successful() {
        val testUser = "JohnDoe"
        `when`(mockSharedPreferences.getString("saved-user", null)).thenReturn(testUser)

        preferencesManager.saveUser(testUser)
        val loadedUser = preferencesManager.loadUser()

        assertNotNull(loadedUser)
        assertEquals(testUser, loadedUser)
    }

    @Test
    fun loadUser_NoUserSaved() {
        `when`(mockSharedPreferences.getString("saved-user", null)).thenReturn(null)

        val loadedUser = preferencesManager.loadUser()

        assertNull(loadedUser)
    }

    @Test
    fun saveUser_OverwritePreviousUser() {
        val firstUser = "Mudassir"
        val secondUser = "Hussain"
        `when`(mockSharedPreferences.getString("saved-user", null)).thenReturn(firstUser)

        preferencesManager.saveUser(firstUser)
        preferencesManager.saveUser(secondUser)
        val loadedUser = preferencesManager.loadUser()

        assertNotNull(loadedUser)
        assertEquals(secondUser, loadedUser)
        assertNotEquals(firstUser, loadedUser)
    }
}




package com.apex.codeassesment


import androidx.recyclerview.widget.RecyclerView
import com.apex.codeassesment.ui.main.MainActivity
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@ExperimentalCoroutinesApi

    @RunWith(RobolectricTestRunner::class)
    class MainActivityViewModelTest {

        private lateinit var activity: MainActivity
        private lateinit var recyclerView: RecyclerView

        @Before
        fun setup() {
            activity =
                Robolectric.buildActivity(MainActivity::class.java).create().start().resume().get()
            recyclerView =
                activity.findViewById(R.id.main_user_rv)
        }

        @Test
        fun testRecyclerViewNotNull() {
            assertNotNull(recyclerView)
        }

        @Test
        fun testRecyclerViewAdapterNotNull() {
            val adapter = recyclerView.adapter
            assertNotNull(adapter)
        }

        @Test
        fun testRecyclerViewItemCount() {
            val adapter = recyclerView.adapter
            assertEquals(
                adapter?.itemCount,
                0
            )
        }

}


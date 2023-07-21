//package com.apex.codeassesment.ui.main.compose
//
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.material3.Button
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//
//
///**
// * The activity compose UI is tested on a separate project and it's working fine
// */
//
//class ComposeUI : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            MainScreen()
//        }
//    }
//}
//
//@Composable
//fun MainScreen() {
//    Surface(
//        color = Color.White,
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Column(
//            modifier = Modifier.padding(16.dp)
//        ) {
//            Text(
//                text = stringResource(R.string.my_random_user),
//                modifier = Modifier.fillMaxWidth(),
//                style = MaterialTheme.typography.headlineMedium,
//                textAlign = TextAlign.Center
//            )
//
//            SelectedUserCard()
//
//            Button(
//                onClick = { /* Refresh user */ },
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(top = 8.dp)
//            ) {
//                Text(text = stringResource(R.string.refresh_random_user))
//            }
//
//            Spacer(modifier = Modifier.height(8.dp))
//
//            Button(
//                onClick = { /* Show 10 users */ },
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                Text(text = stringResource(R.string.show_10_users))
//            }
//
//            UserList()
//        }
//    }
//}
//
//@Composable
//fun SelectedUserCard() {
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(vertical = 8.dp)
//    ) {
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Box(
//                modifier = Modifier
//                    .size(100.dp)
//                    .background(Color(0x33AAAAAA))
//            )
//
//            Spacer(modifier = Modifier.width(8.dp))
//
//            Column() {
//                Row {
//                    Text(
//                        text = stringResource(R.string.text_name),
//                        style = MaterialTheme.typography.bodyMedium,
//                        fontWeight = FontWeight.Bold
//                    )
//
//                    Text(
//                        text = "John Doe", // Replace with actual user name
//                        style = MaterialTheme.typography.bodyMedium
//                    )
//                }
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Row(
//                    modifier = Modifier.fillMaxWidth(),
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Text(
//                        text = stringResource(R.string.text_email),
//                        style = MaterialTheme.typography.bodyMedium,
//                        fontWeight = FontWeight.Bold
//                    )
//
//                    Spacer(modifier = Modifier.width(8.dp))
//
//                    Text(
//                        text = "john.doe@example.com", // Replace with actual user email
//                        style = MaterialTheme.typography.bodyMedium
//                    )
//                }
//
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Button(
//                    onClick = { /* View user details */ },
//                    modifier = Modifier.fillMaxWidth()
//                ) {
//                    Text(text = stringResource(R.string.view_details))
//                }
//
//            }
//
//        }
//
//
//    }
//}
//
//@Composable
//fun UserList() {
//    val userList = listOf("User 1", "User 2", "User 3", "User 4", "User 5")
//
//    LazyColumn(
//        modifier = Modifier
//            .fillMaxWidth()
//    ) {
//        items(userList) { user ->
//            UserListItem(user)
//        }
//    }
//}
//
//@Composable
//fun UserListItem(user: String) {
//    Text(
//        text = user,
//        style = MaterialTheme.typography.bodyMedium,
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(vertical = 4.dp)
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    MainScreen()
//}

package com.example.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			Box(
				modifier = Modifier
					.fillMaxSize() // Fills entire screen
			) {
				Column( // Use Column for vertical arrangement
					modifier = Modifier.align(Alignment.Center) // Center the Column
				) {
					// Uncomment MessageCard if you have one
					// MessageCard("Android")
					GoogleButton {
						// TODO: Implement your Google sign-up logic
					}
					// Add spacing between buttons
					Spacer(modifier = Modifier.height(16.dp)) // Adjust spacing as needed
				}
			}
		}
	}
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun DefaultPreview() {
	GoogleButton {

	}
}
package com.example.myapplication

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginBox() {
	Box {
		Text(
			text = "CICADA",
		)
	}
}

@Preview(showBackground = true)
@Composable
fun LoginBoxPreview() {
	LoginBox()
}
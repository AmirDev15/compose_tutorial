package com.example.jetpack_compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComposeTextFieldSection(textFromXml: String, onComposeTextChanged: (String) -> Unit) {
    var text by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Enter text in Compose:")
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = text,
            onValueChange = {
                text = it
                onComposeTextChanged(it) // Notify MainActivity of text change
            },
            label = { Text("Compose TextField") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text("Text from XML EditText: $textFromXml")
    }
}
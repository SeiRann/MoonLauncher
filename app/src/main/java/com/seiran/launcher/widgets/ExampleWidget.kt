package com.seiran.launcher.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Widget(title: String){
    WidgetContainer(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .height(100.dp)
    ) {
        Text(
            text = title,
            color = Color.White,
            modifier = Modifier.padding(10.dp)
        )
    }
}



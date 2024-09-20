package com.seiran.launcher.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun WidgetContainer(
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color.DarkGray,
    content: @Composable () -> Unit
){
    Box(
        modifier = modifier
            .background(backgroundColor, shape = RoundedCornerShape(6.dp))
    ){
        content()
    }
}
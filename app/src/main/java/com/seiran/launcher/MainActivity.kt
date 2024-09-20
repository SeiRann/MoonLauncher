package com.seiran.launcher

import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi

import androidx.compose.foundation.background

import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.seiran.launcher.ui.theme.MoonLauncherTheme

import androidx.compose.runtime.mutableStateListOf

import androidx.compose.runtime.remember
import androidx.compose.ui.draw.clip

import androidx.compose.ui.graphics.Color

import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.seiran.launcher.widgets.ClockWidget
import com.seiran.launcher.widgets.Widget


class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window,false)


        setContent {
            MoonLauncherTheme {
                MainPreview()
            }
        }
    }
}


@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun MainPreview(){
    val widgetList = remember {
        mutableStateListOf<@Composable () -> Unit>().apply {
            add { ClockWidget() }
            add { Widget("Widget 2") }
            add { Widget("Widget 3") }
            add { Widget("Widget 3") }
            add { Widget("Widget 3") }
            add { Widget("Widget 3") }
            add { Widget("Widget 3") }
            add { Widget("Widget 3") }
            add { Widget("Widget 3") }
            add { Widget("Widget 3") }

        }
    }
    Box(
        modifier = Modifier
            .background(Color.Black)
    ){
        LazyColumn(
            Modifier
                .fillMaxSize()
                .padding(top=40.dp)
                .clip(shape = RoundedCornerShape(topStart=30.dp, topEnd = 30.dp))
                .background(color = Color.Black)
        ) {
            items(widgetList.size){ index -> widgetList[index]() }
        }
    }

}


package com.bh.jetpack_compose_tutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.bh.jetpack_compose_tutorial.ui.theme.JetpackComposeTutorialTheme
import com.bh.jetpack_compose_tutorial.data.SampleData
import com.bh.jetpack_compose_tutorial.ui.components.Conversation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme {
                Conversation(messages = SampleData.conversationSample)
            }
        }
    }
}



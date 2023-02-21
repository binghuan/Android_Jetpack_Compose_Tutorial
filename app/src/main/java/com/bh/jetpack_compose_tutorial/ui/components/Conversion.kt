package com.bh.jetpack_compose_tutorial.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.bh.jetpack_compose_tutorial.data.SampleData
import com.bh.jetpack_compose_tutorial.model.Message
import com.bh.jetpack_compose_tutorial.ui.theme.JetpackComposeTutorialTheme

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(message)
        }
    }
}

@Preview
@Composable
fun PreviewConversation() {
    JetpackComposeTutorialTheme {
        Conversation(SampleData.conversationSample)
    }
}


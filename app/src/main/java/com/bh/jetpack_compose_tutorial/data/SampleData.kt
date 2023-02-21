package com.bh.jetpack_compose_tutorial.data

import com.bh.jetpack_compose_tutorial.R
import com.bh.jetpack_compose_tutorial.model.Message

class SampleData {

    companion object {
        val conversationSample: List<Message> = listOf(
            Message(author = "BH", body = "Master", picture = R.drawable.profile_picture),
            Message(author = "Mia", body = "Assistant", picture = R.drawable.profile_picture),
            Message(author = "Galami", body = "Engineer", picture = R.drawable.profile_picture),
            Message(author = "Wayne", body = "Engineer", picture = R.drawable.profile_picture),
            Message(author = "Mama", body = "Babysitter", picture = R.drawable.profile_picture),
        )

    }
}

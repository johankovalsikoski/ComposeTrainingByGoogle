package johan.kovalsikoski.composetraining.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.lazy.items
import johan.kovalsikoski.composetraining.data.Message
import johan.kovalsikoski.composetraining.data.SampleData

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(msg = message)
        }
    }
}

@Preview
@Composable
fun ConversationPreview() {
    Conversation(SampleData.conversationSample)
}
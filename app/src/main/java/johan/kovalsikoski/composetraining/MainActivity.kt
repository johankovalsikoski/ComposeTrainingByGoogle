package johan.kovalsikoski.composetraining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import johan.kovalsikoski.composetraining.data.Message
import johan.kovalsikoski.composetraining.data.SampleData
import johan.kovalsikoski.composetraining.ui.components.Conversation
import johan.kovalsikoski.composetraining.ui.components.MessageCard
import johan.kovalsikoski.composetraining.ui.theme.ComposeTrainingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTrainingTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Conversation(SampleData.conversationSample)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTrainingTheme {
        Conversation(SampleData.conversationSample)
    }
}
import androidx.compose.desktop.Window
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

fun main() = Window {
    var count by remember { mutableStateOf(0) }

    MaterialTheme {
        Button(onClick = {
            count++
        }) {
            Text(if(count==0) "Hello, Jetpack Compose Desktop World" else "You clicked $count times")
        }
    }
}
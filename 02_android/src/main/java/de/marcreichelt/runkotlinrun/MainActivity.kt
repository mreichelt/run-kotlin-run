package de.marcreichelt.runkotlinrun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import de.marcreichelt.runkotlinrun.ui.theme.RunKotlinRunTheme
import isPrime

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RunKotlinRunTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    IsAPrime(
                        number = 71L,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun IsAPrime(number: Long, modifier: Modifier = Modifier) {
    val isPrime = "$number " + if(isPrime(number)) "is a prime! ✅" else "is not a prime ❌"
    Text(
        text = isPrime,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun IsAPrimePreview() {
    RunKotlinRunTheme {
        IsAPrime(71L)
    }
}
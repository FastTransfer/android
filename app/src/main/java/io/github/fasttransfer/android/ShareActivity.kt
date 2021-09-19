package io.github.fasttransfer.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import timber.log.Timber

class ShareActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d(intent?.toString())

        setContent {
            Column {
                Text(text = "Items to share:")
                intent.clipData?.run {
                    for (i in 0 until itemCount) {
                        val item = getItemAt(i)
                        val name = item.uri?.toString()
                            ?: item.htmlText
                            ?: item.text?.toString()
                            ?: item.toString()
                        Text(text = "#$i - $name")
                    }
                }
            }
        }
    }
}

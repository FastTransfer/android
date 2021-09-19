package io.github.fasttransfer.android.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import timber.log.Timber

class ShareReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Timber.d(intent?.toString())
    }
}

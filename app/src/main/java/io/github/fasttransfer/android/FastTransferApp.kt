package io.github.fasttransfer.android

import android.app.Application
import timber.log.Timber

class FastTransferApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}

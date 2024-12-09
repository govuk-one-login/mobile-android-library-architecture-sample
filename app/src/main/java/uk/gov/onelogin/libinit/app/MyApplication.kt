package uk.gov.onelogin.libinit.app

import android.app.Application
import timber.log.Timber
import uk.gov.onelogin.libinit.sdk.api.Library

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}
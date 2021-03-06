package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import java.security.AccessControlContext

class SunnyWeatherApplication : Application() {
    companion object {
        const val TOKEN = "h6oWSvC7EWlVFuFa"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}
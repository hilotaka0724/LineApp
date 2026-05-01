package com.example.lineapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class LineApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}
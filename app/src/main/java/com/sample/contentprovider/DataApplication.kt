package com.sample.contentprovider

import android.app.Application
import android.util.Log

class DataApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Log.d( TAG, "${this::class.java} created with Context $this" )
    }

    companion object {
        private const val TAG = "DataApplication"
    }
}
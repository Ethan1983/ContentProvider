package com.sample.contentprovider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

class NewProcessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_process)

        Log.d( TAG, "${this::class.java} created with Context $this" )
    }

    companion object {
        private const val TAG = "NewProcessActivity"
    }

}
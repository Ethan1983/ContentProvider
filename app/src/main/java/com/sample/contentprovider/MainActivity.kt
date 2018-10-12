package com.sample.contentprovider

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.launch_button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d( TAG, "${this::class.java} created with Context $this" )

        launch_button.setOnClickListener {
            startActivity( Intent( this, NewProcessActivity::class.java ) )
        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}

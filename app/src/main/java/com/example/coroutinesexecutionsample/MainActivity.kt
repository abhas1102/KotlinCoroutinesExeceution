package com.example.coroutinesexecutionsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val TAG = "Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //GlobalScope means coroutines started under this scope will live as long our application does
        GlobalScope.launch {
            Log.d(TAG,"Coroutine says hello from thread")
        }

    }
}
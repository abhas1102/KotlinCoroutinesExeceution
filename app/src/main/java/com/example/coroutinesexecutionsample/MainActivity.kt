package com.example.coroutinesexecutionsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val TAG = "Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //GlobalScope means coroutines started under this scope will live as long our application does
        GlobalScope.launch {
           // delay(3000L)
          //  Log.d(TAG,"Coroutine says hello from thread ${Thread.currentThread().name}")
            val networkCall1=doNetworkCall()
            val networkCall2=doNetworkCall2()

            Log.d(TAG,networkCall1)
            Log.d(TAG,networkCall2)
        }

       // Log.d(TAG,"Coroutine says hello from thread ${Thread.currentThread().name}")

    }
    suspend fun doNetworkCall():String{
        delay(3000L)
        return "This is the answer"

    }
    //First delay call will also influence the second delay call because they are executed in same coroutine
    suspend fun doNetworkCall2():String{
        delay(3000L)
        return "This is my answer"
    }


}
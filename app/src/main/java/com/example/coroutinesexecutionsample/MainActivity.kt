package com.example.coroutinesexecutionsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.coroutinesexecutionsample.databinding.ActivityMainBinding
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    val TAG = "Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Usage of RunBlocking
      /*  Log.d(TAG,"Before runBlocking")
        runBlocking {
            launch(Dispatchers.IO) {
                delay(3000L)
                Log.d(TAG,"Finished IO coroutine 1")
            }

            launch(Dispatchers.IO) {
                delay(3000L)
                Log.d(TAG,"Finished IO coroutine 2")
            }

            Log.d(TAG,"Run Blocking started")
            delay(2000L)
            Log.d(TAG,"End of runBlocking")
        }

        Log.d(TAG,"After Run Blocking") */

        runBlocking {
            delay(1000L)
            GlobalScope.launch {
                Log.d(TAG, "1")
            }
            delay(1000L)
            doSomething()
            GlobalScope.launch {
                delay(1000L)
                Log.d(TAG, "2")
            }
            Log.d(TAG, "3")
        }
        Log.d(TAG, "4")
    }

     /*   Log.d(TAG,"Before runBlocking")
        GlobalScope.launch{
            delay(5000L)
            Log.d(TAG,"Ram meets Lakshman")
        }
        Log.d(TAG,"Sita Mata kidnapped by Paapi Raavan") */


     /*   GlobalScope.launch(Dispatchers.IO){
            Log.d(TAG,"Starting coroutine in thread ${Thread.currentThread().name}")
            val answer = doNetworkCall()
            withContext(Dispatchers.Main){
                Log.d(TAG,"Setting text in thread ${Thread.currentThread().name}")
                binding.tvDummy.text = answer
            }
        } */

     /*   Log.d(TAG, "1")
        GlobalScope.launch {
            doSomething()
            delay(1000L)
            Log.d(TAG, "3")
        }
        GlobalScope.launch {
            delay(1000L)
            Log.d(TAG, "4")
        }
        Log.d(TAG, "5")

    }
    suspend fun doSomething() {
        delay(500L)
        Log.d(TAG, "2")
        delay(1000L)

        //GlobalScope means coroutines started under this scope will live as long our application does
        /* GlobalScope.launch {
           // delay(3000L)
          //  Log.d(TAG,"Coroutine says hello from thread ${Thread.currentThread().name}")
            val networkCall1=doNetworkCall()
            val networkCall2=doNetworkCall2()

            Log.d(TAG,networkCall1)
            Log.d(TAG,networkCall2)
        }

       // Log.d(TAG,"Coroutine says hello from thread ${Thread.currentThread().name}")

    } */
        /* suspend fun doNetworkCall():String{
        delay(3000L)
        return "This is the answer"

    }
    //First delay call will also influence the second delay call because they are executed in same coroutine
    suspend fun doNetworkCall2():String{
        delay(3000L)
        return "This is my answer"
    } */


    } */
     suspend fun doSomething() {
         Log.d(TAG, "5")
         delay(1000L)
     }
}
   /* suspend fun doNetworkCall():String{
        delay(5000L)
        return "East and West India is the Best"
    } */

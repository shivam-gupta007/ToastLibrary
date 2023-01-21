package com.shivamgupta.toastlibrary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shivamgupta.toasterlibrary.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toaster(this).show(text = "Hello, Shivam gutpa")
    }
}
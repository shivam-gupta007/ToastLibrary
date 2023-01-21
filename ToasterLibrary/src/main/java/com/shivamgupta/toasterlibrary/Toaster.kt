package com.shivamgupta.toasterlibrary

import android.content.Context
import android.widget.Toast

class Toaster(private val context: Context) {

    fun show(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }
}
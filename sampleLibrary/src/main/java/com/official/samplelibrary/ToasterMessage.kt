package com.official.samplelibrary

import android.content.Context
import android.widget.Toast

/**
Created by Prajeet Naga on 10/12/20, 3:01 PM.
 **/
class ToasterMessage {
    fun showToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }
}
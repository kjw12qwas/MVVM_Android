package com.example.sharedpreferencesingleton

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager.getDefaultSharedPreferences
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pref = PreferenceManager1(this)

        textView.text = pref.getData("TEXT")

        if (editText.text.toString() != null){

            button.setOnClickListener {
                textView.text = editText.text.toString()
                pref.setData("TEXT", editText.text.toString())
            }
        }

    }
}
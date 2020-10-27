package com.example.singletonexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        DataSingleton.getInstance()?.message = "안녕하세요"

        button.setOnClickListener { startActivity(Intent(this,MainActivity::class.java)) }
    }
}

package com.example.company.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val value = editText.text
        button.setOnClickListener {
            val secondActivity = Intent(this, SecondActivity::class.java)
            secondActivity.putExtra("text",value)
            startActivity(secondActivity)
        }


    }

    override fun onRestart() {
        super.onRestart()
        val intent = intent.extras
        textView.text = intent.get("text").toString()

    }

    override fun onStop() {
        super.onStop()
        editText.setText("")
    }

}

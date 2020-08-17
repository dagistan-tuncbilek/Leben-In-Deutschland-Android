package com.dt.lebenindeutschland

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class LearningActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var backArrow : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learning)
        backArrow = findViewById(R.id.learnBackArrow)
        backArrow.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.learnBackArrow -> startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
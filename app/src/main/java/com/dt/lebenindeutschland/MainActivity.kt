package com.dt.lebenindeutschland

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity(), View.OnClickListener  {

    lateinit var mainCardViewLearning : CardView
    lateinit var mainCardViewTest : CardView
    lateinit var mainCardViewExam : CardView
    lateinit var mainCardViewSelectState : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()
    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.mainCardViewLearning -> startActivity(Intent(this, LearningActivity::class.java))
        }
    }
    private fun initialize() {
        mainCardViewLearning = findViewById(R.id.mainCardViewLearning)
        mainCardViewLearning.setOnClickListener(this)
        mainCardViewTest = findViewById(R.id.mainCardViewTest)
        mainCardViewTest.setOnClickListener(this)
        mainCardViewExam = findViewById(R.id.mainCardViewExam)
        mainCardViewExam.setOnClickListener(this)
        mainCardViewSelectState = findViewById(R.id.mainCardViewSelectState)
        mainCardViewSelectState.setOnClickListener(this)
    }
}
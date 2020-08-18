package com.dt.lebenindeutschland

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.dt.lebenindeutschland.learn.LearningActivity
import com.dt.lebenindeutschland.test.TestActivity

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

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.mainCardViewLearning -> startActivity(Intent(this, LearningActivity::class.java))
                R.id.mainCardViewTest -> startActivity(Intent(this, TestActivity::class.java))
                R.id.mainCardViewSelectState -> startActivity(Intent(this, SelectStateActivity::class.java))
            }
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
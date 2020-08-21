package com.dt.lebenindeutschland

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.cardview.widget.CardView
import com.dt.lebenindeutschland.utility.*
import com.dt.lebenindeutschland.learn.LearningActivity
import com.dt.lebenindeutschland.test.TestActivity

class MainActivity : AppCompatActivity(), View.OnClickListener  {

    private lateinit var mainCardViewLearning : CardView
    private lateinit var mainCardViewTest : CardView
    private lateinit var mainCardViewExam : CardView
    private lateinit var mainCardViewSelectState : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DataBaseHandler(this).setUserStateFromDatabase()
        if (selectedState == State.NOT_SELECTED) startActivity(Intent(this, SelectStateActivity::class.java))
        initialize()
    }

    override fun onClick(v: View?) {
        Log.d(TAG, "Clicked")
        if (v != null) {
            when(v.id){
                R.id.mainCardViewLearning -> startActivity(Intent(this, LearningActivity::class.java))
                R.id.mainCardViewTest -> startActivity(Intent(this, TestActivity::class.java))
                R.id.mainCardViewSelectState -> startActivity(Intent(this, SelectStateActivity::class.java))
            }
        }
    }

    private fun initialize() {
        Log.d(TAG, "initileized")
        mainCardViewLearning = findViewById(R.id.mainCardViewLearning)
        mainCardViewLearning.setOnClickListener(this)
        mainCardViewTest = findViewById(R.id.mainCardViewTest)
        mainCardViewTest.setOnClickListener(this)
        mainCardViewExam = findViewById(R.id.mainCardViewExam)
        mainCardViewExam.setOnClickListener(this)
        mainCardViewSelectState = findViewById(R.id.mainCardViewSelectState)
        mainCardViewSelectState.setOnClickListener(this)

    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
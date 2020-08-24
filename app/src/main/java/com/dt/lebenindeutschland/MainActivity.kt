package com.dt.lebenindeutschland

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.cardview.widget.CardView
import com.dt.lebenindeutschland.exam.ExamInformationActivity
import com.dt.lebenindeutschland.utility.*
import com.dt.lebenindeutschland.learn.LearningActivity
import com.dt.lebenindeutschland.test.TestActivity
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener  {

    private lateinit var mainCardViewLearning : CardView
    private lateinit var mainCardViewTest : CardView
    private lateinit var mainCardViewExam : CardView
    private lateinit var mainCardViewSelectState : CardView
    private lateinit var mainCardVievLanguage: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val language = DataBaseHandler(this).setUserSettingsFromDatabase()
        if (language != Language.NOT_SELECTED) setLocate(language.getLanguage())
        if (selectedState == State.NOT_SELECTED) startActivity(Intent(this, SelectStateActivity::class.java))
        setContentView(R.layout.activity_main)
        initialize()
    }

    private fun setLocate(language: String) {
        val locale = Locale(language)
        Locale.setDefault(locale)
        val config = Configuration()
        config.setLocale(locale)
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)
        val editor = getSharedPreferences("Settings", Activity.MODE_PRIVATE).edit()
        editor.putString("My_Lang", language)
        editor.apply()
    }

    override fun onClick(v: View?) {
        Log.d(TAG, "Clicked")
        if (v != null) {
            when(v.id){
                R.id.mainCardViewExam -> startActivity(Intent(this, ExamInformationActivity::class.java))
                R.id.mainCardViewLearning -> startActivity(Intent(this, LearningActivity::class.java))
                R.id.mainCardViewTest -> startActivity(Intent(this, TestActivity::class.java))
                R.id.mainCardViewSelectState -> startActivity(Intent(this, SelectStateActivity::class.java))
                R.id.mainCardVievLanguage -> startActivity(Intent(this, LanguageActivity::class.java))
            }
        }
    }

    private fun initialize() {
        Log.d(TAG, "initialized")
        mainCardViewLearning = findViewById(R.id.mainCardViewLearning)
        mainCardViewLearning.setOnClickListener(this)
        mainCardViewTest = findViewById(R.id.mainCardViewTest)
        mainCardViewTest.setOnClickListener(this)
        mainCardViewExam = findViewById(R.id.mainCardViewExam)
        mainCardViewExam.setOnClickListener(this)
        mainCardViewSelectState = findViewById(R.id.mainCardViewSelectState)
        mainCardViewSelectState.setOnClickListener(this)
        mainCardVievLanguage = findViewById(R.id.mainCardVievLanguage)
        mainCardVievLanguage.setOnClickListener(this)

    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
package com.dt.lebenindeutschland

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.dt.lebenindeutschland.exam.ExamInformationActivity
import com.dt.lebenindeutschland.learn.LearningActivity
import com.dt.lebenindeutschland.test.TestActivity
import com.dt.lebenindeutschland.utility.DataBaseHandler
import com.dt.lebenindeutschland.utility.State
import com.dt.lebenindeutschland.utility.userLanguage
import hotchemi.android.rate.AppRate
import java.util.*


class MainActivity : AppCompatActivity(), View.OnClickListener  {

    private lateinit var mainCardViewLearning : CardView
    private lateinit var mainCardViewTest : CardView
    private lateinit var mainCardViewExam : CardView
    private lateinit var mainCardViewSelectState : CardView
    private lateinit var mainCardVievLanguage: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBaseHandler(this).setUserSettingsFromDatabase()
        setLanguage()
        if (selectedState == State.NOT_SELECTED) startActivity(
            Intent(
                this,
                SelectStateActivity::class.java
            )
        )
        setContentView(R.layout.activity_main)

        AppRate.with(this)
            .setInstallDays(1) // default 10, 0 means install day.
            .setLaunchTimes(3) // default 10
            .setRemindInterval(2) // default 1
            .setShowLaterButton(true) // default true
            .setDebug(false) // default false
            .setOnClickButtonListener { }
            .monitor()
        // Show a dialog if meets conditions
        AppRate.showRateDialogIfMeetsConditions(this)
        initialize()
    }

    override fun onClick(v: View?) {
        Log.d(TAG, "Clicked")
        if (v != null) {
            when(v.id){
                R.id.mainCardViewExam -> startActivity(
                    Intent(
                        this,
                        ExamInformationActivity::class.java
                    )
                )
                R.id.mainCardViewLearning -> startActivity(
                    Intent(
                        this,
                        LearningActivity::class.java
                    )
                )
                R.id.mainCardViewTest -> startActivity(Intent(this, TestActivity::class.java))
                R.id.mainCardViewSelectState -> startActivity(
                    Intent(
                        this,
                        SelectStateActivity::class.java
                    )
                )
                R.id.mainCardVievLanguage -> startActivity(
                    Intent(
                        this,
                        LanguageActivity::class.java
                    )
                )
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

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        setLanguage()
    }

    private fun setLanguage() {
        val locale = Locale(userLanguage.getLanguage())
        Locale.setDefault(locale)
        val config = Configuration()
        config.setLocale(locale)
        @Suppress("DEPRECATION")
        this.resources.updateConfiguration(config, this.resources.displayMetrics)
        val editor = this.getSharedPreferences("Settings", MODE_PRIVATE).edit()
        editor.putString("My_Lang", userLanguage.getLanguage())
        editor.apply()
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
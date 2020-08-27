package com.dt.lebenindeutschland.exam

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.dt.lebenindeutschland.MainActivity
import com.dt.lebenindeutschland.R
import com.dt.lebenindeutschland.utility.DataBaseHandler
import com.dt.lebenindeutschland.utility.userLanguage
import java.util.*

class ExamInformationActivity : AppCompatActivity(), View.OnClickListener  {

    private lateinit var examInfoBackArrow: ImageView
    private lateinit var examInfoButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLanguage()
        DataBaseHandler(this).setUserSettingsFromDatabase(this)
        setContentView(R.layout.activity_exam_information)
        initialize()
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
    private fun initialize() {
        examInfoBackArrow = findViewById(R.id.examInfoBackArrow)
        examInfoBackArrow.setOnClickListener(this)
        examInfoButton = findViewById(R.id.examInfoButton)
        examInfoButton.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        when(v?.id){
            R.id.examInfoBackArrow -> startActivity(Intent(this, MainActivity::class.java))
            R.id.examInfoButton -> startActivity(Intent(this, ExamActivity::class.java))
        }
    }
}
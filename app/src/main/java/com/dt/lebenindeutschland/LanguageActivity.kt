package com.dt.lebenindeutschland

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.dt.lebenindeutschland.utility.DataBaseHandler
import com.dt.lebenindeutschland.utility.LANGUAGE_ID
import com.dt.lebenindeutschland.utility.Language
import com.dt.lebenindeutschland.utility.userLanguage
import java.util.*

class LanguageActivity : AppCompatActivity(), View.OnClickListener  {

    private lateinit var languageBackArrow: ImageView
    private lateinit var languageCardViewGerman: CardView
    private lateinit var languageCardViewEnglish: CardView
    private lateinit var languageCardViewRussia: CardView
    private lateinit var languageCardViewTurkish: CardView
    private lateinit var languageCardViewArab: CardView
    private lateinit var languageCardViewPolish: CardView
    private lateinit var languageCardViewIran: CardView
    private lateinit var languageCardViewFrench: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLanguage()
        setContentView(R.layout.activity_language)
        initialize()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        setLanguage()
        setContentView(R.layout.activity_language)
        initialize()
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.languageBackArrow -> startActivity(Intent(this, MainActivity::class.java))
            R.id.languageCardViewGerman -> DataBaseHandler(this).updateUtilityData(LANGUAGE_ID, Language.GERMAN.ordinal)
            R.id.languageCardViewEnglish -> DataBaseHandler(this).updateUtilityData(LANGUAGE_ID, Language.ENGLISH.ordinal)
            R.id.languageCardViewRussia -> DataBaseHandler(this).updateUtilityData(LANGUAGE_ID, Language.RUSSIAN.ordinal)
            R.id.languageCardViewTurkish -> DataBaseHandler(this).updateUtilityData(LANGUAGE_ID, Language.TURKISH.ordinal)
            R.id.languageCardViewArab -> DataBaseHandler(this).updateUtilityData(LANGUAGE_ID, Language.ARABIC.ordinal)
            R.id.languageCardViewPolish -> DataBaseHandler(this).updateUtilityData(LANGUAGE_ID, Language.POLISH.ordinal)
            R.id.languageCardViewIran -> DataBaseHandler(this).updateUtilityData(LANGUAGE_ID, Language.IRANIAN.ordinal)
            R.id.languageCardViewFrench -> DataBaseHandler(this).updateUtilityData(LANGUAGE_ID, Language.FRENCH.ordinal)
        }
        startActivity(Intent(this, MainActivity::class.java))
    }

    private fun initialize() {
        languageBackArrow = findViewById(R.id.languageBackArrow)
        languageBackArrow.setOnClickListener(this)
        languageCardViewGerman = findViewById(R.id.languageCardViewGerman)
        languageCardViewGerman.setOnClickListener(this)
        languageCardViewEnglish = findViewById(R.id.languageCardViewEnglish)
        languageCardViewEnglish.setOnClickListener(this)
        languageCardViewRussia = findViewById(R.id.languageCardViewRussia)
        languageCardViewRussia.setOnClickListener(this)
        languageCardViewTurkish = findViewById(R.id.languageCardViewTurkish)
        languageCardViewTurkish.setOnClickListener(this)
        languageCardViewArab = findViewById(R.id.languageCardViewArab)
        languageCardViewArab.setOnClickListener(this)
        languageCardViewPolish = findViewById(R.id.languageCardViewPolish)
        languageCardViewPolish.setOnClickListener(this)
        languageCardViewIran = findViewById(R.id.languageCardViewIran)
        languageCardViewIran.setOnClickListener(this)
        languageCardViewFrench = findViewById(R.id.languageCardViewFrench)
        languageCardViewFrench.setOnClickListener(this)
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

}
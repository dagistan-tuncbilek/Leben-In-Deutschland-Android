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
import java.util.*

class LanguageActivity : AppCompatActivity(), View.OnClickListener  {

    private lateinit var languageBackArrow: ImageView
    private lateinit var languageCardViewGerman: CardView
    private lateinit var languageCardViewEnglish: CardView
    private lateinit var languageCardViewRussia: CardView
    private lateinit var languageCardViewTurkish: CardView
    private lateinit var languageCardViewArab: CardView
    private lateinit var languageCardViewPolnisch: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)
        initialize()
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.languageBackArrow -> startActivity(Intent(this, MainActivity::class.java))
            R.id.languageCardViewGerman -> setLocate (Language.GERMAN)
            R.id.languageCardViewEnglish -> setLocate (Language.ENGLISH)
            R.id.languageCardViewRussia -> setLocate (Language.RUSSIAN)
            R.id.languageCardViewTurkish -> setLocate (Language.TURKISH)
            R.id.languageCardViewArab -> setLocate (Language.ARABIC)
            R.id.languageCardViewPolnisch -> setLocate (Language.POLISH)
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
        languageCardViewPolnisch = findViewById(R.id.languageCardViewPolnisch)
        languageCardViewPolnisch.setOnClickListener(this)
    }

    private fun setLocate(language: Language) {
        DataBaseHandler(this).updateUtilityData(LANGUAGE_ID, language.ordinal)
        val locale = Locale(language.getLanguage())
        Locale.setDefault(locale)
        val config = Configuration()
        config.setLocale(locale)
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)
        val editor = getSharedPreferences("Settings", Activity.MODE_PRIVATE).edit()
        editor.putString("My_Lang", language.getLanguage())
        editor.apply()
    }
}
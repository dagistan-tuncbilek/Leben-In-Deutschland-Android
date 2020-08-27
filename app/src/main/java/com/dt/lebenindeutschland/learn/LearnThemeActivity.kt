package com.dt.lebenindeutschland.learn

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.dt.lebenindeutschland.R
import com.dt.lebenindeutschland.selectedState
import com.dt.lebenindeutschland.utility.*
import kotlinx.android.synthetic.main.activity_theme.*
import java.util.*
import kotlin.collections.ArrayList

class ThemaActivity : AppCompatActivity(), View.OnClickListener  {

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: LearnThemeRecycleviewAdapter
    private val db: DataBaseHandler = DataBaseHandler(this)
    private lateinit var themaToolbar: Toolbar
    private lateinit var backArrow : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLanguage()
        setContentView(R.layout.activity_theme)
        linearLayoutManager = LinearLayoutManager(this)
        themaRecyclerView.layoutManager = linearLayoutManager
        initilaize()
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

    private fun initilaize() {
        adapter = LearnThemeRecycleviewAdapter(getQuestionList())
        themaRecyclerView.adapter = adapter
        themaToolbar = findViewById(R.id.themaToolbar)
        if (selectedThema == Thema.BUNDESLANDER) themaToolbar.subtitle = selectedState.getStateName()
        else themaToolbar.subtitle = selectedThema.getThemeName()
        backArrow = findViewById(R.id.themaBackArrow)
        backArrow.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.themaBackArrow -> startActivity(Intent(this, LearningActivity::class.java))
            }
        }
    }

    private fun getQuestionList(): ArrayList<Question> {
        return if (selectedThema == Thema.BUNDESLANDER)
            db.readSelectedData(IntArray(10){ it + selectedState.ordinal*10 + 301 })
        else {
            db.readDataWithThemaId(selectedThema.getThemeID())
        }
    }
}


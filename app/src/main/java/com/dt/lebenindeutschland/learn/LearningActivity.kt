package com.dt.lebenindeutschland.learn

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.dt.lebenindeutschland.MainActivity
import com.dt.lebenindeutschland.R
import com.dt.lebenindeutschland.utility.DataBaseHandler
import com.dt.lebenindeutschland.utility.getThemesData
import com.dt.lebenindeutschland.utility.userLanguage
import kotlinx.android.synthetic.main.activity_learning.*
import java.util.*

class LearningActivity : AppCompatActivity(), View.OnClickListener {

    private var  orientationLand: Boolean = false
    private lateinit var backArrow : ImageView
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: LearningRecyclerviewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLanguage()
        setContentView(R.layout.activity_learning)
        linearLayoutManager = LinearLayoutManager(this)
        learnRecyclerView.layoutManager = linearLayoutManager

        adapter = LearningRecyclerviewAdapter(getThemesData())
        learnRecyclerView.adapter = adapter
        backArrow = findViewById(R.id.learnBackArrow)
        backArrow.setOnClickListener(this)
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

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.learnBackArrow -> startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }
}
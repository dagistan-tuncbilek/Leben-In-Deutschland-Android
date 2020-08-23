package com.dt.lebenindeutschland.exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.dt.lebenindeutschland.MainActivity
import com.dt.lebenindeutschland.R

class ExamInformationActivity : AppCompatActivity(), View.OnClickListener  {

    private lateinit var examInfoBackArrow: ImageView
    private lateinit var examInfoButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam_information)
        initialize()
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
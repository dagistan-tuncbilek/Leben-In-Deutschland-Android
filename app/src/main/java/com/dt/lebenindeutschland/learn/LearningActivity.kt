package com.dt.lebenindeutschland.learn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import com.dt.lebenindeutschland.MainActivity
import com.dt.lebenindeutschland.R
import com.dt.lebenindeutschland.SelectStateActivity
import com.dt.lebenindeutschland.data.State
import com.dt.lebenindeutschland.data.getThemasData
import com.dt.lebenindeutschland.selectedState
import kotlinx.android.synthetic.main.activity_learning.*

class LearningActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var backArrow : ImageView
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: LearningRecycleviewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learning)

        linearLayoutManager = LinearLayoutManager(this)
        learnRecyclerView.layoutManager = linearLayoutManager

        adapter = LearningRecycleviewAdapter(getThemasData())
        learnRecyclerView.adapter = adapter
        backArrow = findViewById(R.id.learnBackArrow)
        backArrow.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.learnBackArrow -> startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }
}
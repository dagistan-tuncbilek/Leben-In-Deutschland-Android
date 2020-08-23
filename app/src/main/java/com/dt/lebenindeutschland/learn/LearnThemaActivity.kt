package com.dt.lebenindeutschland.learn

import com.dt.lebenindeutschland.utility.Question
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.dt.lebenindeutschland.R
import com.dt.lebenindeutschland.utility.DataBaseHandler
import com.dt.lebenindeutschland.utility.Thema
import com.dt.lebenindeutschland.utility.selectedThema
import com.dt.lebenindeutschland.selectedState
import kotlinx.android.synthetic.main.activity_thema.*

class ThemaActivity : AppCompatActivity(), View.OnClickListener  {

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: LearnThemaRecycleviewAdapter
    private val db: DataBaseHandler = DataBaseHandler(this)
    private lateinit var themaToolbar: Toolbar
    private lateinit var backArrow : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thema)

        linearLayoutManager = LinearLayoutManager(this)
        themaRecyclerView.layoutManager = linearLayoutManager
        initilaize()
    }

    private fun initilaize() {
        adapter = LearnThemaRecycleviewAdapter(getQuestionList())
        themaRecyclerView.adapter = adapter
        themaToolbar = findViewById(R.id.themaToolbar)
        if (selectedThema == Thema.BUNDESLANDER) themaToolbar.subtitle = selectedState.getStateName()
        else themaToolbar.subtitle = selectedThema.getThemaName()
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
            db.readDataWithThemaId(selectedThema.getThemaID())
        }
    }
}


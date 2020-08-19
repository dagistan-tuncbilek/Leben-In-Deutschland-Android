package com.dt.lebenindeutschland.learn

import Question
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.dt.lebenindeutschland.R
import com.dt.lebenindeutschland.data.Thema
import com.dt.lebenindeutschland.data.selectedThema
import com.dt.lebenindeutschland.selectedState
import kotlinx.android.synthetic.main.activity_thema.*
import com.dt.lebenindeutschland.data.readData

class ThemaActivity : AppCompatActivity(), View.OnClickListener  {

    private lateinit var backArrow : ImageView
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: LearnThemaRecycleviewAdapter

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
}

private fun getQuestionList(): List<Question> {
    val questionList: List<Question> = readData()
    var selectedList: MutableList<Question> = mutableListOf()
    if (selectedThema == Thema.BUNDESLANDER){
        for (i in 0..9){
            selectedList.add(questionList.get(selectedState.getQuestionNumber() + i))
        }
    } else {
        for (question in questionList){
            if (selectedThema.getThemaName() == question.thema){
                selectedList.add(question)
            }
        }
    }
    return selectedList
}
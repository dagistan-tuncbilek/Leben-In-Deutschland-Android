package com.dt.lebenindeutschland.exam

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dt.lebenindeutschland.MainActivity
import com.dt.lebenindeutschland.R
import com.dt.lebenindeutschland.utility.Question


var testResult: ArrayList<Question> = arrayListOf()

class ResultActivity : AppCompatActivity() {

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: ResultsRecycleviewAdapter
    private lateinit var resultsRecyclerView: RecyclerView
    private lateinit var backArrow : ImageView
    private lateinit var resultButton: Button
    private lateinit var resultPage: LinearLayout
    private lateinit var resultImg300: ImageView
    private lateinit var resultImgState: ImageView
    private lateinit var textResultRichtihe300: TextView
    private lateinit var textResultRichtigeState: TextView
    private lateinit var textResultFalche300: TextView
    private lateinit var textResultFalcheState: TextView
    private lateinit var textResultEmpty300: TextView
    private lateinit var textResultEmptyState: TextView
    private lateinit var textResultSuccess: TextView
    private var userTrueAnswers: Int = 0
    private var userFalseAnswers: Int = 0
    private var userEmptyAnswers = 0
    private var userTrueAnswersState: Int = 0
    private  var userFalseAnswersState: Int = 0
    private var userEmptyAnswersState = 0
    private var showQuestion = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        resultsRecyclerView = findViewById(R.id.resultsRecyclerView)
        linearLayoutManager = LinearLayoutManager(this)
        resultsRecyclerView.layoutManager = linearLayoutManager
        calculateResults()
        initilaize()
        if(userTrueAnswers>=15) resultImg300.setImageResource(R.drawable.ic_success) else resultImg300.setImageResource(R.drawable.ic_fail)

    }

    private fun calculateResults() {
        for (question in testResult){
            if (question.trueAnswer == question.userAnswer){
                if (question.themaId != 0) userTrueAnswers++ else userTrueAnswersState++
            } else if (question.userAnswer != null){
                if (question.themaId !=0) userFalseAnswers++ else userFalseAnswersState++
            } else if (question.themaId !=0) userEmptyAnswers++ else userEmptyAnswersState++
                    }
    }

    @SuppressLint("SetTextI18n")
    private fun initilaize() {
        adapter = ResultsRecycleviewAdapter(testResult)
        resultsRecyclerView.adapter = adapter
        resultPage = findViewById(R.id.resultPage)
        backArrow = findViewById(R.id.resultBackArrow)
        backArrow.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }
        resultButton = findViewById(R.id.resultButton)
        resultButton.setOnClickListener{
            showQuestion = !showQuestion
            if(showQuestion) {
                resultsRecyclerView.visibility =  View.VISIBLE
                resultPage.visibility = View.GONE
                resultButton.text = getString(R.string.show_result)
            } else {
                resultsRecyclerView.visibility =  View.GONE
                resultPage.visibility = View.VISIBLE
                resultButton.text = getString(R.string.show_questions)
            }
        }
        resultImg300 = findViewById(R.id.resultImg300)

        resultImgState = findViewById(R.id.resultImgState)
        textResultRichtihe300 = findViewById(R.id.textResultRichtihe300)
        textResultRichtihe300.text = userTrueAnswers.toString()
        textResultRichtigeState = findViewById(R.id.textResultRichtigeState)
        textResultRichtigeState.text = userTrueAnswersState.toString()
        textResultFalche300 = findViewById(R.id.textResultFalche300)
        textResultFalche300.text = userFalseAnswers.toString()
        textResultFalcheState = findViewById(R.id.textResultFalcheState)
        textResultFalcheState.text = userFalseAnswersState.toString()
        textResultEmpty300 = findViewById(R.id.textResultEmpty300)
        textResultEmpty300.text = userEmptyAnswers.toString()
        textResultEmptyState = findViewById(R.id.textResultEmptyState)
        textResultEmptyState.text = userEmptyAnswersState.toString()
        textResultSuccess = findViewById(R.id.textResultSuccess)
        textResultSuccess.text = if (userTrueAnswers>=15 && userTrueAnswersState>=2) getString(R.string.congratulations) else getString(
                    R.string.sackd)
    }
}

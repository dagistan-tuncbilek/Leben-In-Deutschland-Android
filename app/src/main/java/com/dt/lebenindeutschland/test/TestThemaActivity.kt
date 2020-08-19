package com.dt.lebenindeutschland.test

import Question
import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.dt.lebenindeutschland.R
import com.dt.lebenindeutschland.data.Thema
import com.dt.lebenindeutschland.data.readData
import com.dt.lebenindeutschland.data.selectedThema
import com.dt.lebenindeutschland.selectedState

class TestThemaActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var questionList: MutableList<Question>
    private var index: Int = 0
    private var questionChecked: Boolean = false
    private val colorTrue = Color.rgb(197, 255, 168)
    private val colorFalse  = Color.rgb(217, 217, 217)
    private val colorWhite  = Color.rgb(255, 255, 255)
    private lateinit var testThemaSubText:TextView
    private lateinit var testThemaQuestion: TextView
    private lateinit var testThemaAnswerA: CheckBox
    private lateinit var testThemaAnswerB: CheckBox
    private lateinit var testThemaAnswerC: CheckBox
    private lateinit var testThemaAnswerD: CheckBox
    private lateinit var testImgQestion: ImageView
    private lateinit var btnTestPrevious: Button
    private lateinit var btnTestNext: Button
    private lateinit var testThemaBackArrow: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_thema)
        initialize()
        createQuestionList()
    }

    private fun createQuestionList() {
        val remainingQuestionList: List<Question> = getQuestionList().filter { !it.learned }
        questionList = if (remainingQuestionList.count()>0) remainingQuestionList as MutableList<Question>
                else getQuestionList()
        setQuestion()
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.testThemaBackArrow -> {
                    startActivity(Intent(this, TestActivity::class.java))
                }

                R.id.btnTestNext -> {
                    if (questionList.count() > index+1) {
                        index++
                        setQuestion()
                    } else Toast.makeText(this, "Dies ist die letzte Frage", Toast.LENGTH_LONG).show()
                }

                R.id.btnTestPrevious -> {
                    if (index > 0) {
                        index--
                        setQuestion()
                    } else Toast.makeText(this, "Dies ist die erste Frage", Toast.LENGTH_LONG).show()
                }

                R.id.testThemaAnswerA -> {
                    testThemaAnswerA.isChecked = true
                    testThemaAnswerB.isChecked = false
                    testThemaAnswerC.isChecked = false
                    testThemaAnswerD.isChecked = false
                    if (questionList[index].trueAnswer == 'A'){
                        testThemaAnswerA.setBackgroundColor(colorTrue)
                        if(!questionChecked) questionList[index].learned = true
                    } else {
                        testThemaAnswerA.setBackgroundColor(colorFalse)
                        questionList[index].learned = false
                    }
                    testThemaAnswerB.setBackgroundColor(colorWhite)
                    testThemaAnswerC.setBackgroundColor(colorWhite)
                    testThemaAnswerD.setBackgroundColor(colorWhite)
                    if(!questionChecked) questionChecked = true
                }
                R.id.testThemaAnswerB -> {
                    testThemaAnswerA.isChecked = false
                    testThemaAnswerB.isChecked = true
                    testThemaAnswerC.isChecked = false
                    testThemaAnswerD.isChecked = false
                    if (questionList[index].trueAnswer == 'B'){
                        testThemaAnswerB.setBackgroundColor(colorTrue)
                        if(!questionChecked) questionList[index].learned = true
                    } else {
                        testThemaAnswerB.setBackgroundColor(colorFalse)
                        questionList[index].learned = false
                    }
                    testThemaAnswerA.setBackgroundColor(colorWhite)
                    testThemaAnswerC.setBackgroundColor(colorWhite)
                    testThemaAnswerD.setBackgroundColor(colorWhite)
                    if(!questionChecked) questionChecked = true
                }
                R.id.testThemaAnswerC -> {
                    testThemaAnswerA.isChecked = false
                    testThemaAnswerB.isChecked = false
                    testThemaAnswerC.isChecked = true
                    testThemaAnswerD.isChecked = false
                    if (questionList[index].trueAnswer == 'C'){
                        testThemaAnswerC.setBackgroundColor(colorTrue)
                        if(!questionChecked) questionList[index].learned = true
                    } else {
                        testThemaAnswerC.setBackgroundColor(colorFalse)
                        questionList[index].learned = false
                    }
                    testThemaAnswerB.setBackgroundColor(colorWhite)
                    testThemaAnswerA.setBackgroundColor(colorWhite)
                    testThemaAnswerD.setBackgroundColor(colorWhite)
                    if(!questionChecked) questionChecked = true
                }
                R.id.testThemaAnswerD -> {
                    testThemaAnswerA.isChecked = false
                    testThemaAnswerB.isChecked = false
                    testThemaAnswerC.isChecked = false
                    testThemaAnswerD.isChecked = true
                    if (questionList[index].trueAnswer == 'D'){
                        testThemaAnswerD.setBackgroundColor(colorTrue)
                        if(!questionChecked) questionList[index].learned = true
                    } else {
                        testThemaAnswerD.setBackgroundColor(colorFalse)
                        questionList[index].learned = false
                    }
                    testThemaAnswerB.setBackgroundColor(colorWhite)
                    testThemaAnswerC.setBackgroundColor(colorWhite)
                    testThemaAnswerA.setBackgroundColor(colorWhite)
                    if(!questionChecked) questionChecked = true
                }
            }
        }
    }

    @SuppressLint("SetTextI18n", "UseCompatLoadingForDrawables")
    private fun setQuestion() {
        testThemaSubText.text = selectedThema.getThemaName()
        testThemaAnswerA.isChecked = false
        testThemaAnswerB.isChecked = false
        testThemaAnswerC.isChecked = false
        testThemaAnswerD.isChecked = false
        testThemaAnswerA.setBackgroundColor(colorWhite)
        testThemaAnswerB.setBackgroundColor(colorWhite)
        testThemaAnswerC.setBackgroundColor(colorWhite)
        testThemaAnswerD.setBackgroundColor(colorWhite)
        testThemaQuestion.text = "*  ${questionList[index].question}"
        testThemaAnswerA.text = " A. ${questionList[index].answerA}"
        testThemaAnswerB.text = " B. ${questionList[index].answerB}"
        testThemaAnswerC.text = " C. ${questionList[index].answerC}"
        testThemaAnswerD.text = " D. ${questionList[index].answerD}"
        if (questionList[index].hasPhoto) {
            testImgQestion.visibility = View.VISIBLE
            val imageName = "i${questionList[index].id}"
            val number : Int = resources.getIdentifier(
                imageName,
                "drawable",
                packageName
            )
            @Suppress("DEPRECATION") val res = resources.getDrawable(number)
            testImgQestion.setImageDrawable(res)
        } else {
            testImgQestion.visibility = View.GONE
        }
    }



    private fun initialize() {
        testThemaSubText = findViewById(R.id.testThemaSubText)
        testThemaSubText.setOnClickListener(this)
        testThemaQuestion = findViewById(R.id.testThemaQuestion)
        testThemaAnswerA = findViewById(R.id.testThemaAnswerA)
        testThemaAnswerA.setOnClickListener(this)
        testThemaAnswerB = findViewById(R.id.testThemaAnswerB)
        testThemaAnswerB.setOnClickListener(this)
        testThemaAnswerC = findViewById(R.id.testThemaAnswerC)
        testThemaAnswerC.setOnClickListener(this)
        testThemaAnswerD = findViewById(R.id.testThemaAnswerD)
        testThemaAnswerD.setOnClickListener(this)
        testImgQestion = findViewById(R.id.testImgQestion)
        btnTestPrevious = findViewById(R.id.btnTestPrevious)
        btnTestPrevious.setOnClickListener(this)
        btnTestNext = findViewById(R.id.btnTestNext)
        btnTestNext.setOnClickListener(this)
        testThemaBackArrow = findViewById(R.id.testThemaBackArrow)
        testThemaBackArrow.setOnClickListener(this)
    }
}

private fun getQuestionList(): MutableList<Question> {
    val questionList: List<Question> = readData()
    val selectedList: MutableList<Question> = mutableListOf()
    if (selectedThema == Thema.BUNDESLANDER){
        for (i in 0..9){
            selectedList.add(questionList[selectedState.getQuestionNumber() + i])
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
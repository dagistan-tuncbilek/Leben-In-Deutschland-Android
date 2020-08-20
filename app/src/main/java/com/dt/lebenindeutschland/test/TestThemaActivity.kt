package com.dt.lebenindeutschland.test

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.dt.lebenindeutschland.R
import com.dt.lebenindeutschland.data.*
import com.dt.lebenindeutschland.selectedState

class TestThemaActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var questionList: ArrayList<Question>
    private val db: DataBaseHandler = DataBaseHandler(this)
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
        val remainingQuestionList: List<Question> = getQuestionList().filter { !it.isLearned }
        questionList = if (remainingQuestionList.count()>0) remainingQuestionList as ArrayList<Question>
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
                    if (questionList[index].trueAnswer == "A"){
                        testThemaAnswerA.setBackgroundColor(colorTrue)
                        setQuestionLearned()
                    } else {
                        testThemaAnswerA.setBackgroundColor(colorFalse)
                        setQuestionNotLearned()
                    }
                    testThemaAnswerB.setBackgroundColor(colorWhite)
                    testThemaAnswerC.setBackgroundColor(colorWhite)
                    testThemaAnswerD.setBackgroundColor(colorWhite)
                }
                R.id.testThemaAnswerB -> {
                    testThemaAnswerA.isChecked = false
                    testThemaAnswerB.isChecked = true
                    testThemaAnswerC.isChecked = false
                    testThemaAnswerD.isChecked = false
                    if (questionList[index].trueAnswer == "B"){
                        testThemaAnswerB.setBackgroundColor(colorTrue)
                        setQuestionLearned()
                    } else {
                        testThemaAnswerB.setBackgroundColor(colorFalse)
                        setQuestionNotLearned()
                    }
                    testThemaAnswerA.setBackgroundColor(colorWhite)
                    testThemaAnswerC.setBackgroundColor(colorWhite)
                    testThemaAnswerD.setBackgroundColor(colorWhite)
                }
                R.id.testThemaAnswerC -> {
                    testThemaAnswerA.isChecked = false
                    testThemaAnswerB.isChecked = false
                    testThemaAnswerC.isChecked = true
                    testThemaAnswerD.isChecked = false
                    if (questionList[index].trueAnswer == "C"){
                        testThemaAnswerC.setBackgroundColor(colorTrue)
                        setQuestionLearned()
                    } else {
                        testThemaAnswerC.setBackgroundColor(colorFalse)
                        setQuestionNotLearned()
                    }
                    testThemaAnswerB.setBackgroundColor(colorWhite)
                    testThemaAnswerA.setBackgroundColor(colorWhite)
                    testThemaAnswerD.setBackgroundColor(colorWhite)
                }
                R.id.testThemaAnswerD -> {
                    testThemaAnswerA.isChecked = false
                    testThemaAnswerB.isChecked = false
                    testThemaAnswerC.isChecked = false
                    testThemaAnswerD.isChecked = true
                    if (questionList[index].trueAnswer == "D"){
                        testThemaAnswerD.setBackgroundColor(colorTrue)
                        setQuestionLearned()
                    } else {
                        testThemaAnswerD.setBackgroundColor(colorFalse)
                        setQuestionNotLearned()
                    }
                    testThemaAnswerB.setBackgroundColor(colorWhite)
                    testThemaAnswerC.setBackgroundColor(colorWhite)
                    testThemaAnswerA.setBackgroundColor(colorWhite)
                }
            }
        }
    }

    private fun setQuestionNotLearned() {
        if (questionList[index].isLearned == true) {
            questionList[index].isLearned = false
            db.updateData(questionList[index].id, false)
        }
        questionChecked = true
    }

    private fun setQuestionLearned() {
        if (questionList[index].isLearned == false && !questionChecked) {
            questionList[index].isLearned = true
            db.updateData(questionList[index].id, true)
        }
        questionChecked = true
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
        testThemaQuestion.text = "${questionList[index].id}  ${questionList[index].question}"
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
        questionChecked = false
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

    private fun getQuestionList(): ArrayList<Question> {
        return if (selectedThema == Thema.BUNDESLANDER)
            db.readSelectedData(IntArray(10, { it + selectedState.getQuestionNumber() + 1 }))
         else
            db.readSelectedData(selectedThema.getThemaQuestionIdList())
    }
}
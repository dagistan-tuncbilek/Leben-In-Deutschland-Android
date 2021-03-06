package com.dt.lebenindeutschland.test

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Configuration
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.widget.Toolbar
import com.dt.lebenindeutschland.R
import com.dt.lebenindeutschland.utility.*
import com.dt.lebenindeutschland.selectedState
import java.util.*
import kotlin.collections.ArrayList

class TestThemeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var questionList: ArrayList<Question>
    private val db: DataBaseHandler = DataBaseHandler(this)
    private var index: Int = 0
    private var questionChecked: Boolean = false
    private val colorTrue = Color.rgb(83, 250, 80)
    private val colorFalse  = Color.rgb(255, 0, 0)
    private val colorWhite  = Color.rgb(255, 255, 255)
    private lateinit var testThemaToolbar:Toolbar
    private lateinit var testThemaQuestion: TextView
    private lateinit var testThemaAnswerA: CheckBox
    private lateinit var testThemaAnswerB: CheckBox
    private lateinit var testThemaAnswerC: CheckBox
    private lateinit var testThemaAnswerD: CheckBox
    private lateinit var testImgQestion: ImageView
    private lateinit var btnTestPrevious: Button
    private lateinit var btnTestNext: Button
    private lateinit var testThemaBackArrow: ImageView
    private lateinit var testThemaSuccessText: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLanguage()
        setContentView(R.layout.activity_test_theme)
        initialize()
        createQuestionList()
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

    private fun createQuestionList() {
        val remainingQuestionList: List<Question> = getQuestionList().filter { !it.isLearned }
        questionList = if (remainingQuestionList.count()>0) remainingQuestionList as ArrayList<Question>
                else getQuestionList()
        questionList.shuffle()
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
                    } else startActivity(Intent(this, TestActivity::class.java))
                    btnTestNext.text = if (questionList.count() == index+1) getString(R.string.finish) else getString(R.string.next)
                }

                R.id.btnTestPrevious -> {
                    if (index > 0) {
                        index--
                        setQuestion()
                    } else Toast.makeText(this, R.string.first_question, Toast.LENGTH_LONG).show()
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
        if (questionList[index].isLearned) {
            questionList[index].isLearned = false
            db.updateData(questionList[index].id, false)
        }
        questionChecked = true
    }

    private fun setQuestionLearned() {
        if (!questionList[index].isLearned && !questionChecked) {
            questionList[index].isLearned = true
            db.updateData(questionList[index].id, true)
        }
        questionChecked = true
    }

    @SuppressLint("SetTextI18n", "UseCompatLoadingForDrawables")
    private fun setQuestion() {
        if (selectedThema == Thema.BUNDESLANDER) testThemaToolbar.subtitle = selectedState.getStateName()
        else testThemaToolbar.subtitle = selectedThema.getThemeName()
        testThemaAnswerA.isChecked = false
        testThemaAnswerB.isChecked = false
        testThemaAnswerC.isChecked = false
        testThemaAnswerD.isChecked = false
        testThemaAnswerA.setBackgroundColor(colorWhite)
        testThemaAnswerB.setBackgroundColor(colorWhite)
        testThemaAnswerC.setBackgroundColor(colorWhite)
        testThemaAnswerD.setBackgroundColor(colorWhite)
        testThemaQuestion.text = "${index+1}. ${questionList[index].question}"
        testThemaAnswerA.text = questionList[index].answerA
        testThemaAnswerB.text = questionList[index].answerB
        testThemaAnswerC.text = questionList[index].answerC
        testThemaAnswerD.text = questionList[index].answerD
        testThemaSuccessText.text = "${getString(R.string.success_explanation)} ${questionList[index].success}"
        if (questionList[index].hasPhoto) {
            testImgQestion.visibility = View.VISIBLE
            val imageName = "i${questionList[index].id}"
            val number : Int = resources.getIdentifier(
                imageName,
                "mipmap",
                packageName
            )
            val res = resources.getDrawable(number, this.theme)
            testImgQestion.setImageDrawable(res)
        } else {
            testImgQestion.visibility = View.GONE
        }
        questionChecked = false
    }
    
    private fun initialize() {
        testThemaToolbar = findViewById(R.id.testThemaToolbar)
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
        testThemaSuccessText = findViewById(R.id.testThemaSuccessText)
    }

    private fun getQuestionList(): ArrayList<Question> {
        return if (selectedThema == Thema.BUNDESLANDER)
            db.readSelectedData(IntArray(10){ it + selectedState.ordinal*10 + 301 })
         else
            db.readSelectedData(selectedThema.getThemeQuestionIdList())
    }
}
package com.dt.lebenindeutschland.exam

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.dt.lebenindeutschland.MainActivity
import com.dt.lebenindeutschland.R
import com.dt.lebenindeutschland.selectedState
import com.dt.lebenindeutschland.utility.DataBaseHandler
import com.dt.lebenindeutschland.utility.Question

class ExamActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var questionList: ArrayList<Question>
    private lateinit var examBackArrow: ImageView
    private lateinit var examToolbar: Toolbar
    private lateinit var examQuestion: TextView
    private lateinit var examAnswerA: CheckBox
    private lateinit var examAnswerB: CheckBox
    private lateinit var examAnswerC: CheckBox
    private lateinit var examAnswerD: CheckBox
    private lateinit var examQuestionFoto: ImageView
    private lateinit var btnExamPrevious: Button
    private lateinit var btnExamNext: Button
    private lateinit var btnExamFinish: Button
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam)
        initialize()
        createExam()
        setQuestion()
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.examBackArrow -> startActivity(Intent(this, MainActivity::class.java))
            R.id.btnExamNext -> {
                if (questionList.count() > index+1) {
                    index++
                    setQuestion()
                } else Toast.makeText(this, getString(R.string.last_question), Toast.LENGTH_LONG).show()
            }
            R.id.btnExamPrevious -> {
                if (index > 0) {
                    index--
                    setQuestion()
                } else Toast.makeText(this, getString(R.string.first_question), Toast.LENGTH_LONG).show()
            }
            R.id.btnExamFinish -> {
                val dialog = AlertDialog.Builder(this)
                    .setTitle(getString(R.string.end_the_exam))
                    .setPositiveButton("Ja"
                    ) { _: DialogInterface, _: Int ->
                        run {
                            testResult = ArrayList(questionList)
                            startActivity(Intent(this, ResultActivity::class.java))
                        }
                    }
                    .setNegativeButton("Nein"
                    ){ _: DialogInterface, _: Int -> }
                    .create()
                dialog.setOnShowListener {
                    dialog.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(Color.BLUE)
                    dialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(Color.BLUE)
                }
                dialog.show()
            }
            R.id.examAnswerA -> {
                examAnswerA.isChecked = true
                questionList[index].userAnswer = "A"
                examAnswerB.isChecked = false
                examAnswerC.isChecked = false
                examAnswerD.isChecked = false
            }
            R.id.examAnswerB -> {
                examAnswerB.isChecked = true
                questionList[index].userAnswer = "B"
                examAnswerA.isChecked = false
                examAnswerC.isChecked = false
                examAnswerD.isChecked = false
            }
            R.id.examAnswerC -> {
                examAnswerC.isChecked = true
                questionList[index].userAnswer = "C"
                examAnswerB.isChecked = false
                examAnswerA.isChecked = false
                examAnswerD.isChecked = false
            }
            R.id.examAnswerD -> {
                examAnswerD.isChecked = true
                questionList[index].userAnswer = "D"
                examAnswerB.isChecked = false
                examAnswerC.isChecked = false
                examAnswerA.isChecked = false
            }
        }
    }

    @SuppressLint("SetTextI18n", "UseCompatLoadingForDrawables")
    private fun setQuestion() {
        examToolbar.subtitle = if (questionList[index].themaId == 0) getString(R.string.state_questions) else getString(R.string.general_questions)
        examAnswerA.isChecked = false
        examAnswerB.isChecked = false
        examAnswerC.isChecked = false
        examAnswerD.isChecked = false
        when (questionList[index].userAnswer){
            "A" -> examAnswerA.isChecked = true
            "B" -> examAnswerB.isChecked = true
            "C" -> examAnswerC.isChecked = true
            "D" -> examAnswerD.isChecked = true
        }
        examQuestion.text = "${index+1}. ${questionList[index].question}"
        examAnswerA.text = questionList[index].answerA
        examAnswerB.text = questionList[index].answerB
        examAnswerC.text = questionList[index].answerC
        examAnswerD.text = questionList[index].answerD
        if (questionList[index].hasPhoto) {
            examQuestionFoto.visibility = View.VISIBLE
            val imageName = "i${questionList[index].id}"
            val number = resources.getIdentifier(imageName,"drawable", packageName)
            val res = resources.getDrawable(number, this.theme)
            examQuestionFoto.setImageDrawable(res)
        } else {
            examQuestionFoto.visibility = View.GONE
        }
    }

    private fun createExam() {
        val idArray = IntArray(33) { -1 }
        var counter = 0
        while(counter<30){
            val i = (1 until 301).random()
            if (!idArray.contains(i)) idArray[counter++]=i
        }
        while(counter<33){
            val i = (301+selectedState.ordinal*10 until 311+selectedState.ordinal*10).random()
            if (!idArray.contains(i)) idArray[counter++]=i
        }
        questionList = DataBaseHandler(this).readSelectedData(idArray)
        questionList.shuffle()
    }

    private fun initialize() {
        examBackArrow = findViewById(R.id.examBackArrow)
        examBackArrow.setOnClickListener(this)
        examToolbar = findViewById(R.id.examToolbar)
        examQuestion = findViewById(R.id.examQuestion)
        examAnswerA = findViewById(R.id.examAnswerA)
        examAnswerA.setOnClickListener(this)
        examAnswerB = findViewById(R.id.examAnswerB)
        examAnswerB.setOnClickListener(this)
        examAnswerC = findViewById(R.id.examAnswerC)
        examAnswerC.setOnClickListener(this)
        examAnswerD = findViewById(R.id.examAnswerD)
        examAnswerD.setOnClickListener(this)
        examQuestionFoto = findViewById(R.id.examQuestionFoto)
        examQuestionFoto.setOnClickListener(this)
        btnExamPrevious = findViewById(R.id.btnExamPrevious)
        btnExamPrevious.setOnClickListener(this)
        btnExamNext = findViewById(R.id.btnExamNext)
        btnExamNext.setOnClickListener(this)
        btnExamFinish = findViewById(R.id.btnExamFinish)
        btnExamFinish.setOnClickListener(this)
    }
}
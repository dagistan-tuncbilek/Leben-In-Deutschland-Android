package com.dt.lebenindeutschland.exam

import com.dt.lebenindeutschland.utility.Question
import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dt.lebenindeutschland.R

class ResultsRecycleviewAdapter(private val list: ArrayList<Question>) :
    RecyclerView.Adapter<ResultsRecycleviewAdapter.ViewHolder>() {

    lateinit var context: Context
    private val colorTrue = Color.rgb(83, 250, 80)
    private val colorFalse  = Color.rgb(255, 0, 0)
    private val colorWhite  = Color.rgb(255, 255, 255)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val view: View = LayoutInflater.from(parent.context).inflate(
            R.layout.list_item_results,
            parent,
            false
        )
        val holder = ViewHolder(view)
        context = parent.context
        return holder
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    @SuppressLint("UseCompatLoadingForDrawables", "SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, i: Int) {
        holder.resultTextQuestion.text = "${i+1}. ${list[i].question}"
        holder.resultTextAnswerA.text = "${list[i].answerA}"
        holder.resultTextAnswerB.text = "${list[i].answerB}"
        holder.resultTextAnswerC.text = "${list[i].answerC}"
        holder.resultTextAnswerD.text = "${list[i].answerD}"

        holder.resultTextAnswerA.isChecked = false
        holder.resultTextAnswerB.isChecked = false
        holder.resultTextAnswerC.isChecked = false
        holder.resultTextAnswerD.isChecked = false

        holder.resultTextAnswerA.setBackgroundColor(colorWhite)
        holder.resultTextAnswerB.setBackgroundColor(colorWhite)
        holder.resultTextAnswerC.setBackgroundColor(colorWhite)
        holder.resultTextAnswerD.setBackgroundColor(colorWhite)

        when (list[i].trueAnswer) {
            "A" -> holder.resultTextAnswerA.isChecked = true
            "B" -> holder.resultTextAnswerB.isChecked = true
            "C" -> holder.resultTextAnswerC.isChecked = true
            "D" -> holder.resultTextAnswerD.isChecked = true
        }

        holder.resultTextAnswerA.isClickable = false
        holder.resultTextAnswerB.isClickable = false
        holder.resultTextAnswerC.isClickable = false
        holder.resultTextAnswerD.isClickable = false

        when (list[i].userAnswer) {
            "A" -> if (list[i].trueAnswer == "A") holder.resultTextAnswerA.setBackgroundColor(colorTrue)
                else holder.resultTextAnswerA.setBackgroundColor(colorFalse)
            "B" -> if (list[i].trueAnswer == "B") holder.resultTextAnswerB.setBackgroundColor(colorTrue)
                else holder.resultTextAnswerB.setBackgroundColor(colorFalse)
            "C" -> if (list[i].trueAnswer == "C") holder.resultTextAnswerC.setBackgroundColor(colorTrue)
                else holder.resultTextAnswerC.setBackgroundColor(colorFalse)
            "D" -> if (list[i].trueAnswer == "D") holder.resultTextAnswerD.setBackgroundColor(colorTrue)
                else holder.resultTextAnswerD.setBackgroundColor(colorFalse)
        }

        if (list[i].hasPhoto) {
            holder.resultImgQestion.visibility = View.VISIBLE
            val imageName = "i${list[i].id}"
            val number : Int = context.resources.getIdentifier(imageName,"drawable",context.packageName)
            val res = context.resources.getDrawable(number, context.theme)
            holder.resultImgQestion.setImageDrawable(res)
        } else {
            holder.resultImgQestion.visibility = View.GONE
        }
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val resultTextQuestion: TextView = itemView.findViewById((R.id.resultTextQuestion))
        val resultTextAnswerA: CheckBox = itemView.findViewById((R.id.resultTextAnswerA))
        val resultTextAnswerB: CheckBox = itemView.findViewById((R.id.resultTextAnswerB))
        val resultTextAnswerC: CheckBox = itemView.findViewById((R.id.resultTextAnswerC))
        val resultTextAnswerD: CheckBox = itemView.findViewById((R.id.resultTextAnswerD))
        val resultImgQestion: ImageView = itemView.findViewById((R.id.resultImgQestion))
    }
}
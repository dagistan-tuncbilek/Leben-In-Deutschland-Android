package com.dt.lebenindeutschland.learn

import com.dt.lebenindeutschland.utility.Question
import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dt.lebenindeutschland.R

class LearnThemaRecycleviewAdapter(private val list: List<Question>) :
    RecyclerView.Adapter<LearnThemaRecycleviewAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(
            R.layout.list_item_learn_thema,
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
        holder.themaTextQuestion.text = "${i+1}. ${list[i].question}"
        holder.themaTextAnswerA.text = "A. ${list[i].answerA}"
        holder.themaTextAnswerB.text = "B. ${list[i].answerB}"
        holder.themaTextAnswerC.text = "C. ${list[i].answerC}"
        holder.themaTextAnswerD.text = "D. ${list[i].answerD}"

        when (list[i].trueAnswer) {
            "A" -> {
                holder.themaTextAnswerA.setBackgroundColor(Color.rgb(207, 255, 254))
                holder.themaTextAnswerB.setBackgroundColor(Color.WHITE)
                holder.themaTextAnswerC.setBackgroundColor(Color.WHITE)
                holder.themaTextAnswerD.setBackgroundColor(Color.WHITE)
            }
            "B" -> {
                holder.themaTextAnswerB.setBackgroundColor(Color.rgb(207, 255, 254))
                holder.themaTextAnswerA.setBackgroundColor(Color.WHITE)
                holder.themaTextAnswerC.setBackgroundColor(Color.WHITE)
                holder.themaTextAnswerD.setBackgroundColor(Color.WHITE)
            }
            "C" -> {
                holder.themaTextAnswerC.setBackgroundColor(Color.rgb(207, 255, 254))
                holder.themaTextAnswerB.setBackgroundColor(Color.WHITE)
                holder.themaTextAnswerA.setBackgroundColor(Color.WHITE)
                holder.themaTextAnswerD.setBackgroundColor(Color.WHITE)
            }
            "D" -> {
                holder.themaTextAnswerD.setBackgroundColor(Color.rgb(207, 255, 254))
                holder.themaTextAnswerB.setBackgroundColor(Color.WHITE)
                holder.themaTextAnswerC.setBackgroundColor(Color.WHITE)
                holder.themaTextAnswerA.setBackgroundColor(Color.WHITE)
            }
        }
        if (list[i].hasPhoto) {
            holder.themaImgQestion.visibility = View.VISIBLE
            val imageName = "i${list[i].id}"
            val number : Int = context.resources.getIdentifier(
                imageName,
                "drawable",
                context.packageName
            )
            @Suppress("DEPRECATION") val res = context.resources.getDrawable(number)
            holder.themaImgQestion.setImageDrawable(res)
        } else {
            holder.themaImgQestion.visibility = View.GONE
        }
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val themaTextQuestion: TextView = itemView.findViewById((R.id.themaTextQuestion))
        val themaTextAnswerA: TextView = itemView.findViewById((R.id.themaTextAnswerA))
        val themaTextAnswerB: TextView = itemView.findViewById((R.id.themaTextAnswerB))
        val themaTextAnswerC: TextView = itemView.findViewById((R.id.themaTextAnswerC))
        val themaTextAnswerD: TextView = itemView.findViewById((R.id.themaTextAnswerD))
        val themaImgQestion: ImageView = itemView.findViewById((R.id.themaImgQestion))
    }
}
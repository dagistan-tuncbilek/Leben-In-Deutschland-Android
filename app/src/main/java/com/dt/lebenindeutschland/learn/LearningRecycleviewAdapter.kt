package com.dt.lebenindeutschland.learn

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.dt.lebenindeutschland.R
import com.dt.lebenindeutschland.utility.Thema
import com.dt.lebenindeutschland.utility.ThemaData
import com.dt.lebenindeutschland.utility.selectedThema

class LearningRecycleviewAdapter(private val list: List<ThemaData>) :
    RecyclerView.Adapter<LearningRecycleviewAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_learning, parent, false)
        val holder = ViewHolder(view)
        context = parent.context
        return holder
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, i: Int) {
        holder.themaNameLearnTxt.text = list[i].themaName
        holder.themaCountLearnTxt.text = "${list[i].max}"
        if (i % 2 == 0) {
            holder.parent.setCardBackgroundColor(Color.rgb(255, 255, 255))
        } else {
            holder.parent.setCardBackgroundColor(Color.rgb(245, 245, 245))
        }
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        var parent: CardView = itemView.findViewById(R.id.themaLearnCard)
        var themaNameLearnTxt: TextView = itemView.findViewById(R.id.themaNameLearnTxt)
        var themaCountLearnTxt: TextView = itemView.findViewById(R.id.themaCountLearnTxt)

        init {
            parent.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            if (v != null) {
                when (adapterPosition) {
                    0 -> selectedThema = Thema.BUNDESLANDER
                    1 -> selectedThema = Thema.VERFASSUNGSORGANE
                    2 -> selectedThema = Thema.VERFASSUNGSPRINZIPIEN
                    3 -> selectedThema = Thema.FEDERALISMUS
                    4 -> selectedThema = Thema.SOZIALSYSTEM
                    5 -> selectedThema = Thema.GRUNDRECHTE
                    6 -> selectedThema = Thema.WAHLEN
                    7 -> selectedThema = Thema.PARTEIEN
                    8 -> selectedThema = Thema.AUFGABEN
                    9 -> selectedThema = Thema.PFLICHTEN
                    10 -> selectedThema = Thema.STAATSSYMBOLE
                    11 -> selectedThema = Thema.KOMMUNE
                    12 -> selectedThema = Thema.RECHTUNDALLTAG
                    13 -> selectedThema = Thema.NATIONALSOZIALISMUS
                    14 -> selectedThema = Thema.NACH1945
                    15 -> selectedThema = Thema.WIEDERVEREINIGUNG
                    16 -> selectedThema = Thema.DEUTSCHLANDINEUROPA
                    17 -> selectedThema = Thema.RELIGIOSE
                    18 -> selectedThema = Thema.BILDUNG
                    19 -> selectedThema = Thema.MIGRATIONSGESCHICHTE
                    20 -> selectedThema = Thema.INTERKULTURELLES
                }
                v.context.startActivity(Intent(parent.context, ThemaActivity::class.java))
            }
        }
    }
}
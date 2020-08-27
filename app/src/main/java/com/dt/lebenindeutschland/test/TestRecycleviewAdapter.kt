package com.dt.lebenindeutschland.test

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.dt.lebenindeutschland.R
import com.dt.lebenindeutschland.utility.Thema
import com.dt.lebenindeutschland.utility.ThemaData
import com.dt.lebenindeutschland.utility.selectedThema

class TestRecycleviewAdapter (private val list: MutableList<ThemaData>) : RecyclerView.Adapter<TestRecycleviewAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_item_test, parent, false)
        val holder = ViewHolder(view)
        context = parent.context
        Log.d(TAG, " created")
        return holder
    }

    override fun getItemCount(): Int = this.list.count()

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, i: Int) {
        holder.themaTxtName.text = list[i].themaName
        holder.themaTxtPercentage.text = "${list[i].progress}/${list[i].max}"
        holder.themaProgress.max = list[i].max
        holder.themaProgress.progress = list[i].progress
    }

    class ViewHolder (v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        private var parent: CardView = itemView.findViewById(R.id.themaCard)
        var themaTxtName: TextView = itemView.findViewById(R.id.themaTxtName)
        var themaTxtPercentage: TextView = itemView.findViewById(R.id.themaTxtPercentage)
        var themaProgress: ProgressBar = itemView.findViewById(R.id.themaProgress)

        init {
            parent.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            when (adapterPosition){
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
            v?.context?.startActivity(Intent(parent.context, TestThemeActivity::class.java))
        }
    }

    companion object {
        private const val TAG = "TestRecycleviewAdapter"
    }
}
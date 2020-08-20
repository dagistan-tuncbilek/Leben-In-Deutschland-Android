package com.dt.lebenindeutschland.test

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
import com.dt.lebenindeutschland.data.ThemaData

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

    override fun onBindViewHolder(holder: ViewHolder, i: Int) {
        holder.themaTxtName.text = list[i].themaName
        holder.themaTxtPercentage.text = list[i].percentage
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
            // TODO selectedLand
            v?.context?.startActivity(Intent(parent.context, TestThemaActivity::class.java))
        }
    }

    companion object {
        private const val TAG = "TestRecycleviewAdapter"
    }
}
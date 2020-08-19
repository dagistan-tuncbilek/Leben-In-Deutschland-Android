package com.dt.lebenindeutschland.test

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.dt.lebenindeutschland.R
import com.dt.lebenindeutschland.data.ThemaData
import com.dt.lebenindeutschland.learn.LearningActivity
import com.dt.lebenindeutschland.learn.ThemaActivity

class TestRecycleviewAdapter (private val list: List<ThemaData>) : RecyclerView.Adapter<TestRecycleviewAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TestRecycleviewAdapter.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_item_test, parent, false)
        val holder: ViewHolder = ViewHolder(view)
        context = parent.context
        return holder
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: TestRecycleviewAdapter.ViewHolder, i: Int) {
        holder.themaTxtName.setText(list.get(i).themaName)
        holder.themaTxtPercentage.setText(list.get(i).percentage)
        holder.themaProgress.max = list.get(i).max
        holder.themaProgress.progress = list.get(i).progress
    }

    class ViewHolder (v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        var parent: CardView = itemView.findViewById(R.id.themaCard);
        var themaTxtName: TextView = itemView.findViewById(R.id.themaTxtName);
        var themaTxtPercentage: TextView = itemView.findViewById(R.id.themaTxtPercentage);
        var themaProgress: ProgressBar = itemView.findViewById(R.id.themaProgress);

        init {
            parent.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            if (v != null) {
                v.getContext().startActivity(Intent(parent.context, TestThemaActivity::class.java))
            }
        }

    }
}
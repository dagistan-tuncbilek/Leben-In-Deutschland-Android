package com.dt.lebenindeutschland.test

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.dt.lebenindeutschland.MainActivity
import com.dt.lebenindeutschland.R
import com.dt.lebenindeutschland.utility.DataBaseHandler
import com.dt.lebenindeutschland.utility.ThemaData
import com.dt.lebenindeutschland.utility.getThemasData
import com.dt.lebenindeutschland.selectedState
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var backArrow : ImageView
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: TestRecycleviewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        initialize()
    }

    private fun initialize() {
        linearLayoutManager = LinearLayoutManager(this)
        testRecyclerView.layoutManager = linearLayoutManager
        adapter = TestRecycleviewAdapter(createThemaData())
        testRecyclerView.adapter = adapter
        backArrow = findViewById(R.id.testBackArrow)
        backArrow.setOnClickListener(this)
        Log.d(TAG, " initialized")
    }

    private fun createThemaData(): ArrayList<ThemaData> {
        val testResultsById = DataBaseHandler(this).readTestResults()
        val themaDataById : ArrayList<ThemaData> = getThemasData()
        val arrayList = IntArray(10) { it + selectedState.ordinal*10 + 301 }
        for (i in testResultsById.indices){
            if (testResultsById[i].isLearned){
                if (testResultsById[i].themaId != 0) themaDataById[testResultsById[i].themaId].progress++
                else if (arrayList.contains(i+1) && testResultsById[i].isLearned) themaDataById[0].progress++
            }
        }
        return themaDataById
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.testBackArrow -> startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }

    companion object {
        private const val TAG = "TestActivity"
    }
}
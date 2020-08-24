package com.dt.lebenindeutschland

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.dt.lebenindeutschland.utility.DataBaseHandler
import com.dt.lebenindeutschland.utility.STATE_ID
import com.dt.lebenindeutschland.utility.State

var selectedState: State = State.NOT_SELECTED

class SelectStateActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var stateBackArrow: ImageView
    private lateinit var cardBaden: CardView
    private lateinit var cardBayern: CardView
    private lateinit var cardBerlin: CardView
    private lateinit var cardBrandenburg: CardView
    private lateinit var cardBremen: CardView
    private lateinit var cardHamburg: CardView
    private lateinit var cardHessen: CardView
    private lateinit var cardMeklenburg: CardView
    private lateinit var cardNiedersachsen: CardView
    private lateinit var cardNW: CardView
    private lateinit var cardRheinland: CardView
    private lateinit var cardSachsen: CardView
    private lateinit var cardSachsenAnhalt: CardView
    private lateinit var cardSaarland: CardView
    private lateinit var cardSchlewsig: CardView
    private lateinit var cardThrungen: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_state)
        initialize()
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.cardBaden -> selectedState = State.BADEN_WURTTEMBERG
                R.id.cardBayern -> selectedState = State.BAYERN
                R.id.cardBerlin -> selectedState = State.BERLIN
                R.id.cardBrandenburg -> selectedState = State.BRANDENBURG
                R.id.cardBremen -> selectedState = State.BREMEN
                R.id.cardHamburg -> selectedState = State.HAMBURG
                R.id.cardHessen -> selectedState = State.HESSEN
                R.id.cardMeklenburg -> selectedState = State.MECKLENBURG_VORPOMMERN
                R.id.cardNiedersachsen -> selectedState = State.NIEDERSACHSEN
                R.id.cardNW -> selectedState = State.NORDRHEIN_WESTFALEN
                R.id.cardRheinland -> selectedState = State.RHEINLAND_PFALZ
                R.id.cardSachsen -> selectedState = State.SACHSEN
                R.id.cardSachsenAnhalt -> selectedState = State.SACHSEN_ANHALT
                R.id.cardSaarland -> selectedState = State.SAARLAND
                R.id.cardSchlewsig -> selectedState = State.SCHLESWIG_HOLSTEIN
                R.id.cardThrungen -> selectedState = State.THURINGEN
            }
        }
        Log.d(TAG, " clicked")
        if (selectedState == State.NOT_SELECTED) {
            Toast.makeText(applicationContext, R.string.select_a_thema, Toast.LENGTH_SHORT)
                .show()
        } else {
            DataBaseHandler(this).updateUtilityData(STATE_ID, selectedState.ordinal)
            Log.d(TAG, "${selectedState.getStateName()} Selected ")
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    override fun onBackPressed() {
        if (selectedState == State.NOT_SELECTED) {
            Toast.makeText(applicationContext, R.string.select_a_thema, Toast.LENGTH_SHORT)
                .show()
            Log.d(TAG, " backpress suspended")
            return
        } else {
            finish()
        }
    }

    private fun initialize() {
        stateBackArrow = findViewById(R.id.stateBackArrow)
        stateBackArrow.setOnClickListener(this)
        cardBaden = findViewById(R.id.cardBaden)
        cardBaden.setOnClickListener(this)
        cardBayern = findViewById(R.id.cardBayern)
        cardBayern.setOnClickListener(this)
        cardBerlin = findViewById(R.id.cardBerlin)
        cardBerlin.setOnClickListener(this)
        cardBremen = findViewById(R.id.cardBremen)
        cardBremen.setOnClickListener(this)
        cardBrandenburg = findViewById(R.id.cardBrandenburg)
        cardBrandenburg.setOnClickListener(this)
        cardHamburg = findViewById(R.id.cardHamburg)
        cardHamburg.setOnClickListener(this)
        cardHessen = findViewById(R.id.cardHessen)
        cardHessen.setOnClickListener(this)
        cardMeklenburg = findViewById(R.id.cardMeklenburg)
        cardMeklenburg.setOnClickListener(this)
        cardNiedersachsen = findViewById(R.id.cardNiedersachsen)
        cardNiedersachsen.setOnClickListener(this)
        cardNW = findViewById(R.id.cardNW)
        cardNW.setOnClickListener(this)
        cardRheinland = findViewById(R.id.cardRheinland)
        cardRheinland.setOnClickListener(this)
        cardSachsen = findViewById(R.id.cardSachsen)
        cardSachsen.setOnClickListener(this)
        cardSachsenAnhalt = findViewById(R.id.cardSachsenAnhalt)
        cardSachsenAnhalt.setOnClickListener(this)
        cardSaarland = findViewById(R.id.cardSaarland)
        cardSaarland.setOnClickListener(this)
        cardSchlewsig = findViewById(R.id.cardSchlewsig)
        cardSchlewsig.setOnClickListener(this)
        cardThrungen = findViewById(R.id.cardThrungen)
        cardThrungen.setOnClickListener(this)
        Log.d(TAG, " initileized")
    }

    companion object {
        private const val TAG = "SelectStateActivity"
    }
}
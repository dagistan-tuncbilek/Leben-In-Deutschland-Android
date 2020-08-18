package com.dt.lebenindeutschland

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.dt.lebenindeutschland.data.State

var selectedState: State = State.NOT_SELECTED;

class SelectStateActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var stateBackArrow: ImageView
    lateinit var cardBaden: CardView
    lateinit var cardBayern: CardView
    lateinit var cardBerlin: CardView
    lateinit var cardBrandenburg: CardView
    lateinit var cardBremen: CardView
    lateinit var cardHamburg: CardView
    lateinit var cardHessen: CardView
    lateinit var cardMeklenburg: CardView
    lateinit var cardNiedersachsen: CardView
    lateinit var cardNW: CardView
    lateinit var cardRheinland: CardView
    lateinit var cardSachsen: CardView
    lateinit var cardSachsenAnhalt: CardView
    lateinit var cardSaarland: CardView
    lateinit var cardSchlewsig: CardView
    lateinit var cardThrungen: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_state)
        initialize()
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
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
        Toast.makeText(applicationContext, selectedState.getStateName()+" Selected",Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, MainActivity::class.java))
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
    }


}
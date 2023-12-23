package com.zz.iniapk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carAlpkt = findViewById<CardView>(R.id.cardAlpukat)
        val carJrk = findViewById<CardView>(R.id.cardJeruk)
        val carPsg = findViewById<CardView>(R.id.cardPisang)
        val carApl = findViewById<CardView>(R.id.cardapel)
        val carNg = findViewById<CardView>(R.id.cardnaga)
        val carNns = findViewById<CardView>(R.id.cardNanas)
        val carMngg = findViewById<CardView>(R.id.cardMangga)
        val carSmgk = findViewById<CardView>(R.id.cardSemangka)
        val carJmbbj = findViewById<CardView>(R.id.cardJambuBiji)
        val carStbr = findViewById<CardView>(R.id.cardStrawberi)
        val carAbout = findViewById<CardView>(R.id.cardAbout)



    carAlpkt.setOnClickListener {
        val intent = Intent(this, AlpukatActivity::class.java)
        startActivity(intent)
    }
        carJrk.setOnClickListener {
            val intent = Intent(this, JerukActivity::class.java)
            startActivity(intent)
        }
        carPsg.setOnClickListener {
            val intent = Intent(this, PisangActivity::class.java)
            startActivity(intent)
        }
        carApl.setOnClickListener {
            val intent = Intent(this, ApelActivity::class.java)
            startActivity(intent)
        }
        carNg.setOnClickListener {
            val intent = Intent(this, NagaActivity::class.java)
            startActivity(intent)
        }
        carNns.setOnClickListener {
            val intent = Intent(this, NanasActivity::class.java)
            startActivity(intent)
        }
        carMngg.setOnClickListener {
            val intent = Intent(this, ManggaActivity::class.java)
            startActivity(intent)
        }
        carSmgk.setOnClickListener {
            val intent = Intent(this, SemangkaActivity::class.java)
            startActivity(intent)
        }
        carJmbbj.setOnClickListener {
            val intent = Intent(this, JambuBjActivity::class.java)
            startActivity(intent)
        }
        carStbr.setOnClickListener {
            val intent = Intent(this, StroberiActivity::class.java)
            startActivity(intent)
        }
        carAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }

}
package com.example.bruuuhbutton

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_sound.setOnClickListener { onSound() }
    }
    fun onSound(){
        val text = "Будет звук Bruuh!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()

        val player = MediaPlayer.create(this, R.raw.bruh)
        player.start();
    }
}
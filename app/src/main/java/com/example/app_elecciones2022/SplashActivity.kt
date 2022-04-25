package com.example.app_elecciones2022

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.HandlerCompat.postDelayed


class SplashActivity : AppCompatActivity() {
    lateinit var  spot : MediaPlayer
    private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_splash)
// variables
        spot = MediaPlayer.create(this, R.raw.spot)
        handler = Handler(Looper.getMainLooper())
        spot.start()
        handler.postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            this.finish()
        },4000)


    }
}

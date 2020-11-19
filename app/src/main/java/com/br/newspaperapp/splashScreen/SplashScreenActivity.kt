package com.br.newspaperapp.splashScreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.br.newspaperapp.MainActivity
import com.br.newspaperapp.R

class SplashScreenActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed(
            {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            },
            SPLASH_TIME_OUT
        )
    }
}
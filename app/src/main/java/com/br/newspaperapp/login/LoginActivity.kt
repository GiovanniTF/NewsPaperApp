package com.br.newspaperapp.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.br.newspaperapp.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = Firebase.auth
    }

    public override fun onStart() {
        super.onStart()

        val currentUser = auth.currentUser
//        updateUI()
    }
}
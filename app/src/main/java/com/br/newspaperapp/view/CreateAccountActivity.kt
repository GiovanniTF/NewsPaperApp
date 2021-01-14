package com.br.newspaperapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.br.newspaperapp.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_create_account.*

class CreateAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        btn_createAccount.setOnClickListener {

            CreateUser()
        }
    }

    private fun CreateUser(){
        var email = edt_createAccount_email.text.toString()
        var password = edt_createAccount_password.text.toString()
        var messageIncomplete = txv_createAccount_msgIncomplete

        if(email.isEmpty() || password.isEmpty()){
            messageIncomplete.setText(R.string.login_emailPassword_incomplete)
        }else{
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email,password).addOnCompleteListener {
                if(it.isSuccessful){
                    Toast.makeText(this, R.string.login_createAccount_sucessful, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
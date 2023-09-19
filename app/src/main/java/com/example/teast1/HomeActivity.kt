package com.example.teast1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val register = findViewById<Button>(R.id.registerButton)

        val userlEditText = findViewById<EditText>(R.id.username)
        val passwordEditText = findViewById<EditText>(R.id.password)
        var loginButton = findViewById<Button>(R.id.Login)


        loginButton.setOnClickListener {

            if(userlEditText.text.isEmpty()){
                Toast.makeText(this, "please enter your username", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }



            else if(passwordEditText.text.isEmpty()){
                Toast.makeText(this, "please enter your password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }



            val text = passwordEditText.text.toString()

            var numCount = 0
            var capitalLetter = 0
            var smallLetter = 0
            var specialChar = 0

            for ( i in text){
                for ( j in 0..9){
                    if (i.toString()==j.toString()){
                        numCount++;
                    }
                }
            }

            for ( i in text){
                for ( j in 'A'..'Z'){
                    if (i.toString()==j.toString()){
                        capitalLetter++;
                    }
                }
            }

            for ( i in text){
                for ( j in 'a'..'z'){
                    if (i.toString()==j.toString()){
                        smallLetter++;
                    }
                }
            }

            for ( i in text){
                for ( j in "@$!*&^_+)(`~#"){
                    if (i.toString()==j.toString()){
                        specialChar++;
                    }
                }
            }


            if (numCount ==0){
                Toast.makeText(this, "Please enter Number in password", Toast.LENGTH_SHORT).show()
            }
            else if(smallLetter == 0) {
                Toast.makeText(this, "Please enter Small letter in password", Toast.LENGTH_SHORT).show()
            }
            else if(capitalLetter == 0) {
                Toast.makeText(this, "Please enter Capital letter in password", Toast.LENGTH_SHORT).show()
            }
            else if(specialChar == 0) {
                Toast.makeText(this, "Please enter Special Char in password", Toast.LENGTH_SHORT).show()
            }
            else if(text.length <= 8){
                Toast.makeText(this, "plse enter 8 digit in password", Toast.LENGTH_SHORT).show()
            }

            else{
                val  intent = Intent(this,ThirdActivity ::class.java)

                intent.putExtra("username" ,"UserName -> ${userlEditText.text} ")


                startActivity(intent)
            }

        }
    }


}
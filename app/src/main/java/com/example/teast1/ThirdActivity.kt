package com.example.teast1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


        val Logout = findViewById<Button>(R.id.logoutButton)
        val profile = findViewById<Button>(R.id.profileButton)
        val studentList  = findViewById<Button>(R.id.studentlistButton)



        Logout.setOnClickListener {

            onBackPressed()
        }

        var nameTxt = intent.extras?.getString("username")
        var name = findViewById<TextView>(R.id.user)
        name.text = nameTxt
        name.setOnClickListener() {

        }
    }
}
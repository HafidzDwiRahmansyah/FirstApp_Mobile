package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var login = findViewById(R.id.submit) as Button

        login.setOnClickListener{

            val name = findViewById<EditText>(R.id.username).text.toString().trim()
            val pass = findViewById<EditText>(R.id.password).text.toString().trim()

            if(name.isNotEmpty() || pass.isNotEmpty()){

                val sukses = "Login berhasil";

                Toast.makeText(this@MainActivity, sukses, Toast.LENGTH_LONG).show()

                val intentBiasa = Intent(this, Activity_ketiga::class.java)

                startActivity(intentBiasa)

            }else{
                val pesan = "Mohon isi data terlebih dahulu";

                Toast.makeText(this@MainActivity, pesan, Toast.LENGTH_LONG).show()
            }

//            if (v != null) {
//                when(v.id) {
//                    R.id.btn_intent -> run {
//                        val intentBiasa = Intent(this@MainActivity, MainActivity2::class.java)
//                        startActivity(intentBiasa)
//                    }
//                }
//            }
        }
    }
}
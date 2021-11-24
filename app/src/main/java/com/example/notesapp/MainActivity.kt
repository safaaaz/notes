package com.example.notesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_newnote.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context = this
        signup.setOnClickListener (){
            if(username1.text.toString().length>0 &&pass.text.toString().length>0){
                var user = user(username1.text.toString(), pass.text.toString())
                var db = databaseh(this)

                db.add(user)}
        }
    }
}
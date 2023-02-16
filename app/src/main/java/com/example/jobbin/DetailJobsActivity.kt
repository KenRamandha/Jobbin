package com.example.jobbin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class DetailJobsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_jobs)

        val button = findViewById<Button>(R.id.btn_apply_detail)

        val button1 =findViewById<ImageView>(R.id.btn_back_details)

        button1.setOnClickListener {
            onBackPressed()
        }

        button.setOnClickListener {
            val next = Intent(this ,ApplyJobsActivity1::class.java)
            startActivity(next)
        }
    }
}
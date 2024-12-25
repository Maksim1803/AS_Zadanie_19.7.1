package com.example.zadanie1971

import android.os.Bundle
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val content = findViewById<ViewGroup>(R.id.content)
        for (i in 0..100) {
            val v = layoutInflater.inflate(R.layout.item, content, false)
            content.addView(v)
        }
    }
}

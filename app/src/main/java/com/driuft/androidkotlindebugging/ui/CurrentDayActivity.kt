package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R
import java.util.*

class CurrentDayActivity : AppCompatActivity() {

    private lateinit var currentDayText: TextView
    private val cal: Calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_day)

        currentDayText = findViewById(R.id.current_day_text)

        // FIX: Convert day number to string instead of treating it as a string resource
        val dayNumber = getDayOfMonth()
        currentDayText.text = "Today is the $dayNumber"
    }

    private fun getDayOfMonth(): Int {
        return cal.get(Calendar.DAY_OF_MONTH)
    }
}

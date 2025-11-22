package com.driuft.androidkotlindebugging

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.driuft.androidkotlindebugging.ui.*

class MainActivity : AppCompatActivity() {

    private val challengeOneButton: Button get() = findViewById(R.id.challenge_one)
    private val challengeTwoButton: Button get() = findViewById(R.id.challenge_two)
    private val challengeThreeButton: Button get() = findViewById(R.id.challenge_three)
    private val challengeFourButton: Button get() = findViewById(R.id.challenge_four)
    private val challengeFiveButton: Button get() = findViewById(R.id.challenge_five)
    private val challengeSixButton: Button get() = findViewById(R.id.challenge_six)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        challengeOneButton.setOnClickListener { launchHelloWorldActivity() }
        challengeTwoButton.setOnClickListener { launchNumSumActivity() }
        challengeThreeButton.setOnClickListener { launchCurrentDayActivity() }
        challengeFourButton.setOnClickListener { launchRandomColorActivity() }
        challengeFiveButton.setOnClickListener { launchPrintListActivity() }
        challengeSixButton.setOnClickListener { launchFavoriteNumberActivity() }
    }

    // FIXED: removed "404 as Context" which caused ClassCastException
    private fun launchHelloWorldActivity() {
        val intent = Intent(this, HelloWorldActivity::class.java)
        startActivity(intent)
    }

    private fun launchNumSumActivity() {
        val intent = Intent(this, NumSumActivity::class.java)
        startActivity(intent)
    }

    private fun launchCurrentDayActivity() {
        val intent = Intent(this, CurrentDayActivity::class.java)
        startActivity(intent)
    }

    private fun launchRandomColorActivity() {
        val intent = Intent(this, RandomColorActivity::class.java)
        startActivity(intent)
    }

    private fun launchPrintListActivity() {
        val intent = Intent(this, PrintListActivity::class.java)
        startActivity(intent)
    }

    private fun launchFavoriteNumberActivity() {
        val intent = Intent(this, FavoriteNumber::class.java)
        startActivity(intent)
    }
}

package com.ninacode.showmyclock

import android.os.Bundle
import android.widget.AnalogClock
import android.widget.TextClock
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var analogClock: AnalogClock
    private lateinit var digitalClock: TextClock

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        analogClock = findViewById(R.id.analogClock)
        digitalClock = findViewById(R.id.digitalClock)

        val showAnalogClock = Random.nextBoolean()

        if (showAnalogClock) {
            analogClock.visibility = AnalogClock.VISIBLE
        } else {
            digitalClock.visibility = TextClock.VISIBLE
        }
    }
}

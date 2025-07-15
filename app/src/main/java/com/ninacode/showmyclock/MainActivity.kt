package com.ninacode.showmyclock.v2

import android.os.Bundle
import android.widget.TextClock
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var digitalClock: TextClock
    private lateinit var analogStyleClock: TextClock

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        digitalClock = findViewById(R.id.digitalClock)
        analogStyleClock = findViewById(R.id.analogStyleClock)

        val showAnalogStyle = Random.nextBoolean()

        if (showAnalogStyle) {
            analogStyleClock.visibility = TextClock.VISIBLE
        } else {
            digitalClock.visibility = TextClock.VISIBLE
        }
    }
}

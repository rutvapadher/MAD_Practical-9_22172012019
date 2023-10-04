package com.example.mad_practical_9_22172012019

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var AlarmAnimation: AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alarmimage=findViewById<ImageView>(R.id.alarmimage)
        alarmimage.setBackgroundResource(R.drawable.alarm_animation_list)
        AlarmAnimation=alarmimage.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean)
    {
        if (hasFocus)
        {
            AlarmAnimation.start()
        }
        else
        {
            AlarmAnimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }


}
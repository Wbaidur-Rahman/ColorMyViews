package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        findViewById<View>(R.id.box_one_text).setOnClickListener {
            makeColored(it)
        }
        findViewById<View>(R.id.box_two).setOnClickListener {
            makeColored(it)
        }
        findViewById<View>(R.id.box_three_text).setOnClickListener {
            makeColored(it)
        }
        findViewById<View>(R.id.box_four_text).setOnClickListener {
            makeColored(it)
        }
        findViewById<View>(R.id.box_five_text).setOnClickListener {
            makeColored(it)
        }
        findViewById<Button>(R.id.red_button).setOnClickListener {
            makeColored(it)
        }
        findViewById<Button>(R.id.yellow_button).setOnClickListener {
            makeColored(it)
        }
        findViewById<Button>(R.id.green_button).setOnClickListener {
            makeColored(it)
        }

    }

    private fun makeColored(view:View){
        when(view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> {
                view.setBackgroundResource(android.R.color.holo_green_light)
            }
            R.id.box_four_text -> {
                view.setBackgroundResource(android.R.color.holo_green_dark)
            }
            R.id.box_five_text -> {
                view.setBackgroundResource(android.R.color.holo_green_light)
            }
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
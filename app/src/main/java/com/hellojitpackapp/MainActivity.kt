package com.example.hellojitpackapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.example.hellolib.HelloLib

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val tv = TextView(this).apply {
      text     = HelloLib().sayHello()
      textSize = 24f
    }
    setContentView(tv)
  }
}
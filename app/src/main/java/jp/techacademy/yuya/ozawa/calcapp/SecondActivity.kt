package jp.techacademy.yuya.ozawa.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvAns: TextView= findViewById(R.id.tvAns)


       val number=intent.getStringExtra("number")
        tvAns.text=number

    }
}
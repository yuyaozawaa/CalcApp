package jp.techacademy.yuya.ozawa.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et1:EditText = findViewById(R.id.et1)
        val et2:EditText= findViewById(R.id.et2)
        val btn1:Button = findViewById(R.id.btn1)
        val btn2:Button = findViewById(R.id.btn2)
        val btn3:Button = findViewById(R.id.btn3)
        val btn4:Button = findViewById(R.id.btn4)

        btn1.setOnClickListener {
            if(et1.text.toString()=="" || et2.text .toString()==""){

                alert()

            }else {
                var num1 =et1.text.toString().toFloat()
                var num2 =et2.text.toString().toFloat()
                val sum =num1+num2
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("number", sum.toString())
                startActivity(intent)
            }
        }

        btn2.setOnClickListener {
            if(et1.text.toString()=="" || et2.text .toString()==""){

                alert()

            }else {
                var num1 =et1.text.toString().toFloat()
                var num2 =et2.text.toString().toFloat()
                val sum =num1-num2
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("number", sum.toString())
                startActivity(intent)
            }
        }
        btn3.setOnClickListener {
            if(et1.text.toString()=="" || et2.text .toString()==""){

                alert()

            }else {
                var num1 =et1.text.toString().toFloat()
                var num2 =et2.text.toString().toFloat()
                val sum =num1*num2
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("number", sum.toString())
                startActivity(intent)
            }
        }
        btn4.setOnClickListener {
            if(et1.text.toString()=="" || et2.text .toString()==""){

                alert()

            }else {
                var num1 =et1.text.toString().toFloat()
                var num2 =et2.text.toString().toFloat()
                val sum =num1/num2
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("number", sum.toString())
                startActivity(intent)
            }
        }


        }
    private fun alert(){
        AlertDialog.Builder(this)
            .setTitle("エラー")
            .setMessage("数字を入力してください")
            .setPositiveButton("Ok",null)
            .show()


    }
}
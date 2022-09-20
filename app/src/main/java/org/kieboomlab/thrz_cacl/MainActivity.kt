package org.kieboomlab.thrz_cacl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private val calcButton by lazy { findViewById<Button>(R.id.calcButton) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val age = findViewById<EditText>(R.id.editTextAge)
        val height = findViewById<EditText>(R.id.editTextHeight)
        val weight = findViewById<EditText>(R.id.editTextWeight)


        calcButton.setOnClickListener {
            val age = age.text.toString()
            val height = height.text.toString()
            val weight = weight.text.toString()

            val intent = Intent(this, ResultActivity::class.java)
            Log.d("MainActivity", "age=$age, height=$height, weight=$weight")
            intent.putExtra("age",age.toInt())
            intent.putExtra("height",height.toInt())
            intent.putExtra("weight",weight.toInt())
            startActivity(intent)





        }

    }


}
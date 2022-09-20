package org.kieboomlab.thrz_cacl

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val age = intent.getIntExtra("age", 0)
        val height = intent.getIntExtra("height", 0)
        val weight = intent.getIntExtra("weight", 0)
        Log.d("ResultActivity", "age=$age, height=$height, weight=$weight")

        var hrZone5View = findViewById<TextView>(R.id.editTextHr5)
        var hrZone4View = findViewById<TextView>(R.id.editTextHr4)
        var hrZone3View = findViewById<TextView>(R.id.editTextHr3)
        var hrZone2View = findViewById<TextView>(R.id.editTextHr2)
        var hrZone1View = findViewById<TextView>(R.id.editTextHr1)

        val BMI_resultView = findViewById<TextView>(R.id.textViewResult)
        val BMI_stateView = findViewById<TextView>(R.id.textViewStatement)

        val hrZone5 = (207-(0.7 * age.toDouble())) * 0.9
        hrZone5View.text = hrZone5.toString()
        val hrZone4 = (207-(0.7 * age.toDouble())) * 0.8
        hrZone5View.text = hrZone4.toString()
        val hrZone3 = (207-(0.7 * age.toDouble())) * 0.7
        hrZone5View.text = hrZone3.toString()
        val hrZone2 = (207-(0.7 * age.toDouble())) * 0.6
        hrZone5View.text = hrZone2.toString()
        val hrZone1 = (207-(0.7 * age.toDouble())) * 0.5
        hrZone5View.text = hrZone1.toString()


        val BMI_result = weight.toDouble() / (height.toDouble() * height.toDouble() * 0.0001)
        BMI_resultView.text = BMI_result.toString()

        val bmiText = when (BMI_result.toInt()) {
            in 0..20 -> BMI_stateView.text = "low BMI"
            in 21..24 -> BMI_stateView.text = "Normal BMI"
            in 25..29 -> BMI_stateView.text = "High BMI"
            else -> BMI_stateView.text = "Obesity BMI"
        }


    }
}





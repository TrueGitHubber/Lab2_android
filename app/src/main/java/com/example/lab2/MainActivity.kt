package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val buttonPlus = findViewById<Button>(R.id.button_plus)
        val buttonMinus = findViewById<Button>(R.id.button_minus)
        val buttonMult = findViewById<Button>(R.id.button_mult)
        val buttonDiv = findViewById<Button>(R.id.button_div)

        buttonPlus.setOnClickListener()
        {
            val number_1 = findViewById<EditText>(R.id.number_1).text.toString().toDoubleOrNull()
            val number_2 = findViewById<EditText>(R.id.number_2).text.toString().toDoubleOrNull()

            if(number_1 == null || number_2 == null) {
                if (number_1 == null && number_2 == null)
                    Snackbar.make(root_view, "Введите оба числа", Snackbar.LENGTH_SHORT)
                        .show()
                else if (number_1 == null)
                    Snackbar.make(root_view, "Введите число 1", Snackbar.LENGTH_SHORT).show()
                else if (number_2 == null)
                    Snackbar.make(root_view, "Введите число 2", Snackbar.LENGTH_SHORT).show()
                resultTextView.text = "Result:\n*******"
                return@setOnClickListener
            }

            val result = number_1 + number_2
            resultTextView.text = "result:\n"+ result.toString()
        }

        buttonMinus.setOnClickListener()
        {
            val number_1 = findViewById<EditText>(R.id.number_1).text.toString().toDoubleOrNull()
            val number_2 = findViewById<EditText>(R.id.number_2).text.toString().toDoubleOrNull()

            if(number_1 == null || number_2 == null) {
                if (number_1 == null && number_2 == null)
                    Snackbar.make(root_view, "Введите оба числа", Snackbar.LENGTH_SHORT)
                        .show()
                else if (number_1 == null)
                    Snackbar.make(root_view, "Введите число 1", Snackbar.LENGTH_SHORT).show()
                else if (number_2 == null)
                    Snackbar.make(root_view, "Введите число 2", Snackbar.LENGTH_SHORT).show()
                resultTextView.text = "Result:\n*******"
                return@setOnClickListener
            }

            val result = number_1 - number_2
            resultTextView.text = "result:\n"+ result.toString()
        }

        buttonMult.setOnClickListener()
        {
            val number_1 = findViewById<EditText>(R.id.number_1).text.toString().toDoubleOrNull()
            val number_2 = findViewById<EditText>(R.id.number_2).text.toString().toDoubleOrNull()

            if(number_1 == null || number_2 == null) {
                if (number_1 == null && number_2 == null)
                    Snackbar.make(root_view, "Введите оба числа", Snackbar.LENGTH_SHORT)
                        .show()
                else if (number_1 == null)
                    Snackbar.make(root_view, "Введите число 1", Snackbar.LENGTH_SHORT).show()
                else if (number_2 == null)
                    Snackbar.make(root_view, "Введите число 2", Snackbar.LENGTH_SHORT).show()
                resultTextView.text = "Result:\n*******"
                return@setOnClickListener
            }

            val result = number_1 * number_2
            resultTextView.text = "result:\n"+ result.toString()
        }

        buttonDiv.setOnClickListener()
        {
            val number_1 = findViewById<EditText>(R.id.number_1).text.toString().toDoubleOrNull()
            val number_2 = findViewById<EditText>(R.id.number_2).text.toString().toDoubleOrNull()

            if(number_1 == null || number_2 == null) {
                if (number_1 == null && number_2 == null)
                    Snackbar.make(root_view, "Введите оба числа", Snackbar.LENGTH_SHORT)
                        .show()
                else if (number_1 == null)
                    Snackbar.make(root_view, "Введите число 1", Snackbar.LENGTH_SHORT).show()
                else if (number_2 == null)
                    Snackbar.make(root_view, "Введите число 2", Snackbar.LENGTH_SHORT).show()
                resultTextView.text = "Result:\n*******"
                return@setOnClickListener
            }

            if(number_2 == 0.0){
                Snackbar.make(root_view, "Деление на 0", Snackbar.LENGTH_SHORT).show()
                resultTextView.text = "Result:\n*******"
                return@setOnClickListener
            }
            val result = number_1 / number_2
            resultTextView.text = "result:\n"+ result.toString()

        }
    }


}

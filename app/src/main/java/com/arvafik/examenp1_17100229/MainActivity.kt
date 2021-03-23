package com.arvafik.examenp1_17100229

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val masa = findViewById<EditText>(R.id.Masa_txt)
        val estatura = findViewById<EditText>(R.id.Estat_txt)
        val boton = findViewById<Button>(R.id.Calc_Btn)
        val tv1 = findViewById<TextView>(R.id.tv1)
        val resultadopeso = findViewById<TextView>(R.id.resultadopeso)
        val checkbox = findViewById<CheckBox>(R.id.checkbox)
        boton.setOnClickListener{

            val num1 = masa.text.toString().toDouble()
            val num2 = estatura.text.toString().toDouble()
            val resultado = (num1 / (num2 * num2))
            tv1.text = "El resultado es: ${resultado.toString()}"

                findViewById<ImageView>(R.id.imageview).visibility = View.VISIBLE;
                if(resultado  < 18.5){
                    findViewById<ImageView>(R.id.imageview).setBackgroundResource(R.drawable.delgadez);
                    resultadopeso.text = "Tienes delgadez"
                }else if(resultado < 24.99){
                    findViewById<ImageView>(R.id.imageview).setBackgroundResource(R.drawable.normal);
                    resultadopeso.text = "Estas normal"
                }else if(resultado < 29.99){
                    findViewById<ImageView>(R.id.imageview).setBackgroundResource(R.drawable.sobrepeso);
                    resultadopeso.text = "Tienes sobrepeso"
                }else{
                    findViewById<ImageView>(R.id.imageview).setBackgroundResource(R.drawable.obesidad);
                    resultadopeso.text = "Tienes obesidad"
                }
        }

        checkbox.setOnClickListener{
            if(checkbox.isChecked){
                findViewById<ImageView>(R.id.imageview).visibility = View.VISIBLE;
            } else {
                findViewById<ImageView>(R.id.imageview).visibility = View.INVISIBLE;
            }

        }

    }
}
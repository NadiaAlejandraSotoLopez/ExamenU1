package mx.itson.edu.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import mx.edu.potros.examenu1.R
import java.text.DecimalFormat

//NADIA ALEJANDRA SOTO LÓPEZ ID: 00000210930

class MainActivity : AppCompatActivity() {

    var cel: Float = 0.00F
    var far: Float = 0.00F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etCelsius: EditText = findViewById(R.id.etC)
        val etFar: EditText = findViewById(R.id.etF)

        val btnGcel: Button = findViewById(R.id.btnGC)
        val btnGFar: Button = findViewById(R.id.btnGF)

        btnGcel.setOnClickListener() {
            // Celsius a Far
            cel = etCelsius.text.toString().toFloat()
            far = (cel * 1.8f) + 32f

            // Formatear el resultado con dos decimales
            etFar.setText(formatDecimal(far))
        }

        btnGFar.setOnClickListener() {
            // Fahrenheit
            far = etFar.text.toString().toFloat()
            cel = (far - 32f) / 1.8f

            // Formatear el resultado con dos decimales
            etCelsius.setText(formatDecimal(cel))
        }
    }

    private fun formatDecimal(value: Float): String {
        val decimalFormat = DecimalFormat("#.##")
        return decimalFormat.format(value)
    }
}
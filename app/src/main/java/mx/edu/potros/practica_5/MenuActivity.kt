package mx.edu.potros.practica_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        var btnAntojitos:Button=findViewById(R.id.btnAntojitos) as Button
        var btnEspecialidades:Button=findViewById(R.id.btnEspe) as Button
        var btnCombinaciones:Button=findViewById(R.id.btnCombi) as Button
        var btnTortas:Button=findViewById(R.id.btnTortas) as Button
        var btnSopas:Button=findViewById(R.id.btnSopas) as Button
        var btnDrink:Button=findViewById(R.id.btnDrink) as Button

        btnAntojitos.setOnClickListener{
            var intent: Intent = 
        }







    }
}
package mx.edu.potros.practica_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnAntojitos: Button = findViewById(R.id.btnAntojitos) as Button
        val btnEspecialidades: Button = findViewById(R.id.btnEspe) as Button
        val btnCombinaciones: Button = findViewById(R.id.btnCombi) as Button
        val btnTortas: Button = findViewById(R.id.btnTortas) as Button
        val btnSopas: Button = findViewById(R.id.btnSopas) as Button
        val btnBebidas: Button = findViewById(R.id.btnDrink) as Button

        btnAntojitos.setOnClickListener {
            val intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Antojitos")
            startActivity(intent)
        }
        btnEspecialidades.setOnClickListener {
            val intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Especialidades")
            startActivity(intent)
        }
        btnCombinaciones.setOnClickListener {
            val intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Combinations")
            startActivity(intent)
        }
        btnTortas.setOnClickListener {
            val intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Tortas")
            startActivity(intent)
        }
        btnSopas.setOnClickListener {
            val intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Sopas")
            startActivity(intent)
        }
        btnBebidas.setOnClickListener {
            val intent = Intent(this, Productos_activity::class.java)
            intent.putExtra("menuType", "Bebidas")
            startActivity(intent)
        }
    }
}

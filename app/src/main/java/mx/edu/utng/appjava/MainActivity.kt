package mx.edu.utng.appjava

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import mx.edu.utng.appjava.introduccion.introduccion2
import mx.edu.utng.appjava.principal.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntroduccion.setOnClickListener {
            startActivity(Intent(this, introduccion::class.java))
        }

        btnAprender.setOnClickListener {
            startActivity(Intent(this, AprenderProgramar::class.java))
        }

        btnMuestras.setOnClickListener {
            startActivity(Intent(this, programasMuestras::class.java))
        }

        btnCreditos.setOnClickListener {
            startActivity(Intent(this, creditos::class.java))
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_principal, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var msg: String = ""
        when(item.itemId){

            R.id.itmIntroduccion->{
                msg="Introduccion Seleccionado"
                startActivity(Intent(this, introduccion2::class.java))
            }
            R.id.itmAprender->{
                msg="Aprender a programar Seleccionado"
                startActivity(Intent(this, AprenderProgramar::class.java))
            }
            R.id.itmMuestras->{
                msg="Muestras Seleccionado"
                startActivity(Intent(this, programasMuestras::class.java))
            }
            R.id.itmCreditos->{
                msg="Creditos Seleccionado"
                startActivity(Intent(this, creditos::class.java))
            }
            R.id.itmSalir->{
                System.exit(0)
            }
        }
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }
}

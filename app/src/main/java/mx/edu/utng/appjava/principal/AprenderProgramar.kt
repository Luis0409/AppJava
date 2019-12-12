package mx.edu.utng.appjava.principal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_aprender_programar.*
import mx.edu.utng.appjava.R
import mx.edu.utng.appjava.aprende.arreglosBucles
import mx.edu.utng.appjava.aprende.conceptosBasicos

class AprenderProgramar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aprender_programar)

        val lista= arrayOf("Conceptos basicos", "Arreglos y bucles")

        val pri = Intent(this, conceptosBasicos::class.java)
        val seg = Intent (this, arreglosBucles::class.java)
        var pag = arrayOf(pri, seg)

        var adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista)
        listAprender.adapter = adaptador1;

        listAprender.setOnItemClickListener { adapterView, view, i, l ->
            startActivity(pag[i])
        }

    }
}

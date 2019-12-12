package mx.edu.utng.appjava.principal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_introduccion.*
import mx.edu.utng.appjava.R
import mx.edu.utng.appjava.introduccion.caracteristicas
import mx.edu.utng.appjava.introduccion.historia
import mx.edu.utng.appjava.introduccion.introduccion2

class introduccion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduccion)

        val lista= arrayOf("Introduccion","Historia","Caracteristicas")

        val pri = Intent(this, introduccion2::class.java)
        val seg = Intent (this, historia::class.java)
        val ter = Intent (this, caracteristicas::class.java)
        var pag = arrayOf(pri, seg, ter)

        var adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista)
        listIntroduccion.adapter = adaptador1;

        listIntroduccion.setOnItemClickListener { adapterView, view, i, l ->
            startActivity(pag[i])
        }

    }

}

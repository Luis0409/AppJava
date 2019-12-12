package mx.edu.utng.appjava.principal

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Switch
import kotlinx.android.synthetic.main.activity_programas_muestras.*
import mx.edu.utng.appjava.*

class programasMuestras : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_programas_muestras)


        pacman.setOnClickListener {
            intent = Intent(Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1LF1Hgh1jjeoaO7-sCnJR1Uj6OsXVIoA6")))
            startActivity(intent)
        }

        otros.setOnClickListener {
            intent = Intent(Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1PW690u4xpdjsWHJRJsOshRqdmq0XSEZZ")))
            startActivity(intent)
        }

        agenda.setOnClickListener {
            intent = Intent(Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=12IzJqVhTZfGmHsOMim274inQRH-zyjCd")))
            startActivity(intent)
        }

        validador.setOnClickListener {
            intent = Intent(Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1SrojkOcvTgw5uIYRa4tQd9iL5G10y1rz")))
            startActivity(intent)
        }

    }
}

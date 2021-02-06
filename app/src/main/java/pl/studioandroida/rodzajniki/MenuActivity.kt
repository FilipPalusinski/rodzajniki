package pl.studioandroida.rodzajniki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        start.setOnClickListener {
            val intent = Intent(this, GraActivity::class.java)
            startActivity(intent)
            finish()
        }
        samouczek.setOnClickListener {
            val intent = Intent(this, Samouczek::class.java)
            startActivity(intent)
            finish()
        }

    }
}
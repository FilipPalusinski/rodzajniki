package pl.studioandroida.rodzajniki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.tak
import kotlinx.android.synthetic.main.activity_samouczek.*

class Samouczek : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_samouczek)




        zaczynam.setOnClickListener {
            val intent = Intent(this, GraActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
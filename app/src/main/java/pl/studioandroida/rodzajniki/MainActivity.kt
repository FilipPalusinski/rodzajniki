package pl.studioandroida.rodzajniki

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

private val sharedPrefFile = "kotlinsharedpreference"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sharedPreferences: SharedPreferences = this.getSharedPreferences(sharedPrefFile,Context.MODE_PRIVATE)

        //sprawdzam czy uzytkownik wchodzi do aplikacji pierwszy raz
        val isFirst = sharedPreferences.getBoolean("isFirst", true)
        if(!isFirst){
            //jezeli nie jest to jego pierwsze wlaczenie aplikacji, to pomijam samouczek
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }

        val editor: SharedPreferences.Editor =  sharedPreferences.edit()
        editor.putBoolean("isFirst", false)
        editor.apply()
        editor.commit()

        nie.setOnClickListener {
            val intent = Intent(this, GraActivity::class.java)
            startActivity(intent)
            finish()
        }

        tak.setOnClickListener {
            val intent = Intent(this, Samouczek::class.java)
            startActivity(intent)
            finish()
        }
    }
}
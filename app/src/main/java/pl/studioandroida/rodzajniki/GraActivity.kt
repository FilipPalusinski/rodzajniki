package pl.studioandroida.rodzajniki

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_gra.*

class GraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gra)

        val nowaGra = GraLogic()

        Log.d("Debug", "${nowaGra.tenNumbers}")
        Log.d("Debug", "${nowaGra.tenWords}")

        loadWords(nowaGra)


        derButton.setOnClickListener {
            nowaGra.isCorrectWord("der", progressBar, this)
            loadWords(nowaGra)
        }
        dieButton.setOnClickListener {
            nowaGra.isCorrectWord("die", progressBar, this)
            loadWords(nowaGra)
        }
        dasButton.setOnClickListener {
            nowaGra.isCorrectWord("das", progressBar, this)
            loadWords(nowaGra)
        }



    }

    fun loadWords(gra: GraLogic){
        if(gra.correctWordsCount < 10){
            slowo.text = gra.tenWords[0]
            poPolsku.text = gra.tenTranslations[0]
            Log.d("Debug", "Points ${gra.correctWordsCount}")
        }else{
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }

    }



}
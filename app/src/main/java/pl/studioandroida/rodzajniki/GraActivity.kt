package pl.studioandroida.rodzajniki

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_gra.*

class GraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gra)

        val myMap: Map<String, String> = mapOf<String, String>(
            "die" to "Frau",
            "der" to "Mann",
            "das" to "Kind",
            "das" to "Messer",
            "das" to "Loffel",
            "das" to "Gabel",
            "der" to "Tisch",
            "die" to "Blumen",
            "das" to "Bild",
            "der" to "Hund",
            "die" to "Luft",
            "die" to "Erde",
            "der" to "Mond",
            "die" to "Sonne",
            "die" to "Weichsel",
            "die" to "Ostsee",
            "die" to "Alpen",
            "die" to "Karpaten",
        )

        val myMap2: Map<String, String> = mapOf<String, String>(
            "Frau" to "kobieta",
            "Mann" to "mężczyzna",
            "Kind" to "dziecko",
            "Messer" to "nóż",
            "Loffel" to "nóż",
            "Gabel" to "widelec",
            "Tisch" to "stół",
            "Blumen" to "kwiaty",
            "Bild" to "obrazek",
            "Hund" to "pies",
            "Luft" to "powietrze",
            "Erde" to "ziemia",
            "Mond" to "księżyc",
            "Sonne" to "ziemia",
            "Weichsel" to "wisła",
            "Ostsee" to "Bałtyk",
            "Alpen" to "Alpy",
            "Karpaten" to "Karpaty",
        )


        //wczytuje 10 wyrazów do nowej tablicy
        var index = 0;
        //val numbersMap = emptyMap<String, String>().toMutableMap()
        var wordsList = emptyList<String>().toMutableList()
        for((k, v) in myMap){
            if (index < 10){
                wordsList.add(v)
            }
            index++

        }
        Log.d("Debug", "numbersMap$wordsList")

        slowo.text = wordsList[1]
        poPolsku.text = myMap2[wordsList[1]]

    }
}
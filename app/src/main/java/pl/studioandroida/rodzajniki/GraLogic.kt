package pl.studioandroida.rodzajniki

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.util.Log
import android.view.Gravity
import android.widget.ProgressBar
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import kotlin.random.Random


class GraLogic {


    //init lists with all words
    val articles = mutableListOf<String>("die", "der", "das", "das", "das", "das", "der", "die", "das", "der", "die", "die", "der", "die", "die", "die", "die", "die")
    val translations = mutableListOf<String>("kobieta", "mężczyzna", "dziecko", "nóż", "łyżka", "widelec", "stół", "kwiaty", "obrazek", "pies", "powietrze", "ziemia", "księżyc", "ziemia", "wisła", "Bałtyk", "Alpy", "Karpaty")
    val words = mutableListOf<String>("Frau", "Mann", "Kind", "Messer", "Loffel", "Gabel", "Tisch", "Blumen", "Bild", "Hund", "Luft", "Erde", "Mond", "Sonne", "Weichsel", "Ostsee", "Alpen", "Karpaten")

    //lateinit declaration of lists with only ten words in it
    lateinit var tenNumbers: MutableList<Int>
    lateinit var tenWords: MutableList<String>
    lateinit var tenArticles: MutableList<String>
    lateinit var tenTranslations: MutableList<String>
    //index of current word



    //constructor
    init{
        //generate list with ten random numbers
        tenNumbers = emptyList<Int>().toMutableList()


        //get ten random values
        for(i in 1..10){
            while(tenNumbers.size != 10){
                val random = Random.nextInt(0, 17)
                if(!tenNumbers.contains(random)){
                    tenNumbers.add(random)
                }
            }
        }

        //fill previous lateinit lists with values based on random numbers list
        tenWords = emptyList<String>().toMutableList()
        tenTranslations = emptyList<String>().toMutableList()
        tenArticles = emptyList<String>().toMutableList()
        for(item in tenNumbers){
            tenWords.add(words.get(item))
            tenArticles.add(articles.get(item))
            tenTranslations.add(translations.get(item))
        }
    }

    var correctWordsCount: Int = 0


    fun isCorrectWord(currentButton: String, progressbar: ProgressBar, context: Context) {
        if (correctWordsCount < 10) {
            var mMediaPlayer: MediaPlayer? = null
            if (currentButton == tenArticles[0]) {
                mMediaPlayer = MediaPlayer.create(context, R.raw.correct)
                mMediaPlayer.start()

                correctWordsCount++
                progressbar.setProgress(correctWordsCount)
                tenWords.removeFirst()
                tenArticles.removeFirst()
                tenTranslations.removeFirst()

            } else {
                mMediaPlayer = MediaPlayer.create(context, R.raw.incorrect)
                mMediaPlayer.start()
                tenWords.add(tenWords.get(0))
                tenArticles.add(tenArticles.get(0))
                tenTranslations.add(tenTranslations.get(0))


                tenWords.removeFirst()
                tenArticles.removeFirst()
                tenTranslations.removeFirst()
            }
            Log.d("Debug", "${tenWords}")
        }
    }


}
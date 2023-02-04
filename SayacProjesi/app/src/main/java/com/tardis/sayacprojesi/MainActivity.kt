package com.tardis.sayacprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Abstract Class    15 sn ise 1000 ile çarpılır.
        object: CountDownTimer(15000,1000){
            // object açmalıyız değişken tanımlar gibi işe yaramaz..
            // 1000 yazan yer ne kadar da azalsın demek saniyede 1 azalsın istedim.
            // o yüzden 1*1000 yaptım.
            override fun onTick(p0: Long) {
                textView.text ="Kalan ${p0 / 1000}"
            }
            override fun onFinish() {
                textView.text="Kalan: 0"
            }
        }.start()
    }
}
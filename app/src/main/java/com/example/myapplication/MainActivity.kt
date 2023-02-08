package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1)id
        val tv: TextView = findViewById(R.id.mapText)
        val btn: Button = findViewById(R.id.mapbtn)

        //2)クリック処理
        btn.setOnClickListener {
            val map =
                arrayOf("アセント", "バインド", "アイスボックス", "スプリット", "ヘイヴン", "ブリーズ", "フラクチャー", "パール", "ロータス")

            //3)乱数
            val num = Random.nextInt(map.count())
            //tv.text = num.toString()

            //4)表示
            tv.text = map[num]
        }

    }
}
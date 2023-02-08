package com.inhohyun.goodwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다." )
        sentenceList.add("하다보면 어떻게든 잘 될꺼라고 믿어." )
        sentenceList.add("몰라...어떻게든 되겠지." )
        sentenceList.add("잘 될꺼라 믿지말고 당연히 잘 된다고 생각해라." )
        sentenceList.add("몰라 내 친구 피카츄." )

        val sentenceAdapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceAdapter
    }
}
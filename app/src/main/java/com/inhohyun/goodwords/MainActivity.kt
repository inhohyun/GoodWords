package com.inhohyun.goodwords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.inhohyun.goodwords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다." )
        sentenceList.add("하다보면 어떻게든 잘 될꺼라고 믿어." )
        sentenceList.add("몰라...어떻게든 되겠지." )
        sentenceList.add("잘 될꺼라 믿지말고 당연히 잘 된다고 생각해라." )
        sentenceList.add("몰라 내 친구 피카츄." )



        Log.d( "MainActivity", sentenceList.random())


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener {
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }
        //랜덤하게 textview에 값 띄우기
        binding.goodWordTextArea.setText(sentenceList.random())
    }
}
package com.example.intentpractice_lucid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        sendMessageBtn.setOnClickListener {

//          입력한 내용을 변수에 저장 get, set
            val inputMessage = messageEdt.text.toString()


            val myIntent = Intent(this, MessageActivity::class.java) //티켓

            myIntent.putExtra("message", inputMessage) //수하물 첨부(갈 때 가지고 가)

            startActivity(myIntent) //비행기


        }






        moveToOtherBtn.setOnClickListener {

//            다른 화면으로 이동 (OtherActivity)

            val myIntent = Intent(this, OtherActivity::class.java)

            startActivity(myIntent)


        }
    }
}
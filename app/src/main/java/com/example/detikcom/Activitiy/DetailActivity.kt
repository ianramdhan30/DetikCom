package com.example.detikcom.Activitiy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.detikcom.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val cont_JudulBerita = "cont_JudulBerita"
        const val cont_FotoBerita = "cont_fotoBerita"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        txt_JudulBerita.setText(intent.getStringExtra(cont_JudulBerita))
        img_header.setImageResource(intent.getStringExtra(cont_FotoBerita).toInt())

        btnBack.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intentMain = Intent(
                    this@DetailActivity,
                    MainActivity::class.java
                )
                startActivity(intentMain)
                finish()
            }
        })
    }
}
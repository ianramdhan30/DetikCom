package com.example.detikcom.Activitiy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.detikcom.Adapter.NewsModel
import com.example.detikcom.Adapter.berita
import com.example.detikcom.Model.NewsAdapter
import com.example.detikcom.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var headlinenews: berita?;
        if(NewsModel.newList.size>0) {
            headlinenews = NewsModel.newList[NewsModel.newList.size-1]
            txt_headLine.setText(headlinenews.title)
            txt_descHeadLine.setText(headlinenews.desc)
            img_news_headline.setImageResource(headlinenews.photo)

            cv_headline.setOnClickListener{
                //Toast.makeText(this,headlinenews.title, Toast.LENGTH_SHORT).show()
                val intent_detail = Intent(this@MainActivity,
                    DetailActivity::class.java).apply {
                    putExtra(DetailActivity.cont_JudulBerita,
                        headlinenews.title.toString())
                    putExtra(DetailActivity.cont_FotoBerita,
                        headlinenews.photo.toString())

                }
                startActivity(intent_detail)
                finish()
            }
        }

        val layManager = LinearLayoutManager(this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        rv_daftarBerita.layoutManager = layManager
        newsAdapter = NewsAdapter(this, NewsModel.newList)
        rv_daftarBerita.adapter = newsAdapter

        newsAdapter.setOnItemClickCallback(
            object : NewsAdapter.OnItemClickCallback {
                override fun onItemClick(data: berita) {
                    /*Toast.makeText(this@MainActivity,
                        "Anda memilih ${data.title}",
                        Toast.LENGTH_SHORT).show()*/
                    val intent = Intent(this@MainActivity,
                        DetailActivity::class.java).apply {
                        putExtra(DetailActivity.cont_JudulBerita,
                            data.title.toString())
                        putExtra(DetailActivity.cont_FotoBerita,
                            data.photo.toString())
                    }
                    startActivity(intent)
                    finish()
                }
            })
        //endregion
    }
    }

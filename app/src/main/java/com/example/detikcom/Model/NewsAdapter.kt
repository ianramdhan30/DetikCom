package com.example.detikcom.Model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.detikcom.Adapter.berita
import com.example.detikcom.R
import kotlinx.android.synthetic.main.item_menu.view.*


class NewsAdapter(val context: Context, val listNews: List<berita>) :
    RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var currentNews: berita? = null
        var currrentPosition: Int = 0

        fun setData(currnews: berita, pos: Int) {
            itemView.txt_judul.text = currnews!!.title
            itemView.txt_desc.text = currnews!!.desc
            itemView.img_berita.setImageResource(currnews!!.photo)

            this.currentNews = currnews
            this.currrentPosition = pos
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_menu, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listNews.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var dataBerita = listNews[position]
        holder.setData(dataBerita, position)
        holder.itemView.setOnClickListener() { this.onItemClickCallback.onItemClick(listNews[position]) }
    }

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClick(data: berita)
    }
}
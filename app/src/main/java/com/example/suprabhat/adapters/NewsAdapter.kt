package com.example.suprabhat.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.suprabhat.R
import com.example.suprabhat.activities.DetailedNewsActivity
import com.example.suprabhat.models.NewsModel

class NewsAdapter(private val list:ArrayList<NewsModel>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.imageview)
        val heading = itemView.findViewById<TextView>(R.id.heading)
        val content = itemView.findViewById<TextView>(R.id.content)
        val author = itemView.findViewById<TextView>(R.id.author)
        val publishedAt = itemView.findViewById<TextView>(R.id.time)
        val cardview = itemView.findViewById<CardView>(R.id.cardview)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.news_design,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model:NewsModel = list[position]
        val context = holder.itemView.context
        val category = list[position].category
        val detail = list[position].description
        val picture = list[position].urlToImage
        val title = list[position].title
        holder.image.setImageResource(model.urlToImage)
        holder.heading.text = model.title
        holder.content.text = model.description
        holder.author.text = model.author
        holder.publishedAt.text = model.publishedAt

        holder.cardview.setOnClickListener{
           val intent = Intent(context,DetailedNewsActivity::class.java)
            intent.putExtra("place",position.toString())
            intent.putExtra("categ",category)
            intent.putExtra("picture",picture.toString())
            intent.putExtra("title",title)
            intent.putExtra("detail",detail)
            holder.itemView.context.startActivity(intent)
        }

    }
}
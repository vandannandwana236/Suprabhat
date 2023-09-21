package com.example.suprabhat.activities

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.suprabhat.R
import com.example.suprabhat.models.DetailedNewsModel

class DetailedNewsActivity : AppCompatActivity() {
    private lateinit var image:ImageView
    private lateinit var heading:TextView
    private lateinit var discription:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_news)

        image = findViewById(R.id.news_image_web)
        heading = findViewById(R.id.news_heading_web)
        discription = findViewById(R.id.news_discription_web)

        var category = intent.getStringExtra("categ")
        var picture = intent.getStringExtra("picture")?.toInt()
        var title = intent.getStringExtra("title")
        var detail = intent.getStringExtra("detail")
        val index = intent.getStringExtra("place")?.toInt()


        val shareButton = findViewById<ImageView>(R.id.share_option)

        shareButton.setOnClickListener {
            intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_SUBJECT,"This is daily news app")
            intent.putExtra(Intent.EXTRA_TEXT,"\n\n*Tiltle :* " + title+"\n\n"+"*News :* "+detail+"\n\n\n" +
                    "You can download this app to get instant prize by the given link below :\n\n suprabhat.playstore.com")
            startActivity(Intent.createChooser(intent,"Share Via"))
        }



        if (category != null && index != null) {


            if (category == "home") {

                if (picture != null) {
                    image.setImageResource(picture)
                }
                heading.text = title
                discription.text = detail


            } else if (category == "sports") {

                if (picture != null) {
                    image.setImageResource(picture)
                }
                heading.text = title
                discription.text = detail

            } else if (category == "health") {

                if (picture != null) {
                    image.setImageResource(picture)
                }
                heading.text = title
                discription.text = detail

            } else if (category == "sci") {

                if (picture != null) {
                    image.setImageResource(picture)
                }
                heading.text = title
                discription.text = detail


            } else if (category == "enter") {

                if (picture != null) {
                    image.setImageResource(picture)
                }
                heading.text = title
                discription.text = detail

            } else {

                if (picture != null) {
                    image.setImageResource(picture)
                }
                heading.text = title
                discription.text = detail


            }
        }



    }
}

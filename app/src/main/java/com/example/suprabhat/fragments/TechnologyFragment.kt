package com.example.suprabhat.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.suprabhat.R
import com.example.suprabhat.adapters.NewsAdapter
import com.example.suprabhat.models.NewsModel

class TechnologyFragment : Fragment() {
    private var api :String = "adb6aaba259640ca85ee6ab4a9d83074"
    private lateinit var rvtechnology: RecyclerView
    private lateinit var newslist:ArrayList<NewsModel>
    private lateinit var adapter: NewsAdapter
    private val country:String = "in"
    private val category :String = "technology"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val v = inflater.inflate(R.layout.fragment_technology, container, false)

        rvtechnology = v.findViewById(R.id.rvoftechnology)
        newslist = ArrayList()

        newslist.add(NewsModel("David Charls","tech","Childhood Cancer: Health expert dispels myths and taboos, shares important facts","The word “CANCER” can send chills down the spine, the moment it’s uttered and when cancer affects a child, it is almost unexpected and unacceptable, often assumed to be a myth however, it is high time that we address this issue with facts, so that all of us in the society can contribute to achieving better survival rates for childhood cancers. We should participate in supporting these children morally, socially, medically and financially to dispel all the myths and taboos surrounding this term.",R.drawable.health3,"Published 12 hours ago"))
        newslist.add(NewsModel("David Charls","tech","Childhood Cancer: Health expert dispels myths and taboos, shares important facts","The word “CANCER” can send chills down the spine, the moment it’s uttered and when cancer affects a child, it is almost unexpected and unacceptable, often assumed to be a myth however, it is high time that we address this issue with facts, so that all of us in the society can contribute to achieving better survival rates for childhood cancers. We should participate in supporting these children morally, socially, medically and financially to dispel all the myths and taboos surrounding this term.",R.drawable.health3,"Published 12 hours ago"))
        newslist.add(NewsModel("David Charls","tech","Childhood Cancer: Health expert dispels myths and taboos, shares important facts","The word “CANCER” can send chills down the spine, the moment it’s uttered and when cancer affects a child, it is almost unexpected and unacceptable, often assumed to be a myth however, it is high time that we address this issue with facts, so that all of us in the society can contribute to achieving better survival rates for childhood cancers. We should participate in supporting these children morally, socially, medically and financially to dispel all the myths and taboos surrounding this term.",R.drawable.health3,"Published 12 hours ago"))
        newslist.add(NewsModel("David Charls","tech","Childhood Cancer: Health expert dispels myths and taboos, shares important facts","The word “CANCER” can send chills down the spine, the moment it’s uttered and when cancer affects a child, it is almost unexpected and unacceptable, often assumed to be a myth however, it is high time that we address this issue with facts, so that all of us in the society can contribute to achieving better survival rates for childhood cancers. We should participate in supporting these children morally, socially, medically and financially to dispel all the myths and taboos surrounding this term.",R.drawable.health3,"Published 12 hours ago"))
        newslist.add(NewsModel("David Charls","tech","Childhood Cancer: Health expert dispels myths and taboos, shares important facts","The word “CANCER” can send chills down the spine, the moment it’s uttered and when cancer affects a child, it is almost unexpected and unacceptable, often assumed to be a myth however, it is high time that we address this issue with facts, so that all of us in the society can contribute to achieving better survival rates for childhood cancers. We should participate in supporting these children morally, socially, medically and financially to dispel all the myths and taboos surrounding this term.",R.drawable.health3,"Published 12 hours ago"))

        rvtechnology.layoutManager = LinearLayoutManager(context)
        adapter = NewsAdapter(newslist)
        rvtechnology.adapter = adapter




        return v
    }


}
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

class ScienceFragment : Fragment() {
    private var api :String = "adb6aaba259640ca85ee6ab4a9d83074"
    private lateinit var rvScience: RecyclerView
    private lateinit var newslist:ArrayList<NewsModel>
    private lateinit var adapter: NewsAdapter
    private val country:String = "in"
    private val category :String = "science"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val v = inflater.inflate(R.layout.fragment_science, container, false)

        rvScience = v.findViewById(R.id.rvofscience)
        newslist = ArrayList()

        newslist.add(NewsModel("David Charls","sci","IN-SPACe unveils Space Industry Standards for Indian companies","The Indian National Space Promotion and Authorisation Centre (IN-SPACe) has established a framework for the development of space industry standards in India.\n" +
                "\n" +
                "The standard has been developed by drawing from global benchmarks.\n" +
                "\n" +
                "IN-SPACe, in collaboration with the Bureau of Indian Standards (BIS), has released the \"Catalogue of Indian Standards for Space Industry\".\n" +
                "\n" +
                "The catalogue was unveiled by Rajeev Jyoti, Director of the Technical Directorate at IN-SPACe, during the inaugural session of the International Conference on Space 2023, hosted by the Confederation of Indian Industry (CII).\n" +
                "\n" +
                "Justin\n" +
                "MUST READ\n" +
                "India expels top Canadian diplomat hours after Trudeau's move in massive row\n" +
                "\n" +
                "TRENDING TOPICS:\n" +
                "Parliament Session live\n" +
                "Canada\n" +
                "Women's Reservation Bill\n" +
                "Aditya L1\n" +
                "Chandrayaan-3\n" +
                "The catalogue comprises 15 standards developed by BIS, covering a wide range of domains, including Space System Program Management strategies, Systems Engineering principles, and Product Assurance Mechanisms.\n" +
                "\n" +
                "These standards apply to all sectors of space endeavors, including satellites, launch systems, and ground systems, providing a comprehensive reference for all relevant stakeholders.\n" +
                "\n" +
                "Rajeev Jyoti emphasised that the introduction of these standards will enhance the global competitiveness of the Indian space industry and ensure the production of reliable space products.\n" +
                "\n" +
                "He also noted that the catalogue represents a significant step towards aligning the Indian space industry with internationally accepted best practices.\n" +
                "\n" +
                "IN-SPACe and BIS further plan to expand the catalogue by publishing additional Indian Standards for the Space Industry.\n" +
                "\n" +
                "These future volumes will cover a broader range of domains, such as space program management, security and safety, space transportation, design and testing methodology, production, maintenance, and operations.",R.drawable.sci1,"Published 12 hours ago"))
        newslist.add(NewsModel("David Charls","sci","Chandrayaan-3: Sunrise on Shiv Shakti point today, Isro preps to wake up Vikram","The Vikram lander and Pragyan rover have been conducting various experiments since their landing on August 23, but were put into sleep mode following the lunar night.\n" +
                "Listen to Story\n" +
                "\n" +
                "Live TV\n" +
                "Share\n" +
                "Vikram\n" +
                "Lander Vikram stationed on the Moon. (Photo: Isro)\n" +
                "India Today Science Desk\n" +
                "India Today Science Desk\n" +
                "New Delhi,UPDATED: Sep 20, 2023 17:07 IST\n" +
                "In Short\n" +
                "The lunar duo have been in sleep mode\n" +
                "The sunrise is a crucial moment for the mission\n" +
                "With sunlight their operational conditions are expected to improve\n" +
                "As the sun rises over the lunar south pole on Wednesday, the Indian Space Research Organisation (Isro) is preparing to re-establish communication with its Chandrayaan-3 mission's Vikram lander and Pragyan rover.\n" +
                "\n" +
                "The lunar duo have been in sleep mode for the past 15 days due to the lunar night, but with the arrival of sunlight at the Shiv Shakti point, their operational conditions are expected to improve.\n" +
                "\n" +
                "Isro told India Today that sunrise has happened at the Chandrayaan-3 landing site in the south polar region of the Moon and they are waiting for batteries to recharge. Officials said that they are hopeful of re-establishing communications with Vikram and Pragyan.",R.drawable.sci2,"Published 12 hours ago"))
        newslist.add(NewsModel("David Charls","sci","Aditya-L1 en-route to explore Sun, when will first pictures come?","The Indian Space Research Organisation's (Isro) Aditya-L1 mission is making significant strides in its journey towards the Sun. Launched on September 2, from the Satish Dhawan Space Centre, the spacecraft is expected to reach its destination, Lagrange Point 1 (L1), approximately four months post-launch.\n" +
                "\n" +
                "The L1 point, located 1.5 million km from Earth in the direction of the Sun, offers a unique vantage point for continuous solar observation. Isro has targeted January 6, 2024, as the day when Aditya L1 will be placed into the halo orbit around Earth at this point.\n" +
                "\n" +
                "The mission aims to unravel solar mysteries, enhance space weather predictions, and provide critical data for space assets. ",R.drawable.sci3,"Published 12 hours ago"))

        rvScience.layoutManager = LinearLayoutManager(context)
        adapter = NewsAdapter(newslist)
        rvScience.adapter = adapter





        return v
    }
}
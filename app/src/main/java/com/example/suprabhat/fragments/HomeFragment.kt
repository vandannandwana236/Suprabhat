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


class HomeFragment : Fragment() {

    private var api :String = "adb6aaba259640ca85ee6ab4a9d83074"
    private lateinit var rvHome:RecyclerView
    private lateinit var newslist:ArrayList<NewsModel>
    private lateinit var adapter: NewsAdapter
    private val country:String = "in"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v :View = inflater.inflate(R.layout.fragment_home, container, false)


        rvHome = v.findViewById(R.id.rvofhome)
        newslist = ArrayList()
        newslist.add(NewsModel("Manjiri Chitre","home","Women's reservation is not a political issue, it's about recognition: Amit Shah in Lok Sabha","Union home minister Amit Shah on Wednesday said that the reservation for women is not a “political issue for the BJP but a matter of recognition\". Taking a dig at the opposition, Shah said, “For some parties, women empowerment can be a political agenda and a political tool to win elections, but for BJP and Prime Minister Narendra Modi it is not a political issue.”\n" +
                "\n" +
                "Amit Shah in Lok Sabha\n" +
                "Amit Shah in Lok Sabha\n" +
                "Also read: 'Success has many fathers': Smriti Irani's swipe at Sonia Gandhi on women's bill\n" +
                "Addressing the Lok Sabha on the third day of the special five-day session of the Parliament, the union minister also questioned the Opposition over the delay in passing of the bill. Notably, the bill has been in talks since the then UPA government and was also tabled in the Rajya Sabha in 2010.\n" +
                "\n" +
                "“Women's quota bill was brought to Parliament four times earlier but not passed, why is that?” Sahh questioned. He further appealed to the Parliament to pass it unanimously.\n" +
                "\n" +
                "‘Women's reservation bill to start a new era'\n" +
                "Amit Shah lauded Prime Minister Narendra Modi over his women-led vision saying, “The passage of women's reservation bill will mark the start of a new era…Women's security, respect, and equal participation have been the life force of government since PM Modi took the oath of office…He also presented the vision of women-led progress in the G20.”\n" +
                "\n" +
                "Shah also highlighted PM Modi's women-centric initiatives during his address. “Our government has provided 100 million LPG connections to women, and constructed 40 million houses,” he said.\n" +
                "\n" +
                "Referring to the ‘Beti Bachao, Beti Padhao’ campaign, Shah said, “The dropout rate of women from education has drastically reduced…the sex ratio has improved in the country”.",R.drawable.h1,"Sep 20, 2023 07:01 PM IST"))
        newslist.add(NewsModel("Poulomi Ghosh","home","Big step but why do you need new census: Rahul Gandhi on women's quota bill","Congress MP Rahul Gandhi said the women's reservation bill is very important but wondered whether it was not designed to be implemented but was brought to divert attention from the Adani issue and the issue of caste census. “The moment the opposition raises the issue of caste census, the BJP tries to raise a new event so that the OBC community and the people of India look the other way. In my research for the speech, I took a look at the different institutions that define how our country moves forward. There are many-- Lok Sabha, Rajya Sabha, Vidhan Sabham bureaucracy, the press. And I look with an eye to understand what is the participation of the OBC community in these institutions,” Rahul Gandhi said.\n" +
                "\n" +
                "Rahul Gandhi speaking in Parliament on women's reservation bill. \n" +
                "Rahul Gandhi speaking in Parliament on women's reservation bill.\n" +
                "\"Don't be scared,\" Rahul Gandhi said as his mention of the caste census drew protests from the Lok Sabha. Rahul Gandhi said only three government secretaries are from the OBC community.\n" +
                "\n" +
                "\"I stand in support of the women's reservation bill. Yesterday, there was a discussion and the issue of the sengol came up. There was a conversation on the to and fro about the sengol and the transfer of power from the British to the people of India. Before handing over power to the people of India, the British asked the leadership of the freedom movement whom are we going to transfer the power. Of course, there was an arrogance in this as they viewed India as a poor country,\" Rahul Gandhi said.\n" +
                "\n" +
                "\"And the revolutionary answer that our freedom fighters gave was that we would transfer the power to the people of the India. So from the day of its inception, we became a country that gave votes to everybody. It was revolutionary. We gave votes to every single community. The vote was a mechanism to transfer power. If you look at the journey from Independence, it's been a constant transfer of power to the people of India. On the other side, there is a counter of taking power away from the people. Today also the fight is going on. A huge step in giving power to women was panchayat raj. And this is another step, a big step, not a small step,\" Rahul Gandhi said.\n" +
                "\n" +
                "Rahul Gandhi said the bill is incomplete as it does not include OBC women. \"There are two things that seem strange to me. One is the idea that you require a new census to implement it. The second is you require a new delimitation. In my view, it's quite simple. This bill can be implemented today by giving 33% of seats to women. So I wonder if this is not designed to push the ball forward to 7, 8, 9 years and then let this thing play out the way it does,\" Rahul Gandhi said.",R.drawable.h2,"Sep 20, 2023 06:24 PM IST"))
        newslist.add(NewsModel("Poulomi Ghosh","home","ICC roasted as fans reject World Cup 2023 anthem minutes after its launch","The International Council (ICC) on Wednesday, launched the official anthem of World Cup 2023 which begins in India on October 5. The anthem is called 'Dil Jashn Bole' and it stars Bollywood actor Ranveer Singh in the lead role. The music has been created by Pritam, one of Bollywood's most coveted composers. The anthem also features choreographer Dhanashree Verma, who is the wife of India leg-spinner Yuzvendra Chahal. The three-minute 22-second-long anthem shows a journey through India on board the 'One Day Express'.\n" +
                "\n" +
                "Ranveer Singh and Dhanashree Verma in the World Cup 2023 anthem\n" +
                "Ranveer Singh and Dhanashree Verma in the World Cup 2023 anthem\n" +
                "Speaking about the Anthem launch, Ranveer Singh said: \"As a part of the Star Sports family and a die-hard cricket fan, being part of this anthem launch for the ICC Men's Cricket World Cup 2023 is truly an honor. It's a celebration of the sport we all love.\"\n" +
                "\n" +
                "Music composer Pritam said the song is aimed to invite the world to come and celebrate the cricket extravaganza. \"Cricket is India's greatest passion and composing 'Dil Jashn Bole' for the biggest World Cup ever, has been a tremendous honour for me. This song is not just for 1.4 billion Indian fans but for the whole world to come to India and be a part of the biggest celebration ever,\" he said.\n" +
                "\n" +
                "\"The music video encapsulates the emotions of the global fan community, uniting nations and fans across different cultures. The fan-centric anthem represents an epic celebration, designed to resonate with hearts and ignite spirits. The anthem embodies the World Cup combining the unique Indian passion for cricket with the national pride of all competing nations to create an unrivalled global sporting occasion,\" ICC said.\n" +
                "\n" +
                "Despite ICC's efforts, the song did not receive a warm welcome from fans on social media. ICC was criticised heavily for not being able to capture the pulse of cricket fans like the anthems of previous editions in 2011 and 2015. The 2011 World Cup anthem song was composed by Shankar Mahadevan and was called \"De Ghumake\"",R.drawable.h3,"Published 12 hours ago"))
        newslist.add(NewsModel("David Charls","home","Childhood Cancer: Health expert dispels myths and taboos, shares important facts","The word “CANCER” can send chills down the spine, the moment it’s uttered and when cancer affects a child, it is almost unexpected and unacceptable, often assumed to be a myth however, it is high time that we address this issue with facts, so that all of us in the society can contribute to achieving better survival rates for childhood cancers. We should participate in supporting these children morally, socially, medically and financially to dispel all the myths and taboos surrounding this term.",R.drawable.health3,"Published 12 hours ago"))
         rvHome.layoutManager = LinearLayoutManager(context)
        adapter = NewsAdapter(newslist)
        rvHome.adapter = adapter





        return v
    }

}
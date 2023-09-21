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
import retrofit2.Call
import retrofit2.Response

class EntertainmentFragment : Fragment() {
    private lateinit var rvEntertainment: RecyclerView
    private lateinit var newslist:ArrayList<NewsModel>
    private lateinit var adapter: NewsAdapter
    private val category :String = "entertainment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val v = inflater.inflate(R.layout.fragment_entertainment, container, false)

        rvEntertainment = v.findViewById(R.id.rvofentertainment)
        newslist = ArrayList()

        newslist.add(NewsModel("Telugu Cinema","enter","Allu Arjun shares happy pics from Ganesh Chaturthi celebrations with wife, kids","Allu Arjun celebrated Ganesh Chaturthi with his family on Monday. He shared a glimpse of the celebrations at home on Instagram Stories. While he decked up in a white kurta-pyjama, his wife Sneha Reddy and kids Ayaan and Arha wore yellow ensembles for the festival. They brought the Ganpati home and set up a floral podium for the deity. Also read: Allu Arjun reviews Jawan, calls it Shah Rukh Khan's 'massiest avatar ever'; he gushes over Pushpa in response",R.drawable.enter1,"Sep 19, 2023 10:31 AM IST"))
        newslist.add(NewsModel("HT Entertainment Desk","enter","Made In India: SS Rajamouli announces Dadasaheb Phalke biopic. Watch","SS Rajamouli is back with a new story and this time he would be the force behind the biopic of Indian cinema, titled Made In India. It is said to be based on ‘the father of Indian cinema’ Dadasaheb Phalke. The film will be directed by National Award-winning filmmaker Nitin Kakkar and will be released in six languages – Marathi, Telugu, Hindi, Tamil, Malayalam and Kannada. Also read: SS Rajamouli felt Aamir Khan was overacting in Laal Singh Chaddha: Mansoor Khan",R.drawable.enter2,"Published 18 mins ago"))
        newslist.add(NewsModel("Sumanti Sen","enter","General Hospital star Billy Miller’s mom reveals actor died by suicide after ‘valiant battle with bipolar depression’","General Hospital star Billy Miller’s mother has revealed that the 43-year-old died by suicide. Billy died on Friday, September 15, in Austin, Texas. Billy’s mother, Patricia Miller, released the statement via Billy’s manager, who posted the message on X (formerly Twitter).\n" +
                "\n" +
                "Billy Miller died on Friday, September 15, in Austin, Texas (IMDb)\n" +
                "Billy Miller died on Friday, September 15, in Austin, Texas (IMDb)\n" +
                "Patricia revealed in a statement to Soap Opera Digest that her son took his own life. “He fought a long hard valiant battle with bipolar depression for years,” Patricia said of Billy. “He did everything he could to control the disease.” She added that Billy “loved his family, his friends and his fans but in the end the disease won the fight and he surrendered his life.”\n" +
                "\n" +
                "Patricia said that “the other causes of death being told are not true,” as there were multiple speculations about Billy’s cause of death after the news of his passing surfaced, adding, 'I wish they were but they just aren't.”\n" +
                "\n" +
                "‘We all loved him so much and are desperately trying to deal with our loss’\n" +
                "Saying she was grateful for the response she received from her son’s fans, Patricia said, “I want to personally thank the many fans & personal friends for the overwhelming amount of love, prayers & condolences sent to me and my family on the devastating death of my beautiful son BJ - Billy Miller.”\n" +
                "\n" +
                "“We all loved him so much and are desperately trying to deal with our loss. I will have nothing further to say,” she said, adding, “Thanks for the love and support.”\n" +
                "\n" +
                "Billy died just two days before his 44th birthday. He is survived by his mother, Patricia, and his sister, Megan.\n" +
                "\n" +
                "Reps for Billy claimed he was struggling with “manic depression” at the time of his death, TMZ reported. A representative at The Belmont, a restaurant and bar in Los Angeles, California that Billy co-owned previously confirmed his death.\n" +
                "\n" +
                "Discussing suicides can be triggering for some. However, suicides are preventable. If you or someone you know is considering suicide, please contact the National Suicide Hotline at 1-800-273-TALK (8255).",R.drawable.enter3,"Published 1 hour ago"))
        rvEntertainment.layoutManager = LinearLayoutManager(context)
        adapter = NewsAdapter(newslist)
        rvEntertainment.adapter = adapter







        return v
    }

}
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


class SportsFragment : Fragment() {
    private var api :String = "adb6aaba259640ca85ee6ab4a9d83074"
    private lateinit var rvsports: RecyclerView
    private lateinit var newslist:ArrayList<NewsModel>
    private lateinit var adapter: NewsAdapter
    private val country:String = "in"
    private val category :String = "sports"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val v = inflater.inflate(R.layout.fragment_sports, container, false)

        rvsports = v.findViewById(R.id.rvofsports)
        newslist = ArrayList()

        newslist.add(NewsModel("HT Sports Desk","sports","‘I'd lose every year…’ Damian Lillard rejects chances of joining Golden State Warriors","NBA star Damian Lillard’s trade request triggered a huge buzz ahead of the new season. The Portland Trail Blazers guard had asked for a trade earlier this year. There is no update yet on Lillard’s trade and the All-Star guard recently talked about his NBA future. While speaking on ‘It Is What It Is,’ Lillard discussed the idea of representing his hometown team, the Golden State Warriors. Lillard, however, did not seem much impressed with the prospect of him joining the Warriors.\n" +
                "\n" +
                "Portland Trail Blazers guard Damian Lillard(AP)\n" +
                "Portland Trail Blazers guard Damian Lillard(AP)\n" +
                "\"I respect what they've been doing over the last eight, nine years or whatever, and I'm from there obviously. That's home. But I can't go be a part of that. They won four championships. What I look like going to try to do that... It don't even make sense. I'd never do nothing like that. I'd lose every year before I go [to the Warriors],” Lillard said.\n" +
                "\n" +
                "The seven-time NBA All-Star also discussed Kevin Durant’s much-talked-about move to the Golden State Warriors from Oklahoma City Thunder back in 2016. Damian Lillard stated that he wouldn't have switched to the Warriors at that point in time.\n" +
                "\n" +
                "\"If I was in his shoes, I wouldn't have done that personally. I feel like that was a team they lost to. I think they won [the championship] once before he got there. That ain't something that I would have did,” Lillard said.\n" +
                "\n" +
                "Damian Lillard has already spent 11 years of professional career with the Portland Trail Blazers. The 33-year-old had expressed his desire of being traded away from the Trail Blazers more than two months back but he has not got his wish yet.\n" +
                "\n" +
                "According to media reports, Lillard's preference was to join the Miami Heat. But the move did not materialise as the Trail Blazers reportedly did not like the Heat’s trade offer for Lillard. The Heat had to suffer a defeat in the 2023 NBA Finals at the hands of the Denver Nuggets and they would have been glad to have Lillard in their squad.\n" +
                "\n" +
                "A report published by ESPN claimed in July that apart from the Heat, LA Clippers and Philadelphia 76ers were two other teams who had interest in considering trades for Lillard. He came up with a stellar show during the 2022-23 NBA season, having averaged 32.2 points and 7.3 assists.\n" +
                "\n" +
                "Lillard had registered franchise and career high with 71 points and 13 3-pointers, during his side’s 131-114 victory against the Houston Rockets earlier this year in February. Lillard, at the age of 32, emerged as the oldest player in the history of the NBA to record a 70-point game. He also became the eighth different player to collect 70 points in the history of the league.",R.drawable.sp1,"Sep 20, 2023 05:51 PM IST"))
        newslist.add(NewsModel("HT Sports Desk","sports","MLS terminates CF Montreal player’s contract amid fake name and punching row: Report","The Major League Soccer (MLS) has decided to terminate midfielder Matko Miljevic’s contract after the CF Montreal footballer allegedly played in an amateur league under a false name. MLS stated that Miljevic was \"engaging in conduct detrimental to the league and violating his standard player agreement.”\n" +
                "\n" +
                "CF Montreal midfielder Matko Miljevic(USA TODAY Sports)\n" +
                "CF Montreal midfielder Matko Miljevic(USA TODAY Sports)\n" +
                "Quebec sports blog Dans Les Coulisses had earlier reported that Matko Miljevic was found to be playing in the Ligue Quebecoise de Soccer Calcetto (QCSL) using a false name. Miljevic reportedly opted for such a move due to frustration over a lack of adequate game time in MLS. A good friend of Miljevic had reportedly invited him to join the league.\n" +
                "\n" +
                "Miljevic’s QCSL outing, however, did not turn out to be quite fruitful. According to media reports, he was banned for life from the league because of punching another footballer in the face during a game.\n" +
                "\n" +
                "It is being learnt that Miljevic had taken part in three games for his friend's team in the amateur league. Participating in any other tournament other than MLS is understood to be a violation of the standard player contract. The 22-year-old reportedly recorded six goals and two assists having played three matches in QCSL. Six of his eight goal contributions are understood to have come from the same fixture.\n" +
                "\n" +
                "CF Montreal manager Hernan Losada said that the MLS team were aware of the allegations levelled against Matko Miljevic.\n" +
                "\n" +
                "\"We were made aware of the situation, and there is an open investigation into this matter. Matko will not be in training until everything is resolved. The people who need to make decisions will make them, but it's not for me to give my opinion while we're in the middle of an investigation,” Losada was quoted as saying by ESPN.\n" +
                "\n" +
                "A product of the Boca Juniors academy, Matko Miljevic had represented the United States of America U-20 and U-16 sides. He joined CF Montreal on a free transfer in 2021. Since then, he has made 45 appearances for the MLS outfit. Miljevic has three goals under his belt in CF Montreal jersey.\n" +
                "\n" +
                "Miljevic did not get much game time this season. He is understood to have received regular playing time of around 124 minutes in eight MLS matches till now this season. Eight of those league appearances came as a substitute.\n" +
                "\n" +
                "Matko Miljevic made his MLS debut in 2021. He has two goals and as many assists to his name having played 35 matches in the MLS so far. Miljevic made his last CF Montreal appearance against Columbus Crew in MLS earlier this month. Coming off the bench in the 66th minute Miljevic did provide an assist but he could not avoid his side’s defeat in that clash. CF Montreal had to face a 2-4 defeat at the hands of Columbus Crew.",R.drawable.sp2,"Sep 20, 2023 05:43 PM IST"))
        newslist.add(NewsModel("HT Sports Desk","sports","Bayern Munich vs Manchester United, UEFA Champions League: Form guide, H2H record, and likely XI - All you need to know","Manchester United will be without 12 first-team players when they take the field against Bayern Munich on Wednesday night in the Champions League. Big names like defenders Raphael Varane and Harry Maguire and midfielder Mason Mount will not be in action in Manchester United’s Champions League opener at the Allianz Arena in Munich. Meanwhile, English striker Harry Kane will make his Champions League debut for Bayern Munich against a familiar opposition.\n" +
                "\n" +
                "Harry Kane will be aiming at finding the net against a familiar opposition in Bayern's UCL opener(AP)\n" +
                "Harry Kane will be aiming at finding the net against a familiar opposition in Bayern's UCL opener(AP)\n" +
                "Who are the favourites?\n" +
                "Apart from the injury issues, Manchester United’s current form will be a huge point of concern for manager Erik ten Hag. Manchester United are currently struggling at the 13th spot in the Premier League standings. Moreover, the Red Devils have conceded three defeats in the first five matches of a Premier League campaign for the first time since 1989-90.\n" +
                "\n" +
                "Led by goal machine Harry Kane, Bayern Munich’s attacking unit will aim to make full use of Manchester United’s defensive vulnerabilities. In their last four games, Manchester United have conceded 10 goals.\n" +
                "\n" +
                "Bayern Munich are undoubtedly one of the top contenders to win the Champions League this time. The Bavarian giants are unbeaten in their last 19 opening Champions League ties at home. Bayern Munich will head into tonight’s game as the favourites to win the fixture but their striker Harry Kane pointed out that underestimating the English club can prove to be quite dangerous.\n" +
                "\n" +
                "“They've been going through a tough spell recently but sometimes that can make a team dangerous because they want to respond. We're at home and want to control the game but we need to be careful of their threat. I don't think about form because every game can be different. There can be big response from teams going through a difficult spell,” Kane told the reporters yesterday.\n" +
                "\n" +
                "Head-to-head records\n" +
                "Bayern Munich and Manchester United have so far faced each other 11 times across all competitions. The defending Bundesliga champions hold an advantage, having bagged four wins against Manchester United till now. Manchester United, on the other hand, have managed to win in two matches against Bayern.\n" +
                "\n" +
                "Form guide\n" +
                "Bayern Munich will enter the Champions League having been unbeaten in their last four games. They were last defeated by RB Leipzig in the Super Cup final in August. In their last fixture, Thomas Tuchel’s men played out a 2-2 draw with Bayer Leverkusen in Bundesliga.\n" +
                "\n" +
                "Manchester United did not have an impressive start to their Premier League campaign this season. Manchester United, in their Premier League opener, claimed a 1-0 win against Wolves. But since then, they have only been able to pick up one win in their next four games. In their last game, Manchester United had to face 1-3 defeat at the hands of Brighton at Old Trafford.\n" +
                "\n" +
                "First XI prediction\n" +
                "In the absence of Raphael Varane and Harry Maguire, Sweden’s Victor Lindelof and Argentina’s Lisandro Martinez are expected to play as centre-backs for Manchester United tonight. With Marcus Rashford and Bruno Fernandes handling midfield duties, Rasmus Hojlund is expected to be deployed as a forward against Bayern Munich. Thomas Tuchel, on the other hand, does not have too many injury issues to deal with. Apart from injured Manuel Neuer and Raphael Guerreiro, Tuchel has a full squad at his disposal.",R.drawable.sp3,"Sep 20, 2023 12:23 PM IST"))

        rvsports.layoutManager = LinearLayoutManager(context)
        adapter = NewsAdapter(newslist)
        rvsports.adapter = adapter





        return v
    }

}
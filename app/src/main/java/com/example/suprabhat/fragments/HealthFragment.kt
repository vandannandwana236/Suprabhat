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


class HealthFragment : Fragment() {
    private lateinit var rvhealth: RecyclerView
    private lateinit var newslist:ArrayList<NewsModel>
    private lateinit var adapter: NewsAdapter
    private val category :String = "health"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val v = inflater.inflate(R.layout.fragment_health, container, false)

        rvhealth = v.findViewById(R.id.rvofhealth)
        newslist = ArrayList()

        newslist.add(NewsModel("David Charls","health","Childhood Cancer: Health expert dispels myths and taboos, shares important facts","The word “CANCER” can send chills down the spine, the moment it’s uttered and when cancer affects a child, it is almost unexpected and unacceptable, often assumed to be a myth however, it is high time that we address this issue with facts, so that all of us in the society can contribute to achieving better survival rates for childhood cancers. We should participate in supporting these children morally, socially, medically and financially to dispel all the myths and taboos surrounding this term.",R.drawable.health1,"Published 12 hours ago"))
        newslist.add(NewsModel("David Charls","health","Almonds with energy-restricted diets aid in weight loss, improve cardiometabolic health: Study","When it comes to weight reduction, nuts often get a poor rap: while they're high in protein, they're also heavy in fat, which often puts people off. However, recent research from the University of South Australia indicates that you can eat almonds and lose weight at the same time.\n" +
                "\n" +
                "Researchers showed that when energy-restricted diets were supplemented with Californian almonds or carbohydrate-rich snacks, both diets successfully lowered body weight by roughly 7kg.\n" +
                "\n" +
                "More than 1.9 billion persons worldwide are overweight (650 million are obese). In Australia, two out of every three persons (about 12.5 million adults) are overweight or obese.\n" +
                "\n" +
                "According to UniSA researcher Dr Sharayah Carter, the study shows how nuts can help with weight control and cardiometabolic health.\n" +
                "\n" +
                "“Nuts, like almonds, are a great snack. They’re high in protein, and fibre, and packed with vitamins and minerals, but they also have a high fat content which people can associate with increased body weight,” Dr Carter said.\n" +
                "\n" +
                "“Nuts contain unsaturated fats – or healthy fats – which can improve blood cholesterol levels, ease inflammation, and contribute to a healthy heart.\n" +
                "\n" +
                "“In this study, we examined the effects of an almond-supplemented diet with a nut-free diet to identify any influence on weight and cardiometabolic outcomes.\n" +
                "\n" +
                "“Both the nut and nut-free diets resulted in approximately 9.3 per cent reduction in body weight over the trial.\n" +
                "\n" +
                "“Yet the almond-supplemented diets also demonstrated statistically significant changes in some highly atherogenic lipoprotein subfractions, which may lead to improved cardiometabolic health in the longer term.\n" +
                "\n" +
                "“Additionally, nuts have the added benefit of making you feel fuller for longer, which is always a pro when you’re trying to manage your weight.",R.drawable.health2,"Sep 19, 2023 10:49 AM IST"))
        newslist.add(NewsModel("David Charls","health","8 signs that your body is warning you against hitting the treadmill","Regular exercise and an active lifestyle are considered heart-healthy habits, but going overboard with workout can be detrimental. The recent case of a young man losing his life after having a heart attack in gym has brought to focus the adverse effects of overexercising. It also makes us wonder if one can read the signs of cardiac trouble beforehand and take measures to prevent a heart attack. Experts say if you are feeling dizzy, having chest pain or discomfort, shortness of breath, nausea, fatigue or weakness, you should avoid hitting the treadmill that day to prevent risk of heart attack. (Also read: Heart attack cases not rising due to Covid vaccine, but stress and other traditional factors, says cardiologist)\n" +
                "\n" +
                "One of the most critical warning signs is chest pain or discomfort during exercise(Pixabay)\n" +
                "One of the most critical warning signs is chest pain or discomfort during exercise(Pixabay)\n" +
                "\"People going to the gym mostly are young people. So, if you are having palpitation, shortness of breath, or fatiguability, these are the symptoms and signs a person is having at intervals, not on a regular basis, so first he should get his cardiovascular system checked up then only he should go for any treadmill, or gym or external exercise. Similarly, at an advanced age particularly after 40-45 years if somebody is having heaviness or tightness in the chest or shoulder or back during an exertion, during walking, or some uneasiness in the chest, these are the signs that one should not ignore, and should get his cardiac evaluation done, then only he could go for gym or treadmill,\" says Dr Bhupendra Singh, Consultant Cardiologist, Manipal Hospital, Ghaziabad.\n" +
                "\n" +
                "\"Secondly, if a person is diabetic or he is hypertensive or he has a family history of coronary artery disease, these are the patients who are at a higher risk of having blockage or any coronary artery disease. So, they need regular check-ups. So, if you are at high risk, even a small or intermittent sign or symptom of these what I have just now narrated should not be ignored and he should undergo his evaluation first and then go for the gym or treadmill in consultation and supervision of his cardiologist or physician. So, these are certain signs and symptoms, somebody is having, should avoid the treadmill and gym,\" adds Dr Singh.\n" +
                "\n" +
                "\"If you are planning to start exercising after a sedentary lifestyle, then remember that you can't suddenly start high-intensity workouts or high-intensity treadmills. It's very important that if you've had a sedentary lifestyle, you first go and get your health checkup done, get BP, diabetes and cholestrol checked to confirm whether you're fit to start rigorous exercise regimen. After that, whenever you start exercising, it should be very gradual. So, initially, start by walking slowly, then increase the speed, and then go on to running. You can't straight away start by running at a very high speed. It's not good for your heart. Also, remember that whenever you're going to exercise, you need to hydrate yourself well. You need to look at what you are eating and drinking. You need to look at your lifestyle and stop smoking. Also, it's very important to not ignore the warning signs. For example, when you walk or run, you may get breathless, or you feel some chest discomfort or dizziness. These are all warning signs. They should not be ignored. They must be looked into by your doctor. If he tells you that these are okay for you, then only you should go ahead and exercise. So it's important for everybody to exercise, but it must be done in the proper way so that it is gradually up-titrated and suddenly high-impact and high-energy exercises should not be done,\" says Dr Sarita Rao, Senior Interventional Cardiologist, Apollo Hospital Indore.\n" +
                "\n" +
                "\"Regular exercise is crucial for maintaining good health, and treadmills are a popular choice for those looking to improve their cardiovascular fitness. However, it's equally important to pay attention to your body signals during exercise, as pushing too hard without recognising warning signs can have serious consequences, including the risk of cardiac arrest. Let's discuss the signs your body might be warning you against hitting the treadmill too hard and how to exercise safely,\" says Dr. Debashish Chanda - Orthopaedics & Joint Replacement Specialist, CK Birla Hospital, Gurugram\n" +
                "\n" +
                "1. Chest pain or discomfort\n" +
                "One of the most critical warning signs is chest pain or discomfort during exercise. While a mild burning sensation in the chest can be normal during a workout, sharp or prolonged pain can indicate an issue. This pain might radiate to the arms, neck, jaw, or back. It's essential not to ignore any chest discomfort and to seek immediate medical attention if it persists.\n" +
                "\n" +
                "2. Shortness of breath\n" +
                "Feeling short of breath during exercise is common, especially if you're pushing yourself. However, if you experience severe or sudden breathlessness, it can be a red flag. This could be due to an underlying heart problem, so it's important to stop exercising and consult a healthcare professional.\n" +
                "\n" +
                "3. Dizziness or light-headedness\n" +
                "If you become dizzy or lightheaded while using the treadmill, it could indicate issues with blood pressure or circulation. These symptoms should not be taken lightly, as they may precede fainting or a fall, potentially leading to injuries.\n" +
                "\n" +
                "4. Irregular heartbeat or palpitations\n" +
                "An irregular heartbeat, known as arrhythmia, can be a serious concern during exercise. If you feel your heart racing or fluttering irregularly, it's time to stop and seek medical attention. Monitoring your heart rate during exercise can help you identify abnormalities.\n" +
                "\n" +
                "5. Nausea or vomiting\n" +
                "Intense nausea or vomiting during a workout can be a sign of overexertion. This may lead to dehydration and electrolyte imbalances, which can be particularly dangerous for your heart. If you experience persistent nausea, it's crucial to rest and rehydrate.\n" +
                "\n" +
                "6. Extreme fatigue\n" +
                "While it's normal to feel tired after a challenging treadmill session, experiencing extreme fatigue or weakness during exercise can be a warning sign. This could indicate issues with your heart's ability to pump blood effectively.\n" +
                "\n" +
                "7. Cold sweats\n" +
                "Sudden cold sweats, especially when accompanied by other symptoms like chest pain or shortness of breath, may signal a heart-related problem. Don't dismiss these symptoms; seek medical help promptly.\n" +
                "\n" +
                "8. Pain or discomfort in other body parts\n" +
                "Apart from chest pain, any unusual pain or discomfort in your arms, neck, jaw, or back during exercise should be taken seriously. These symptoms can sometimes be indicative of heart issues and should not be ignored.\n" +
                "\n" +
                "\"Exercise is undoubtedly beneficial for your overall health, but it's equally important to prioritize safety. Your body provides warning signs for a reason – to protect you from harm. If you experience any of these warning signs while using the treadmill, stop immediately, and seek medical advice. Remember that regular check-ups with your healthcare provider can help identify any underlying issues and guide you in exercising safely. Your health is your most valuable asset, so listen to your body and stay safe on your fitness journey,\" says Dr Chanda.",R.drawable.health3,"Sep 18, 2023 04:07 PM IST"))
        rvhealth.layoutManager = LinearLayoutManager(context)
        adapter = NewsAdapter(newslist)
        rvhealth.adapter = adapter





        return v
    }

}
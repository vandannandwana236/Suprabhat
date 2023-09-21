package com.example.suprabhat.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.suprabhat.fragments.EntertainmentFragment
import com.example.suprabhat.fragments.HealthFragment
import com.example.suprabhat.fragments.HomeFragment
import com.example.suprabhat.fragments.ScienceFragment
import com.example.suprabhat.fragments.SportsFragment
import com.example.suprabhat.fragments.TechnologyFragment

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 5
    }

    override fun getItem(position: Int): Fragment {
        if(position == 0){

            return HomeFragment()

        }else if(position == 1){

            return SportsFragment()

        }else if(position == 2){

            return HealthFragment()

        }else if(position ==3){

            return ScienceFragment()

        }else{

            return EntertainmentFragment()

        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        if(position == 0){

            return "Home"

        }else if(position == 1){

            return "Sports"

        }else if(position == 2){

            return "Health"

        }else if(position ==3){

            return "Science"

        }else if(position == 4){

            return "Entertainment"

        }else{
            return "Technology"
        }
    }
}
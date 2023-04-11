package com.example.tablayoutkotlin

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class ViewPagerMessengerAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            ChatsFragment()
        } else if (position == 1) {
            StatusFragment()
        } else { //For 2 Calls Fragment
            CallsFragment()
        }
    }

    override fun getCount(): Int {
        return 3 //No. Of Tabs
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return if (position == 0) {
            "Chats"
        } else if (position == 1) {
            "Status"
        } else { //For 2 Calls Fragment
            "Calls"
        }
    }
}

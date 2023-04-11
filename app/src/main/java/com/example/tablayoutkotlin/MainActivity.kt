package com.example.tablayoutkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {


    var tab: TabLayout? = null
    var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tab = findViewById(R.id.tab)
        viewPager = findViewById(R.id.viewPager)

        val adapter = ViewPagerMessengerAdapter(supportFragmentManager)
        viewPager?.setAdapter(adapter)

        tab?.setupWithViewPager(viewPager)
    }
}
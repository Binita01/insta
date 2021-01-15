package com.binitasimbu.fragments

import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.binitasimbu.fragments.Adapter.ViewPageAdapter
import com.binitasimbu.fragments.fragments.AreaFragment
import com.binitasimbu.fragments.fragments.SumFragment

class TabActivity2 : AppCompatActivity() {
    private lateinit var lstTitle: ArrayList<String>
    private lateinit var lstFragment: ArrayList<Fragment>
    private lateinit var viewPage: ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab2)
        viewPage=findViewById(R.id.viewPage)
        tabLayout=findViewById(R.id.tabLayout)

        populateList()
        val adapter=ViewPageAdapter(lstFragment,supportFragmentManager,lifecycle)
        viewPage.adapter=adapter
        TabLayoutMediator(tabLayout,viewPage){ tab,position ->
            tab.text=lstTitle[position]
        }.attach()

    }
    private fun populateList(){
        lstTitle=ArrayList<String>()
        lstTitle.add("Sum")
        lstTitle.add("Area of circle")
        lstFragment=ArrayList<Fragment>()
        lstFragment.add(SumFragment())
        lstFragment.add(AreaFragment())
    }
}
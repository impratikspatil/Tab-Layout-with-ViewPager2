package com.example.tab_layoutviewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.example.tab_layoutviewpager2.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val imglist= listOf(
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.img8,
            R.drawable.img9,
            R.drawable.four,
            R.drawable.my,
            R.drawable.eight

        )

        val ap=ViewPagerAdapter(imglist)           //here we have passed "imglist" array to adapter
        binding.viewpager.adapter=ap   //here we set adapter "ap" with viewpager

        binding.viewpager.orientation= ViewPager2.ORIENTATION_HORIZONTAL  //this is for setting  orientation of viewpager

        TabLayoutMediator(binding.tablayout,binding.viewpager){tab, position ->
            tab.text="TAB ${position+1}"              //this part of code will give the  name to tabs like TAB1 TAB2 TAB3 TAB4 and so
                                                      //we can also add other things also in  tab

        }.attach()  // this method will attach tab-layout with viewpager




    }
}
package com.example.day24recyclerviewnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var myRecyclerView: RecyclerView
    lateinit var newsArrayList:ArrayList<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView=findViewById(R.id.recyclerView)


        var newsImageArray= arrayOf(R.drawable.pic0,R.drawable.pic1,
            R.drawable.pic2,R.drawable.pic3)

        var newsHeadingArray= arrayOf("Ukraine, Russia and the tense UN encounter that almost happened — but didn’t",
            "Free power to cheaper LPG, it’s ‘freebie’ season in MP. But Congress hits brakes, flags deficit",
            "World Bank Cautions Pakistan As Nearly 100 Million People Now Under Poverty",
            "North Korea’s powerful politburo discusses follow-up steps to Kim Jong Un recent visit to Russia"
        )
        // set haw bhaw of items inside recyclerview i.e, vertically scrolling, horizontally scrolling, unoform grid
        myRecyclerView.layoutManager= LinearLayoutManager(this)
        newsArrayList= arrayListOf<News>()
        for(x in newsImageArray.indices){
            val news=News(newsHeadingArray[x], newsImageArray[x])
            newsArrayList.add(news)
        }

        myRecyclerView.adapter=MyAdapter(newsArrayList,this )

    }

}
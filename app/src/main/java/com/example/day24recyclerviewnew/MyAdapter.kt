package com.example.day24recyclerviewnew

import android.content.Context
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var newsArrayList:ArrayList<News>,var context:Context ):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>()
{
}
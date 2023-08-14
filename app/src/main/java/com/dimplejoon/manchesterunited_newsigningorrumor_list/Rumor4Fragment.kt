package com.dimplejoon.manchesterunited_newsigningorrumor_list

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Rumor4Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_rumor4, container, false)

        val items = mutableListOf<String>()
        items.add("Italia,Emilia-Romagna, 2001/3/26, France")
        items.add("◼ 192cm, 80kg, right foot")
        items.add("◼ National Team: France(Guadeloupe)")
        items.add("◼ Position : Centeral Midfielder")
        items.add("⚫ Team History")
        items.add("AS Monaco(Youth) 2016~2018")
        items.add("AS Monaco 2018~2019")
        items.add("OGC Nice 2019~")

        val rv = view.findViewById<RecyclerView>(R.id.detailRv)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.amrabat).setOnClickListener {
            it.findNavController().navigate(R.id.action_rumor4Fragment_to_rumor1Fragment)
        }

        view.findViewById<ImageView>(R.id.pavard).setOnClickListener {
            it.findNavController().navigate(R.id.action_rumor4Fragment_to_rumor2Fragment)
        }

        view.findViewById<ImageView>(R.id.thuram).setOnClickListener {
            it.findNavController().navigate(R.id.action_rumor4Fragment_to_rumor3Fragment)
        }

        view.findViewById<TextView>(R.id.toSigning4).setOnClickListener{
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}



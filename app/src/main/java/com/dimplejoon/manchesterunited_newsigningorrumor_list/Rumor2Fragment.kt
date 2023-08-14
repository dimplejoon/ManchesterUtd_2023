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

class Rumor2Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_rumor2, container, false)

        val items = mutableListOf<String>()
        items.add("France,Hauts-de-France, 1996/3/28, France")
        items.add("◼ 186cm, 81kg, right foot")
        items.add("◼ National Team: France")
        items.add("◼ Position : Centerback, Rightback")
        items.add("⚫ Team History")
        items.add("LOSC Lille(Youth) ~2015")
        items.add("LOSC Lille 2015~2016")
        items.add("VFB Stuttgart 2016~2017")
        items.add("FC Bayern Munich 2019~")

        val rv = view.findViewById<RecyclerView>(R.id.detailRv)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.amrabat).setOnClickListener {
            it.findNavController().navigate(R.id.action_rumor2Fragment_to_rumor1Fragment)
        }

        view.findViewById<ImageView>(R.id.todibo).setOnClickListener {
            it.findNavController().navigate(R.id.action_rumor2Fragment_to_rumor3Fragment)
        }

        view.findViewById<ImageView>(R.id.thuram).setOnClickListener {
            it.findNavController().navigate(R.id.action_rumor2Fragment_to_rumor4Fragment)
        }

        view.findViewById<TextView>(R.id.toSigning2).setOnClickListener{
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}

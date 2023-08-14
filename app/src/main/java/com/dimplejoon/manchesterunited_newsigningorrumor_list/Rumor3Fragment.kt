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

class Rumor3Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_rumor3, container, false)

        val items = mutableListOf<String>()
        items.add("France,Guyane, 1999/12/30, France")
        items.add("◼ 190cm, 88kg, right foot")
        items.add("◼ National Team: France")
        items.add("◼ Position : Centerback")
        items.add("⚫ Team History")
        items.add("FC LES Lilas 93(Youth) 2007~2016")
        items.add("Toulouse FC(Youth) 2016~2018")
        items.add("Toulouse FC 2018~2019")
        items.add("FC Bacelona 2019")
        items.add("FC Schalke 04(Loan) 2019~2020")
        items.add("FC Bacelona 2020")
        items.add("SL Benfica(Loan) 2020~2021")
        items.add("OGC NICE(Loan) 2021")
        items.add("OGC NICE 2021~")

        val rv = view.findViewById<RecyclerView>(R.id.detailRv)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.amrabat).setOnClickListener {
            it.findNavController().navigate(R.id.action_rumor3Fragment_to_rumor1Fragment)
        }

        view.findViewById<ImageView>(R.id.pavard).setOnClickListener {
            it.findNavController().navigate(R.id.action_rumor3Fragment_to_rumor2Fragment)
        }

        view.findViewById<ImageView>(R.id.thuram).setOnClickListener {
            it.findNavController().navigate(R.id.action_rumor3Fragment_to_rumor4Fragment)
        }

        view.findViewById<TextView>(R.id.toSigning3).setOnClickListener{
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}
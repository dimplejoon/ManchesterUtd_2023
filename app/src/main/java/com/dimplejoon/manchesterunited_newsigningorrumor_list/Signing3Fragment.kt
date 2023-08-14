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

class Signing3Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_signing3, container, false)

        val items = mutableListOf<String>()
        items.add("Cameroon, 1996/4/27")
        items.add("◼ 190cm, 93kg ,right foot")
        items.add("◼ National team : Cameroon<retire>")
        items.add("◼ Position : Goal Keeper")
        items.add("⚫︎ Team History")
        items.add("FC Barcelona<youth> 2010~2015")
        items.add("AFC Ajax<youth> 2015~2016")
        items.add("AFC Ajax 2016~2022")
        items.add("FC Internazionale Milano 2022~2023")
        items.add("Manchester United 2023~")

        val rv = view.findViewById<RecyclerView>(R.id.detailRv)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)


        view.findViewById<ImageView>(R.id.mason).setOnClickListener {
            it.findNavController().navigate(R.id.action_signing3Fragment_to_signing1Fragment)
        }

        view.findViewById<ImageView>(R.id.jonny).setOnClickListener {
            it.findNavController().navigate(R.id.action_signing3Fragment_to_signing2Fragment)
        }

        view.findViewById<ImageView>(R.id.rasmus).setOnClickListener {
            it.findNavController().navigate(R.id.action_signing3Fragment_to_signing4Fragment)
        }

        view.findViewById<TextView>(R.id.toRumor3).setOnClickListener{
            val intent = Intent(activity, RumorActivity::class.java)
            startActivity(intent)
        }

        return view

    }


}
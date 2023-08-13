package com.dimplejoon.manchesterunited_newsigningorrumor_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Signing2Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_signing2, container, false)

        val items = mutableListOf<String>()
        items.add("Nothern Ireland, Belfast, 1988/1/3, Jonathan Grant Evans MBE")
        items.add("◼ 188cm, 77kg ,right foot")
        items.add("◼ National team : Nothern Ireland")
        items.add("◼ Position : CenterBack")
        items.add("⚫ Team History")
        items.add("Manchester United<youth> 2004~2006")
        items.add("Royal Antwep FC<loan> 2006")
        items.add("Sunderland AFC<loan> 2006~2007")
        items.add("Sunderland AFC<loan> 2008")
        items.add("Manchester United 2008~2015")
        items.add("West Bromwich Albion FC 2015~2019")
        items.add("Leister City FC 2018~2023")
        items.add("Manchester United<short-term contract> 2023")

        val rv = view.findViewById<RecyclerView>(R.id.detailRv)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)


        view.findViewById<ImageView>(R.id.mason).setOnClickListener {
            it.findNavController().navigate(R.id.action_signing2Fragment_to_signing1Fragment)
        }

        view.findViewById<ImageView>(R.id.andre).setOnClickListener {
            it.findNavController().navigate(R.id.action_signing2Fragment_to_signing3Fragment)
        }

        view.findViewById<ImageView>(R.id.rasmus).setOnClickListener {
            it.findNavController().navigate(R.id.action_signing2Fragment_to_signing4Fragment)
        }

        return view

    }

}
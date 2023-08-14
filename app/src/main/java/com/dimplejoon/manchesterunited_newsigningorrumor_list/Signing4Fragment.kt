package com.dimplejoon.manchesterunited_newsigningorrumor_list

import android.content.Intent
import android.media.Image
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

class Signing4Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_signing4, container, false)

        val items = mutableListOf<String>()
        items.add("2003/2/4, Rasmus Winther Hojlund")
        items.add("Denmark,Kovenhavn")
        items.add("◼ 191cm, 85kg ,left foot")
        items.add("◼ National team : Denmark")
        items.add("◼ Position : Striker")
        items.add("⚫ Team History")
        items.add("BK af 1893<youth> ~2015")
        items.add("Brondby IF<youth> 2015~2016")
        items.add("Holbaek<youth> 2016~2017")
        items.add("FC Copenhagen<youth> 2017~2021")
        items.add("FC Copenhagen 2021~2022")
        items.add("Sturm Graz 2021~2022")
        items.add("Atalanta BC 2022~2023")
        items.add("Manchester United 2023~")

        val rv = view.findViewById<RecyclerView>(R.id.detailRv)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.mason).setOnClickListener {
            it.findNavController().navigate(R.id.action_signing4Fragment_to_signing1Fragment)
        }

        view.findViewById<ImageView>(R.id.jonny).setOnClickListener {
            it.findNavController().navigate(R.id.action_signing4Fragment_to_signing2Fragment)
        }

        view.findViewById<ImageView>(R.id.andre).setOnClickListener {
            it.findNavController().navigate(R.id.action_signing4Fragment_to_signing3Fragment)
        }

        view.findViewById<TextView>(R.id.toRumor4).setOnClickListener{
            val intent = Intent(activity, RumorActivity::class.java)
            startActivity(intent)
        }

        return view

    }

}


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

class Rumor1Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_rumor1, container, false)

        val items = mutableListOf<String>()
        items.add("1996/8/21, Netherland(Morocco)")
        items.add("Netherland,Noord-Holland")
        items.add("◼ 184cm, 70kg, right foot")
        items.add("◼ National Team: Morocco")
        items.add("◼ Position : Defensive Midfielder")
        items.add("⚫ Team History")
        items.add("Zuidvogels(youth) ~2007")
        items.add("FC Utrecht(u19,youth) 2007~2014")
        items.add("FC Utrecht 2014~2017")
        items.add("Feyenoord Rotterdam 2017~2018")
        items.add("Club Brugge 2018~2019")
        items.add("Hellas Verona FC(loan) 2019~2020")
        items.add("Hellas Verona FC 2020")
        items.add("Hellas Verona(loan) FC 2020")
        items.add("ACF Fiorentina 2021~")

        val rv = view.findViewById<RecyclerView>(R.id.detailRv)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.pavard).setOnClickListener {
            it.findNavController().navigate(R.id.action_rumor1Fragment_to_rumor2Fragment)
        }

        view.findViewById<ImageView>(R.id.todibo).setOnClickListener {
            it.findNavController().navigate(R.id.action_rumor1Fragment_to_rumor3Fragment)
        }

        view.findViewById<ImageView>(R.id.thuram).setOnClickListener {
            it.findNavController().navigate(R.id.action_rumor1Fragment_to_rumor4Fragment)
        }

        view.findViewById<TextView>(R.id.toSigning1).setOnClickListener{
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }

        return view
    }

}
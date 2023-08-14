package com.dimplejoon.manchesterunited_newsigningorrumor_list

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Signing1Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private val delayMillis: Long = 5000
    private var downTime: Long = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_signing1, container, false)

        val items = mutableListOf<String>()
        items.add("1999/1/10, Mason Tony Mount")
        items.add("England,Hampshire,Portmouth")
        items.add("◼ 181cm, 74kg ,right foot")
        items.add("◼ National team : England")
        items.add("◼ Position : Attacking MF, central MF, Winger")
        items.add("⚫ Team History")
        items.add("Chelsea FC<youth> 2005~2017")
        items.add("SBV Vitesse<loan> 2017~2018")
        items.add("Derby County<loan> 2018~2019")
        items.add("Chelsea FC 2018~2023")
        items.add("Manchester United 2023~")

        val rv = view.findViewById<RecyclerView>(R.id.detailRv)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.jonny).setOnClickListener {
            it.findNavController().navigate(R.id.action_signing1Fragment_to_signing2Fragment)
        }

        view.findViewById<ImageView>(R.id.andre).setOnClickListener {
            it.findNavController().navigate(R.id.action_signing1Fragment_to_signing3Fragment)
        }

        view.findViewById<ImageView>(R.id.rasmus).setOnClickListener {
            it.findNavController().navigate(R.id.action_signing1Fragment_to_signing4Fragment)
        }

        view.findViewById<TextView>(R.id.toRumor1).setOnClickListener{
            val intent = Intent(activity, RumorActivity::class.java)
            startActivity(intent)
        }

        return view
    }

}
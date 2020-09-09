package com.example.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.navigationkotlin.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
lateinit var secondBinding: FragmentSecondBinding
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        secondBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_second, container, false)
        var str: String? = requireArguments().getString("input_txt").toString()
        secondBinding.ss.text=str

        return secondBinding.root
    }

}
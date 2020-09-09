package com.example.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navigationkotlin.databinding.FragmentHomeBinding


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

private lateinit var homeBinding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        homeBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)
        homeBinding.button.setOnClickListener {
            val bundle= bundleOf("input_txt" to homeBinding.editTextTextPersonName.text.toString())
            it.findNavController().navigate(R.id.action_homeFragment2_to_secondFragment,bundle)
        }
        return homeBinding.root
    }


}
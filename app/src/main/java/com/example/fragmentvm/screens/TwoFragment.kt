package com.example.fragmentvm.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.example.fragmentvm.R
import com.example.fragmentvm.databinding.FragmentTwoBinding


class TwoFragment : Fragment() {

    private lateinit var binding: FragmentTwoBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentTwoBinding.inflate(layoutInflater, container, false)
        val mViewModel: MyViewModel by activityViewModels()
        mViewModel.myLiveData.observe(viewLifecycleOwner, {
            binding.tvTwo.text = it
        })


        return binding.root
    }


}
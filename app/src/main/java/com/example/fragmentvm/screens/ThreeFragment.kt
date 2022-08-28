package com.example.fragmentvm.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.fragmentvm.R
import com.example.fragmentvm.databinding.FragmentThreeBinding


class ThreeFragment : Fragment() {

    private lateinit var binding: FragmentThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentThreeBinding.inflate(layoutInflater, container, false)
        val mViewModel: MyViewModel by activityViewModels()
        mViewModel.myLiveData.observe(viewLifecycleOwner, {
            binding.tvThree.text = it
        })


        binding.btnSend.setOnClickListener {
            mViewModel.myLiveData.value = "Hello"
        }

        return binding.root
    }

}
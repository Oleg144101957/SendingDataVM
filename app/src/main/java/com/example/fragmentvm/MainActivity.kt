package com.example.fragmentvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentvm.databinding.ActivityMainBinding
import com.example.fragmentvm.screens.OneFragment
import com.example.fragmentvm.screens.ThreeFragment
import com.example.fragmentvm.screens.TwoFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        val fragOne = OneFragment()
        val fragTwo = TwoFragment()
        val fragThree = ThreeFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.containerOne, fragOne)
            replace(R.id.containerTwo, fragTwo)
            replace(R.id.containerThree, fragThree)
        }.commit()

    }
}
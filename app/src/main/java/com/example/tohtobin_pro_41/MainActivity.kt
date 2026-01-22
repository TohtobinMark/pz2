package com.example.tohtobin_pro_41

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.tohtobin_pro_41.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var bottomNavView: BottomNavigationView
    private lateinit var currentFragment: Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navController = findNavController(R.id.nav_host_fragment)
        bottomNavView = binding.bottomNav
        bottomNavView.setupWithNavController(navController)
        loadFragment(PhotoFragment(), "photos")
    }
    private fun loadFragment(fragment: Fragment, tag: String) {
        currentFragment = fragment
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(
            R.anim.slide_in_right,
            R.anim.slide_out_left,
            R.anim.slide_in_left,
            R.anim.slide_out_right
        )
            .replace(R.id.nav_host_fragment, fragment, tag)
            .addToBackStack(tag)
            .commit()
    }
}
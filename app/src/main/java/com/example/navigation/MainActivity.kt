package com.example.navigation

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_menu.*

class MainActivity : AppCompatActivity(){

    //
    private lateinit var homeFragment: HomeFragment
    private lateinit var menuFragment: MenuFragment


    companion object {

        const val TAG : String = "로그"
    }

    //메모리에 올라갔을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //레이아웃과 연결
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate() called")
        bottom_nav.setOnNavigationItemReselectedListener(onBottomNavItemSelectedListener)

        homeFragment = HomeFragment.newInstance()
        supportFragmentManager.beginTransaction().add(R.id.fragment_frame, homeFragment).commit()

    }

    private val onBottomNavItemSelectedListener = BottomNavigationView.OnNavigationItemReselectedListener{
        when(it.itemId){
            R.id.menu_home -> {
                Log.d(TAG, "MainActivity - 홈버튼 클릭!")
                homeFragment = HomeFragment.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_frame, homeFragment).commit()
            }
            R.id.menu_menu -> {
                Log.d(TAG, "MainActivity - 메뉴버튼 클릭!")
                menuFragment = MenuFragment.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_frame, menuFragment).commit()
            }

            }

        true
    }

//    override fun onNavigationItemReselected(item: MenuItem) {
//        TODO("Not yet implemented")
//        Log.d(TAG, "MainActivity - onNavigationItemReselected() called ")


    }

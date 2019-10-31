package com.hakimlabs.rumahfiqih

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.hakimlabs.rumahfiqih.features.videos.ListVideoFragment
import kotlinx.android.synthetic.main.activity_main.navigation

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    supportFragmentManager.findFragmentByTag(LIST_VIDEO_FRAGMENT_TAG) as? ListVideoFragment
                        ?: ListVideoFragment.newInstance().also {
                            supportFragmentManager.beginTransaction()
                                .add(R.id.fragment_container, it, LIST_VIDEO_FRAGMENT_TAG)
                                .commit()
                        }
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_dashboard -> {
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_notifications -> {
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.findFragmentByTag(LIST_VIDEO_FRAGMENT_TAG) as? ListVideoFragment
            ?: ListVideoFragment.newInstance().also {
                supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, it, LIST_VIDEO_FRAGMENT_TAG)
                    .commit()
            }

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    companion object {
        private const val LIST_VIDEO_FRAGMENT_TAG = "LIST_VIDEO_FRAGMENT_TAG"
    }
}

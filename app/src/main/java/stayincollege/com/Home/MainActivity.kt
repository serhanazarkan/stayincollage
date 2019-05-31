package stayincollege.com.Home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.bottomNavigationView
import kotlinx.android.synthetic.main.activity_profile.*
import stayincollege.com.R
import stayincollege.com.utils.BottomNavigationViewHelper
import stayincollege.com.utils.HomePagerAdaptor

class MainActivity : AppCompatActivity() {

    private val TAG = "HomeActivity"
    private val ActivityNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNavigationView()
        setupHomeViewPager()
    }

    fun setupNavigationView(){
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper.setupNavigationRoute(this, bottomNavigationView)
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(ActivityNumber)
        menuItem.isChecked = true
    }

    private fun setupHomeViewPager() {
        val homePagerAdaptor = HomePagerAdaptor(supportFragmentManager)

        homePagerAdaptor.addFragment(CameraFragment()) // id = 0
        homePagerAdaptor.addFragment(HomeFragment()) // id = 1
        homePagerAdaptor.addFragment(MessagesFragment()) // id = 2

        // Main page viewer adapter selected
        homeViewPager.adapter = homePagerAdaptor
        // Main page start with item with id = 1
        homeViewPager.setCurrentItem(1)

    }

}

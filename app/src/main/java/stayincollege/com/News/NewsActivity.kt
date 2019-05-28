package stayincollege.com.News

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import stayincollege.com.R
import stayincollege.com.utils.BottomNavigationViewHelper

class NewsActivity : AppCompatActivity() {

    private val TAG = "NewsActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }

    fun setupNavigationView(){
        BottomNavigationViewHelper.setupBottomNavigationView(BottomNavigationView)
        BottomNavigationViewHelper.setupNavigationRoute(this, BottomNavigationView)
        val menu = BottomNavigationView.menu
        val menuItem = menu.getItem(3)
        menuItem.setChecked(true)
    }
}

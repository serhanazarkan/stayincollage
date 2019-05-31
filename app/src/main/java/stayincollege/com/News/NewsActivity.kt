package stayincollege.com.News

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import stayincollege.com.R
import stayincollege.com.utils.BottomNavigationViewHelper

class NewsActivity : AppCompatActivity() {

    private val TAG = "NewsActivity"
    private val ActivityNumber = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }

    fun setupNavigationView(){
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper.setupNavigationRoute(this, bottomNavigationView)
        bottomNavigationView.menu.getItem(ActivityNumber).setChecked(true)
    }
}

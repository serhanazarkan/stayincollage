package stayincollege.com.Search

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import stayincollege.com.R
import stayincollege.com.utils.BottomNavigationViewHelper

class SearchActivity : AppCompatActivity() {

    private val TAG = "SearchActivity"
    private val ActivityNumber = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
    }

    fun setupNavigationView(){
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper.setupNavigationRoute(this, bottomNavigationView)
        bottomNavigationView.menu.getItem(ActivityNumber).setChecked(true)
    }
}

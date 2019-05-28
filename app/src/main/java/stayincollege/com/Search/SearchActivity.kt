package stayincollege.com.Search

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import stayincollege.com.R
import stayincollege.com.utils.BottomNavigationViewHelper

class SearchActivity : AppCompatActivity() {

    private val TAG = "SearchActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
    }

    fun setupNavigationView(){
        BottomNavigationViewHelper.setupBottomNavigationView(BottomNavigationView)
        BottomNavigationViewHelper.setupNavigationRoute(this, BottomNavigationView)
        val menu = BottomNavigationView.menu
        val menuItem = menu.getItem(1)
        menuItem.setChecked(true)
    }
}

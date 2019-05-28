package stayincollege.com.Share

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import stayincollege.com.R
import stayincollege.com.utils.BottomNavigationViewHelper

class ShareActivity : AppCompatActivity() {

    private val TAG = "ShareActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)
    }

    fun setupNavigationView(){
        BottomNavigationViewHelper.setupBottomNavigationView(BottomNavigationView)
        BottomNavigationViewHelper.setupNavigationRoute(this, BottomNavigationView)
        val menu = BottomNavigationView.menu
        val menuItem = menu.getItem(2)
        menuItem.setChecked(true)
    }
}

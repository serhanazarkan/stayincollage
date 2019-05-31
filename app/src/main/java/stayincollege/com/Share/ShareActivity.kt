package stayincollege.com.Share

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.bottomNavigationView
import kotlinx.android.synthetic.main.activity_profile.*
import stayincollege.com.R
import stayincollege.com.utils.BottomNavigationViewHelper

class ShareActivity : AppCompatActivity() {

    private val ActivityNumber = 2
    private val TAG = "ShareActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)
    }

    fun setupNavigationView(){
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper.setupNavigationRoute(this, bottomNavigationView)
        bottomNavigationView.menu.getItem(ActivityNumber).setChecked(true)
    }
}

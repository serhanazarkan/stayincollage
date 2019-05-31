package stayincollege.com.Profile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*
import stayincollege.com.R
import stayincollege.com.utils.BottomNavigationViewHelper

class ProfileActivity : AppCompatActivity() {

    private val TAG = "ProfileActivity"
    private val ActivityNumber = 4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setupNavigationView()
        setupToolbar()
    }

    private fun setupToolbar() {

        ProfileSettingsButton.setOnClickListener{
            val intent = Intent(this, ProfileEditActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
    }

    private fun setupNavigationView(){
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper.setupNavigationRoute(this, bottomNavigationView)
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(ActivityNumber)
        menuItem.isChecked = true
    }
}

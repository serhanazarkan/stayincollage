package stayincollege.com.Profile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_profile_settings.*
import kotlinx.android.synthetic.main.activity_profile_settings.bottomNavigationView
import stayincollege.com.R
import stayincollege.com.utils.BottomNavigationViewHelper

class ProfileEditActivity : AppCompatActivity() {

    private val ActivityNumber = 4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_settings)
        setupBackButton()
        setupNavigationView()
        fragmentNavigations()
    }

    private fun fragmentNavigations() {

        ProfileEditButton.setOnClickListener{
            ProfileEditRoot.visibility = View.GONE
            val transaction =  supportFragmentManager.beginTransaction()
            transaction.replace(R.id.ProfileEditContainer, ProfileEditFragment())
            transaction.addToBackStack("editProfileFragmentAdded")
            transaction.commit()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        ProfileEditRoot.visibility = View.VISIBLE
    }

    private fun setupNavigationView(){
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper.setupNavigationRoute(this, bottomNavigationView)
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(ActivityNumber)
        menuItem.isChecked = true
    }

    private fun setupBackButton() {
        options_back_button.setOnClickListener{
            val intent = Intent(this, ProfileActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
    }
}

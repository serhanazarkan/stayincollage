package stayincollege.com.utils

import android.content.Context
import android.content.Intent
import android.support.design.widget.BottomNavigationView
import android.view.MenuItem
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx
import stayincollege.com.Home.MainActivity
import stayincollege.com.News.NewsActivity
import stayincollege.com.Profile.ProfileActivity
import stayincollege.com.R
import stayincollege.com.Search.SearchActivity
import stayincollege.com.Share.ShareActivity
import java.security.AccessControlContext

class BottomNavigationViewHelper {

    companion object{
        fun setupBottomNavigationView(buttonNavigationEx:BottomNavigationViewEx){
            buttonNavigationEx.enableAnimation(false)
            buttonNavigationEx.enableItemShiftingMode(false)
            buttonNavigationEx.enableShiftingMode(false)
            buttonNavigationEx.setTextVisibility(false)
        }

        fun setupNavigationRoute(context: Context, btNavigation:BottomNavigationViewEx){
            btNavigation.onNavigationItemSelectedListener = object: BottomNavigationView.OnNavigationItemSelectedListener {
                override fun onNavigationItemSelected(item: MenuItem): Boolean {
                    when(item.itemId){

                        R.id.ic_home -> {

                            val intent = Intent(context, MainActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true

                        }

                        R.id.ic_search -> {
                            val intent = Intent(context, SearchActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }

                        R.id.ic_news -> {
                            val intent = Intent(context, NewsActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }

                        R.id.ic_share -> {
                            val intent = Intent(context, ShareActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }

                        R.id.ic_profile -> {
                            val intent = Intent(context, ProfileActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }
                    }
                    return false
                }

            }
        }
    }
}
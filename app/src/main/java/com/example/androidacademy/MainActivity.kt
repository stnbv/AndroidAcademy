package com.example.androidacademy

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.androidacademy.screens_enum.Screens.Login
import com.example.androidacademy.screens_enum.Screens.Main
import com.example.androidacademy.screens_enum.Screens.Profile
import com.example.androidacademy.screens_enum.Screens.Settings

const val PATH = "open_screen"
const val QUERY_PARAM = "screen"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController =
            (supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment).navController

        val data: Uri? = intent?.data

        if (data?.path?.contains(PATH) == true) {
            when (data.getQueryParameters(QUERY_PARAM)?.get(0)) {
                Login.screenName -> navController.navigate(R.id.authFragment)
                Main.screenName -> navController.navigate(R.id.mainFragment)
                Profile.screenName -> Profile.deeplink?.let { deeplink ->
                    navByDeeplink(deeplink)
                }

                Settings.screenName -> Settings.deeplink?.let { deeplink ->
                    navByDeeplink(deeplink)
                }
            }
        }
    }

    fun navByDeeplink(deeplink: String) {
        val request = NavDeepLinkRequest.Builder
            .fromUri(deeplink.toUri())
            .build()
        findNavController(R.id.navHostFragment).navigate(request)
    }
}

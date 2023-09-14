package com.example.androidacademy.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.androidacademy.MainActivity
import com.example.androidacademy.R
import com.example.androidacademy.screens_enum.Screens.Profile
import com.example.androidacademy.screens_enum.Screens.Settings

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        //Переходы между модулями приложения, при помощи диплинков
        view.findViewById<Button>(R.id.profileButton).setOnClickListener {
            (activity as MainActivity).navByDeeplink(Profile.deeplink ?: return@setOnClickListener)
        }
        view.findViewById<Button>(R.id.settingsButton).setOnClickListener {
            (activity as MainActivity).navByDeeplink(Settings.deeplink ?: return@setOnClickListener)
        }
        view.findViewById<Button>(R.id.logoutButton).setOnClickListener {
            this.findNavController().navigateUp()
        }

        return view
    }
}

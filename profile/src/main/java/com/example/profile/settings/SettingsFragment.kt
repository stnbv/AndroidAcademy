package com.example.profile.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.example.profile.R
import com.example.profile.R.layout

private const val MAIN_DEEPLINK = "com.androidacademy://main_fragment"

class SettingsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(layout.fragment_settings, container, false)

        view.findViewById<Button>(R.id.applyButton).setOnClickListener {
            val request = NavDeepLinkRequest.Builder
                .fromUri(MAIN_DEEPLINK.toUri() ?: return@setOnClickListener)
                .build()
            findNavController().navigate(request)
        }
        return view
    }
}

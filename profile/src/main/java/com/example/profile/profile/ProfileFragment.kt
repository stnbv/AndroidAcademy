package com.example.profile.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.profile.R
import com.example.profile.R.layout

class ProfileFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(layout.fragment_profile, container, false)
        view.findViewById<Button>(R.id.backButton).setOnClickListener {
            this.findNavController().popBackStack()
        }

        return view
    }
}

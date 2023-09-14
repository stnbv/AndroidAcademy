package com.example.androidacademy.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.androidacademy.R

class AuthFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_auth, container, false)
        view.findViewById<Button>(R.id.loginButton).setOnClickListener {
            this.findNavController().navigate(R.id.action_authFragment_to_mainFragment)
        }
        return view
    }
}

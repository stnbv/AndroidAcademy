package com.example.androidacademy.screens_enum

enum class Screens(val screenName: String, val deeplink: String? = null) {
    Login("auth"),
    Main("main"),
    Profile("profile", "com.profile://profile_fragment"),
    Settings("settings", "com.profile://settings_fragment")
}

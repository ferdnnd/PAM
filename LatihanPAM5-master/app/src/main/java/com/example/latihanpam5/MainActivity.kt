package com.example.latihanpam5

// import library

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.google.firebase.analytics.FirebaseAnalytics  // import firebase
import retrofit2.Retrofit   // import retroit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        penggunaan retrofit dan pemanggialn API
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.example.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.callFactory()

//        inisialisasi instanse pada firebase
        val firebaseAnalytics = FirebaseAnalytics.getInstance(this)
//        Mengirimkan informasi pada firebase
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT,null)

    }
}

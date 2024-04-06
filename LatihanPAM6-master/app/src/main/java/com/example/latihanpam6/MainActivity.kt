package com.example.latihanpam6

import UserAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainActivity : AppCompatActivity() {

    private val users = mutableListOf<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val json = resources.openRawResource(R.raw.users)
            .bufferedReader().use { it.readText() }

        val type = object : TypeToken<List<User>>() {}.type
        val userList: List<User> = Gson().fromJson(json, type)

        users.addAll(userList)

        val recyclerView = null
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UserAdapter(users)
    }
}
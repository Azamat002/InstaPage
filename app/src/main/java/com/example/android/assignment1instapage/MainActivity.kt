package com.example.android.assignment1instapage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Sample data for the posts
        val postList = listOf(
            Post(R.drawable.avatar, R.drawable.post1, "This is the first post"),
            Post(R.drawable.avatar, R.drawable.post2, "This is the second post"),
            Post(R.drawable.avatar, R.drawable.post1, "This is the third post")
        )

        val adapter = PostAdapter(postList)
        recyclerView.adapter = adapter
    }
}

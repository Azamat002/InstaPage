package com.example.android.assignment1instapage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(private val posts: List<Post>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userAvatar: ImageView = itemView.findViewById(R.id.user_avatar)
        val postImage: ImageView = itemView.findViewById(R.id.post_image)
        val caption: TextView = itemView.findViewById(R.id.caption)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = posts[position]
        holder.userAvatar.setImageResource(post.userAvatarResId) // Set user avatar
        holder.postImage.setImageResource(post.postImageResId) // Set post image
        holder.caption.text = post.caption // Set caption
    }

    override fun getItemCount(): Int {
        return posts.size
    }
}

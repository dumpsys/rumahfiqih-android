package com.hakimlabs.rumahfiqih.features.videos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.hakimlabs.rumahfiqih.R
import kotlinx.android.synthetic.main.item_video.view.title
import kotlinx.android.synthetic.main.item_video.view.video_thumbnail

internal class ListVideoAdapter(val videos: List<Video>, val imageLoader: RequestManager) :
    RecyclerView.Adapter<ListVideoAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_video, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = videos.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val video = videos[position]
        imageLoader.load(video.thumbnail).into(holder.thumbnail)
        holder.title.text = video.title
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var thumbnail: ImageView = itemView.video_thumbnail
        var title: TextView = itemView.title
    }
}
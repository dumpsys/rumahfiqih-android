package com.hakimlabs.rumahfiqih.features.videos

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hakimlabs.rumahfiqih.R
import com.yqritc.recyclerviewflexibledivider.HorizontalDividerItemDecoration
import kotlinx.android.synthetic.main.fragment_generic_list.recyclerview

class ListVideoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_generic_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        val sampleVideo = Video("JliunACDpmc",
            "Urgensi Mempelajari Fiqih Muamalah - Ustadz Ahmad Zarkasih, Lc.",
            "https://www.youtube.com/watch?v=JliunACDpmc",
            "https://i.ytimg.com/vi/JliunACDpmc/hqdefault.jpg")
        recyclerview.apply {
            this.layoutManager = layoutManager
            addItemDecoration(
                HorizontalDividerItemDecoration.Builder(requireContext())
                    .color(Color.TRANSPARENT)
                    .sizeResId(R.dimen.space_8dp)
                    .build()
            )
            this.adapter = ListVideoAdapter(
                listOf(
                    sampleVideo,
                    sampleVideo,
                    sampleVideo,
                    sampleVideo,
                    sampleVideo,
                    sampleVideo
                ), Glide.with(requireActivity())
            )
        }
    }

    companion object {
        fun newInstance(): ListVideoFragment {
            return ListVideoFragment()
        }
    }
}
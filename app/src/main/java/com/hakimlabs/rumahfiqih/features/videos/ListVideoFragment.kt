package com.hakimlabs.rumahfiqih.features.videos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hakimlabs.rumahfiqih.R

class ListVideoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_generic_list, container, false)
    }

    companion object {
        fun newInstance(): ListVideoFragment {
            return ListVideoFragment()
        }
    }
}
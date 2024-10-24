package com.example.androidsdktasks.task_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.androidsdktasks.R

class Fragment3 : Fragment(R.layout.fragment_3) {

    private val router by lazy {
        activity as? Router ?: throw IllegalStateException("Activity must implement Router")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_previous).setOnClickListener {
            router.navigateToPrevious(this)
        }
    }
}

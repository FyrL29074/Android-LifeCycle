package com.fyrl29074.androidlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.fyrl29074.androidlifecycle.databinding.FragmentFirstBinding
import com.fyrl29074.androidlifecycle.databinding.FragmentSecondBinding
import com.google.android.material.snackbar.Snackbar


class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(LOG_LIFECYCLE, "onAttach second fragment")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(LOG_LIFECYCLE, "onCreate second fragment")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)

        Log.d(LOG_LIFECYCLE, "onCreateView second fragment")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d(LOG_LIFECYCLE, "onViewCreated second fragment")
        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(LOG_LIFECYCLE, "onViewStateRestored second fragment")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_LIFECYCLE, "onStart second fragment")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_LIFECYCLE, "onResume second fragment")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_LIFECYCLE, "onPause first fragment")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_LIFECYCLE, "onStop second fragment")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(LOG_LIFECYCLE, "onSaveInstanceState second fragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(LOG_LIFECYCLE, "onDestroyView second fragment")
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_LIFECYCLE, "onDestroy second fragment")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(LOG_LIFECYCLE, "onDetach second fragment")
    }
}
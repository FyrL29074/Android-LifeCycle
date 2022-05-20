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
import com.google.android.material.snackbar.Snackbar


class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(LOG_LIFECYCLE, "onAttach first fragment")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(LOG_LIFECYCLE, "onCreate first fragment")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        Log.d(LOG_LIFECYCLE, "onCreateView first fragment")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d(LOG_LIFECYCLE, "onViewCreated first fragment")
        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(LOG_LIFECYCLE, "onViewStateRestored first fragment")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_LIFECYCLE, "onStart first fragment")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_LIFECYCLE, "onResume first fragment")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_LIFECYCLE, "onPause first fragment")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_LIFECYCLE, "onStop first fragment")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(LOG_LIFECYCLE, "onSaveInstanceState first fragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(LOG_LIFECYCLE, "onDestroyView first fragment")
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_LIFECYCLE, "onDestroy first fragment")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(LOG_LIFECYCLE, "onDetach first fragment")
    }
}
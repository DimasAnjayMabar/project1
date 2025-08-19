package com.example.test.ui.tiga

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.test.databinding.FragmentNomor3Binding

class Nomor3Fragment : Fragment() {

    private var _binding: FragmentNomor3Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(Nomor3ViewModel::class.java)

        _binding = FragmentNomor3Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.fragmentNomor3
        slideshowViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
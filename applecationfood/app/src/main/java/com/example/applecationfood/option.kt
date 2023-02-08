package com.example.applecationfood

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.applecationfood.databinding.FragmentOptionBinding
import com.example.applecationfood.databinding.FragmentSettingBinding
import food


class option : Fragment(R.layout.fragment_option) {
    private var _binding: FragmentOptionBinding? = null
    private val binding get() = _binding!!
    private val arges by navArgs<optionArgs>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentOptionBinding.bind(view)
        binding.apply {
            nameItem.text = arges.type
            img.setImageResource(arges.img)
        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
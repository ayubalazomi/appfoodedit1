package com.example.applecationfood

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.applecationfood.databinding.FragmentListfoodBinding
import food

class listfood : Fragment(R.layout.fragment_listfood), foodAdabter.itemclick {
    var _binding: FragmentListfoodBinding? = null
    val binding get() = _binding!!
    var x = SharedPref
    val namesList = mutableListOf(
        food("hamberger", R.drawable.baseline_fastfood_24),
        food("pizza", R.drawable.baseline_local_pizza_24),
        food("sandwechtuna", R.drawable.baseline_fastfood_24),
        food("mafroom", R.drawable.baseline_fastfood_24),
        food("pasta", R.drawable.baseline_lunch_dining_24),
        food("rane", R.drawable.baseline_lunch_dining_24),
        food("pepse", R.drawable.baseline_no_drinks_24),
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentListfoodBinding.bind(view)
        val adapter = foodAdabter(this)
        binding.recyclerView.adapter = adapter
        adapter.submitList(namesList)
    }

    override fun onclickitem(i: Int) {
        val action =
            listfoodDirections.actionListfoodToOption(namesList[i].name, namesList[i].imageUrl)
        findNavController().navigate(action)
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }


}
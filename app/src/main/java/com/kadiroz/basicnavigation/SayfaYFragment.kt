package com.kadiroz.basicnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.activity.addCallback
import androidx.navigation.Navigation
import com.kadiroz.basicnavigation.databinding.FragmentSayfaYBinding

class SayfaYFragment : Fragment() {
    private lateinit var binding: FragmentSayfaYBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaYBinding.inflate(inflater,container,false)


        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            Navigation.findNavController(requireView()).navigate(R.id.anasayfayaGecis)
        }

        return binding.root
    }

}
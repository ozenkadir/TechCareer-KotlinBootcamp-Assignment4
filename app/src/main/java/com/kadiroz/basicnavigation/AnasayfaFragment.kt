package com.kadiroz.basicnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.kadiroz.basicnavigation.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonASayfasi.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.sayfaAGecis)
        }

        binding.buttonXSayfasi.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.sayfaXGecis)
        }

        // Inflate the layout for this fragment
        return binding.root
    }


}
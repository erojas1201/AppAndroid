package com.example.proyecto.ui.photo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.proyecto.R
import com.example.proyecto.databinding.FragmentPhotoBinding

class PhotoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_photo, container, false)

        val image1 = view.findViewById<ImageView>(R.id.image1)
        val image2 = view.findViewById<ImageView>(R.id.image2)

        image1.setOnClickListener {
            Toast.makeText(requireContext(), "Paisaje de tibet, plan de paisaje de nieve de tibet, plan, paisajes", Toast.LENGTH_SHORT).show()
        }

        image2.setOnClickListener {
            Toast.makeText(requireContext(), "Monumento valle navajo parque tribal oeste y este mitón motas tótem oljato, antílope cañón herradura curva paisaje, diverso, fotografía", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
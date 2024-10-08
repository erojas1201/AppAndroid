package com.example.proyecto.ui.botones

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.proyecto.R

class ButtonsFragment : Fragment() {

    private lateinit var button1: Button
    private lateinit var button2: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_buttons, container, false)

        button1 = view.findViewById(R.id.button1)
        button2 = view.findViewById(R.id.button2)

        button1.setOnClickListener {
            showDialog("Descripción 1", "Esta es la descripción de la primera opción.")
        }

        button2.setOnClickListener {
            showDialog("Descripción 2", "Esta es la descripción de la segunda opción.")
        }

        return view
    }

    private fun showDialog(title: String, message: String) {
        AlertDialog.Builder(requireContext())
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("Cerrar") { dialog, _ ->
                dialog.dismiss()
            }
            .create()
            .show()
    }
}
package com.example.proyecto.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.proyecto.R
import com.example.proyecto.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val profileImageView: ImageView = view.findViewById(R.id.profile_image)
        val nameTextView: TextView = view.findViewById(R.id.name)
        val occupationTextView: TextView = view.findViewById(R.id.occupation)
        val contactTextView: TextView = view.findViewById(R.id.contact_info)
        val workExperienceTextView: TextView = view.findViewById(R.id.work_experience)
        val educationTextView: TextView = view.findViewById(R.id.education)
        val skillsTextView: TextView = view.findViewById(R.id.skills)

        nameTextView.text = "John Doe"
        occupationTextView.text = "Android Developer"
        contactTextView.text = "Correo: john.doe@example.com\nTeléfono: +123 456 7890"
        workExperienceTextView.text = "Empresa ABC - Desarrollador Android\nEne 2021 - Presente\n\n" +
                "Empresa XYZ - Ingeniero de Software\nMar 2019 - Dic 2020"
        educationTextView.text = "Universidad ABC - Ingeniería de Sistemas\nSep 2015 - Jun 2019"
        skillsTextView.text = "Kotlin, Java, Android Studio, SQL, Git"

        profileImageView.setImageResource(R.drawable.img)

        return view
    }
}
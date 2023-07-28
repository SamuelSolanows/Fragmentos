package com.example.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.commit


class PrimerFragment : Fragment(R.layout.fragment_primer) {

    // no se como hacecrlo con binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn = view.findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            requireActivity().supportFragmentManager.commit {                                    //requireActivity()  es para acceder
                replace(R.id.Container, SegundoFragment.NewInstance("Samuel",18))                      // a los componetes de la actividad donde esta el contenedor
                addToBackStack("PrimerFragmet")
            }
        }

    }
}
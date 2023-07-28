package com.example.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import com.example.fragmentos.databinding.FragmentSegundoBinding
import com.example.fragmentos.databinding.FragmentTercerBinding


class SegundoFragment : Fragment(R.layout.fragment_segundo) {

    private var nombre: String? = ""
    private var edad: Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {        //Se llamna los datos en el oncreate por
        super.onCreate(savedInstanceState)
        nombre = requireArguments().getString(NOMBRE)
        edad = requireArguments().getInt(EDAD)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val texto = view.findViewById<TextView>(R.id.txt)
        texto.setText("$nombre  $edad")

    }

    companion object {

        private val NOMBRE = "nombre"
        private val EDAD = "edad"


        fun NewInstance(Nombre: String, Edad: Int) = SegundoFragment().apply {
            arguments = bundleOf(NOMBRE to Nombre, EDAD to Edad)
        }

    }
}
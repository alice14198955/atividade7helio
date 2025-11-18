package com.example.lanchoneteapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.lanchoneteapp.databinding.FragmentDetalheBinding

class DetalheFragment : Fragment() {

    private lateinit var binding: FragmentDetalheBinding
    private val args: DetalheFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentDetalheBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtDetalhe.text = "Você escolheu: ${args.lancheNome}"
    }
}

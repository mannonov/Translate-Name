package com.jaxadev.translatename.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.jaxadev.translatename.R
import com.jaxadev.translatename.databinding.FragmentImageConvertBinding
import com.jaxadev.translatename.databinding.FragmentSelectBinding


class ImageConvertFragment : Fragment() {

    private lateinit var _binding: FragmentImageConvertBinding
    private val binding get() = _binding

    private val args: ImageConvertFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentImageConvertBinding.inflate(inflater, container, false)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            tvName.text = args.nameText
            tvTranslationName.text = args.translationText
        }

    }


}
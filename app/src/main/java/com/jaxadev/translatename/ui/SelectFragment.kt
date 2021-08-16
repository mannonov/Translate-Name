package com.jaxadev.translatename.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jaxadev.translatename.R
import com.jaxadev.translatename.databinding.FragmentSelectBinding


class SelectFragment : Fragment(), AdapterView.OnItemSelectedListener {

    private lateinit var _binding: FragmentSelectBinding
    private val binding get() = _binding

    var spinnerPosition: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSelectBinding.inflate(inflater, container, false)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val adapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            requireActivity(),
            R.array.languages,
            R.layout.support_simple_spinner_dropdown_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spSelectLanguage.adapter = adapter

        binding.spSelectLanguage.onItemSelectedListener = this

        binding.btnTranslateName.setOnClickListener {

            if (binding.edtGetText.text.toString() != "") {

                val directions = SelectFragmentDirections

                findNavController().navigate(
                    when (spinnerPosition) {
                        0 -> directions.actionSelectFragmentToImageConvertFragment(
                            translationText = translateToArabian(binding.edtGetText.text.toString()),
                            nameText = binding.edtGetText.text.toString()
                        )
                        1 -> directions.actionSelectFragmentToImageConvertFragment(
                            translationText = translateToKorean(binding.edtGetText.text.toString()),
                            nameText = binding.edtGetText.text.toString()
                        )
                        2 -> directions.actionSelectFragmentToImageConvertFragment(
                            translationText = translateToChinese(binding.edtGetText.text.toString()),
                            nameText = binding.edtGetText.text.toString()
                        )
                        else -> directions.actionSelectFragmentToImageConvertFragment(
                            "null",
                            "null"
                        )
                    }
                )


            }

        }

    }

    private fun translateToArabian(string: String): String {

        val lowerCase = string.toLowerCase()

        val stringBuilder = StringBuilder()


        for (i in lowerCase.iterator()) {

            when (i) {

                'b' -> stringBuilder.append(getString(R.string.b_ar))
                'j' -> stringBuilder.append(getString(R.string.j_ar))
                'd' -> stringBuilder.append(getString(R.string.d_ar))
                'h' -> stringBuilder.append(getString(R.string.h_ar))
                'w' -> stringBuilder.append(getString(R.string.w_ar))
                'z' -> stringBuilder.append(getString(R.string.z_ar))
                'y' -> stringBuilder.append(getString(R.string.y_ar))
                'k' -> stringBuilder.append(getString(R.string.k_ar))
                'l' -> stringBuilder.append(getString(R.string.l_ar))
                'm' -> stringBuilder.append(getString(R.string.m_ar))
                'n' -> stringBuilder.append(getString(R.string.n_ar))
                'f' -> stringBuilder.append(getString(R.string.f_ar))
                'q' -> stringBuilder.append(getString(R.string.q_ar))
                'r' -> stringBuilder.append(getString(R.string.r_ar))
                't' -> stringBuilder.append(getString(R.string.t_ar))
                's' -> stringBuilder.append(getString(R.string.s_ar))
                'e' -> stringBuilder.append(getString(R.string.e_ar))
                'i' -> stringBuilder.append(getString(R.string.i_ar))
                'u' -> stringBuilder.append(getString(R.string.u_ar))
                'o' -> stringBuilder.append(getString(R.string.o_ar))
                'p' -> stringBuilder.append(getString(R.string.p_ar))
                'a' -> stringBuilder.append(getString(R.string.a_ar))
                'g' -> stringBuilder.append(getString(R.string.g_ar))
                'x' -> stringBuilder.append(getString(R.string.x_ar))
                'v' -> stringBuilder.append(getString(R.string.v_ar))
                'c' -> stringBuilder.append(getString(R.string.c_ar))

            }
        }

        return stringBuilder.toString().reversed()
    }

    private fun translateToKorean(string: String): String {

        val lowerCase = string.toLowerCase()

        val stringBuilder = StringBuilder()


        for (i in lowerCase.iterator()) {

            when (i) {

                'b' -> stringBuilder.append(getString(R.string.b_kr))
                'j' -> stringBuilder.append(getString(R.string.j_kr))
                'd' -> stringBuilder.append(getString(R.string.d_kr))
                'h' -> stringBuilder.append(getString(R.string.h_kr))
                'w' -> stringBuilder.append(getString(R.string.w_kr))
                'z' -> stringBuilder.append(getString(R.string.z_kr))
                'y' -> stringBuilder.append(getString(R.string.y_kr))
                'k' -> stringBuilder.append(getString(R.string.k_kr))
                'l' -> stringBuilder.append(getString(R.string.l_kr))
                'm' -> stringBuilder.append(getString(R.string.m_kr))
                'n' -> stringBuilder.append(getString(R.string.n_kr))
                'f' -> stringBuilder.append(getString(R.string.f_kr))
                'q' -> stringBuilder.append(getString(R.string.q_kr))
                'r' -> stringBuilder.append(getString(R.string.r_kr))
                't' -> stringBuilder.append(getString(R.string.t_kr))
                's' -> stringBuilder.append(getString(R.string.s_kr))
                'e' -> stringBuilder.append(getString(R.string.e_kr))
                'i' -> stringBuilder.append(getString(R.string.i_kr))
                'u' -> stringBuilder.append(getString(R.string.u_kr))
                'o' -> stringBuilder.append(getString(R.string.o_kr))
                'p' -> stringBuilder.append(getString(R.string.p_kr))
                'a' -> stringBuilder.append(getString(R.string.a_kr))
                'g' -> stringBuilder.append(getString(R.string.g_kr))
                'x' -> stringBuilder.append(getString(R.string.x_kr))
                'v' -> stringBuilder.append(getString(R.string.v_kr))
                'c' -> stringBuilder.append(getString(R.string.c_kr))

            }
        }

        return stringBuilder.toString().reversed()
    }

    private fun translateToChinese(string: String): String {

        val lowerCase = string.toLowerCase()

        val stringBuilder = StringBuilder()


        for (i in lowerCase.iterator()) {

            when (i) {

                'b' -> stringBuilder.append(getString(R.string.b_chn))
                'j' -> stringBuilder.append(getString(R.string.j_chn))
                'd' -> stringBuilder.append(getString(R.string.d_chn))
                'h' -> stringBuilder.append(getString(R.string.h_chn))
                'w' -> stringBuilder.append(getString(R.string.w_chn))
                'z' -> stringBuilder.append(getString(R.string.z_chn))
                'y' -> stringBuilder.append(getString(R.string.y_chn))
                'k' -> stringBuilder.append(getString(R.string.k_chn))
                'l' -> stringBuilder.append(getString(R.string.l_chn))
                'm' -> stringBuilder.append(getString(R.string.m_chn))
                'n' -> stringBuilder.append(getString(R.string.n_chn))
                'f' -> stringBuilder.append(getString(R.string.f_chn))
                'q' -> stringBuilder.append(getString(R.string.q_chn))
                'r' -> stringBuilder.append(getString(R.string.r_chn))
                't' -> stringBuilder.append(getString(R.string.t_chn))
                's' -> stringBuilder.append(getString(R.string.s_chn))
                'e' -> stringBuilder.append(getString(R.string.e_chn))
                'i' -> stringBuilder.append(getString(R.string.i_chn))
                'u' -> stringBuilder.append(getString(R.string.u_chn))
                'o' -> stringBuilder.append(getString(R.string.o_chn))
                'p' -> stringBuilder.append(getString(R.string.p_chn))
                'a' -> stringBuilder.append(getString(R.string.a_chn))
                'g' -> stringBuilder.append(getString(R.string.g_chn))
                'x' -> stringBuilder.append(getString(R.string.x_chn))
                'v' -> stringBuilder.append(getString(R.string.v_chn))
                'c' -> stringBuilder.append(getString(R.string.c_chn))

            }
        }

        return stringBuilder.toString().reversed()
    }


    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        spinnerPosition = position

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

}
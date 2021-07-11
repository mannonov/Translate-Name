package com.jaxadev.translatename.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
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


                when (spinnerPosition) {
                    0 -> translateToArabian(binding.edtGetText.toString())


                }

            }

        }

    }

    private fun translateToArabian(string: String): String {

        val lowerCase = string.lowercase()

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

            }
        }

        return stringBuilder.toString().reversed()
    }

    private fun translateToKorean(string: String): String {

        val lowerCase = string.lowercase()

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

            }
        }

        return stringBuilder.toString().reversed()
    }

    private fun translateToChinese(string: String): String {

        val lowerCase = string.lowercase()

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
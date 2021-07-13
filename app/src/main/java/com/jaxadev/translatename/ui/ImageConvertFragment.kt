package com.jaxadev.translatename.ui

import android.Manifest
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Bundle
import android.os.Environment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.drawToBitmap
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.jaxadev.translatename.databinding.FragmentImageConvertBinding
import java.io.*


class ImageConvertFragment : Fragment() {

    private lateinit var _binding: FragmentImageConvertBinding
    private val binding get() = _binding

    private val args: ImageConvertFragmentArgs by navArgs()

    private lateinit var outputStream: OutputStream

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
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

        binding.btnSaveImage.setOnClickListener {
            if (ContextCompat.checkSelfPermission(requireActivity(),Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED){
                saveImage()
            }else{
                askPermission()
            }
        }

    }
    private fun askPermission() {
        ActivityCompat.requestPermissions(requireActivity(),
            arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
            7)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String?>,
        grantResults: IntArray,
    ) {
        if (requestCode == 7) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                saveImage()
            } else {
                Snackbar.make(binding.convertedImage,"Please provide the required permissions", Snackbar.LENGTH_LONG).show()
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    private fun saveImage() {
        val dir = File(Environment.getExternalStorageDirectory(), "SaveImage")
        if (!dir.exists()) {
            dir.mkdir()
        }
        val file = File(dir, System.currentTimeMillis().toString() + ".jpg")
        try {
            outputStream = FileOutputStream(file)
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
        binding.convertedImage.drawToBitmap().compress(Bitmap.CompressFormat.JPEG, 100, outputStream)
        Snackbar.make(binding.convertedImage,"Image Saved to SaveImage Folder", Snackbar.LENGTH_LONG).show()
        try {
            outputStream.flush()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        try {
            outputStream.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}
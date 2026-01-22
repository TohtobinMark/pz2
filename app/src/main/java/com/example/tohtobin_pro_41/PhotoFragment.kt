package com.example.tohtobin_pro_41

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
class PhotoFragment : Fragment() {
    private lateinit var photoCounter: TextView
    private lateinit var photoImage: ImageView
    private lateinit var btnChangePhoto: Button
    private lateinit var btnPhotoInfo: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_photo, container, false)
        photoCounter = view.findViewById(R.id.photo_counter)
        photoImage = view.findViewById(R.id.photo_image)
        btnChangePhoto = view.findViewById(R.id.btn_change_photo)
        btnPhotoInfo = view.findViewById(R.id.btn_photo_info)
        return view
    }
}
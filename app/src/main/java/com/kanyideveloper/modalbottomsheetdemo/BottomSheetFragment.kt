package com.kanyideveloper.modalbottomsheetdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.kanyideveloper.modalbottomsheetdemo.databinding.FragmentBottomSheetBinding
import com.kanyideveloper.modalbottomsheetdemo.databinding.FragmentHomeBinding


class BottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentBottomSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBottomSheetBinding.inflate(inflater,container,false)
        val view: View = binding.root

        binding.textViewShare.setOnClickListener {
            Toast.makeText(requireContext(),"Share CLicked",Toast.LENGTH_SHORT).show()
        }

        binding.textViewCopyLink.setOnClickListener {
            Toast.makeText(requireContext(),"Copy Link CLicked",Toast.LENGTH_SHORT).show()
        }

        binding.textViewEdit.setOnClickListener {
            Toast.makeText(requireContext(),"Edit CLicked",Toast.LENGTH_SHORT).show()
        }
        return view
    }

}
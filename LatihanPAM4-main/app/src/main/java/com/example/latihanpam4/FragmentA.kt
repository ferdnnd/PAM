package com.example.latihanpam4

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentA : Fragment(R.layout.fragment_a){

    fun navigateToFragmentB(){
        findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
    }
}
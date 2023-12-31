package com.example.project5

import android.R.attr.text
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.project5.databinding.FragmentTextScreenBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [textScreen.newInstance] factory method to
 * create an instance of this fragment.
 */
class textScreen : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentTextScreenBinding
    private lateinit var viewModel: TranslatorViewModel


    /*
binding = FragmentTextScreenBinding.inflate(layoutInflater)
        val view = binding.root
        val viewModel = ViewModelProvider(this).get(MainActivity.TranslatorViewModel::class.java)

        // none of these are ever called...

        val edittext: EditText = binding.typeHere
        edittext.setOnClickListener {
            println("Clicked edittext")
            println(binding.typeHere.getText().toString())
        }
        val root = binding.titleFragmentTextScreenRoot
        root.setOnClickListener {
            println("Clicked frag root")
            println(binding.typeHere.getText().toString())
        }

        binding.typeHere.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(mEdit: Editable) {
                Log.i("INFO", "Hello")
            }
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                val current_text = s.toString()
                println("After text changed callback")
                println(current_text)

                viewModel.currentStr.value = (current_text)
            }
        })

        edittext.setOnEditorActionListener{v, actionId, event ->
            return@setOnEditorActionListener when (actionId) {
                EditorInfo.IME_ACTION_SEND -> {
                    println("setOnEditorActionListener edittext")
                    true
                }
                else -> false
            }}

 */


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentTextScreenBinding.inflate(inflater, container, false)
        viewModel =
            ViewModelProvider(requireActivity()).get(TranslatorViewModel::class.java)
        viewModel.bindingFrag.value = binding
        return binding.root
    }
}
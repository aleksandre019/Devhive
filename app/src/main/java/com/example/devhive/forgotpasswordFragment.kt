package com.example.devhive

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

private val Nothing?.text: Any
    get() {
        TODO("Not yet implemented")
    }

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [forgotpasswordFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class forgotpasswordFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forgotpassword, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment forgotpasswordFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            forgotpasswordFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }



    class MyFragment : Fragment() {

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_forgotpassword, container, false)

            // Set a click listener for a button to validate the phone number
            view.findViewById<>(R.id.editText).setOnClickListener {
                var phoneNumberEditText = null
                val phoneNumber = phoneNumberEditText.text.toString()
                if (isValidPhoneNumber(phoneNumber)) {
                    fun isValidPhoneNumber(phoneNumber: String): Boolean {
                        val regex = Regex("^\\d{10}$") // Regular expression to match 10 digits

                        return regex.matches(phoneNumber)
                    }

                    fun main() {
                        val phoneNumber1 = "1234567890"
                        val phoneNumber2 = "987654321" // Invalid: less than 10 digits

                        println("Phone number 1 is valid: ${isValidPhoneNumber(phoneNumber1)}")
                        println("Phone number 2 is valid: ${isValidPhoneNumber(phoneNumber2)}")
                    }

                    // TODO: Handle the valid phone number case
                } else {
                    // Invalid phone number
                    // TODO: Handle the invalid phone number case
                }
            }

            return view
        }

        private fun isValidPhoneNumber(phoneNumber: String): Boolean {
            val regex = Regex("^\\d{10}$") // Regular expression to match 10 digits

            return regex.matches(phoneNumber)
        }



        class MyFragment : Fragment() {

            override fun onCreateView(
                inflater: LayoutInflater,
                container: ViewGroup?,
                savedInstanceState: Bundle?
            ): View? {
                val view = inflater.inflate(R.layout.activity_login, container, false)

                view.findViewById<Button>(R.id.backButton).setOnClickListener {
                    requireActivity().supportFragmentManager.popBackStack()
                }

                return view
            }
        }
    }

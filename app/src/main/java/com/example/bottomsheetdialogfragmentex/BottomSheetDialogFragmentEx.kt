package com.example.bottomsheetdialogfragmentex

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.layout_bottomsheet.view.*
import java.lang.StringBuilder

class BottomSheetDialogFragmentEx : BottomSheetDialogFragment() {

    lateinit var interfaceObj: MyInterface

    interface MyInterface {
        fun myWork1(text: String)
        fun myWork2(text: String)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v = inflater.inflate(R.layout.layout_bottomsheet, container, false)
        v.bt1.setOnClickListener {
            interfaceObj.myWork1("button1 clicked")
            dismiss()
        }
        v.bt2.setOnClickListener {
            interfaceObj.myWork2("button2 clicked")
            dismiss()
        }

        return v
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        interfaceObj = context as MyInterface
    }

}
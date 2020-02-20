package com.example.bottomsheetdialogfragmentex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomSheetDialogFragmentEx.MyInterface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bt_bottomsheet.setOnClickListener {
            BottomSheetDialogFragmentEx().show(supportFragmentManager, "bottomsheet")
        }

    }

    override fun myWork1(text: String) {
        tv1.setText(text)
    }

    override fun myWork2(text: String) {
        tv1.setText(text)
    }

}

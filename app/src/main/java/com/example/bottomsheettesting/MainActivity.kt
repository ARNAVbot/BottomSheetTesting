package com.example.bottomsheettesting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.LinearLayout
import android.widget.Toast

import com.google.android.material.bottomsheet.BottomSheetDialog




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mBottton: Button = findViewById(R.id.button);
        mBottton.setOnClickListener { showBottomSheetDialog() }
    }

    private fun showBottomSheetDialog() {
        val bottomSheetDialog = BottomSheetDialog(this)
        bottomSheetDialog.setContentView(R.layout.bottom_sheet_dialog_layout)
        val copy = bottomSheetDialog.findViewById<LinearLayout>(R.id.copyLinearLayout)
        val share = bottomSheetDialog.findViewById<LinearLayout>(R.id.shareLinearLayout)
        val upload = bottomSheetDialog.findViewById<LinearLayout>(R.id.uploadLinearLayout)
        val download = bottomSheetDialog.findViewById<LinearLayout>(R.id.download)
        val delete = bottomSheetDialog.findViewById<LinearLayout>(R.id.delete)


        copy?.setOnClickListener {
            Toast.makeText(getApplicationContext(), "Copy is Clicked ", Toast.LENGTH_LONG).show();
            val intent: Intent = Intent(this, Activity2::class.java)
            startActivity(intent);
        }

        bottomSheetDialog.show()
    }
}
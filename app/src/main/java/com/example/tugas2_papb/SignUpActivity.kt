package com.example.tugas2_papb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog

class SignUpActivity : AppCompatActivity() {
    private lateinit var selectItem:TextView
    private lateinit var dialog:BottomSheetDialog
    private lateinit var ItemAdaptor:ItemAdaptor
    private lateinit var recyclerView: RecyclerView
    private val list = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        selectItem = findViewById(R.id.tvPhoneCode)

        for (i in 1..10){
            list.add("Negara +$i")
        }
        selectItem.setOnClickListener{
            showBottomSheet()
        }

    }
    private fun showBottomSheet(){
        val dialogView = layoutInflater.inflate(R.layout.bottom_sheet, null)
        dialog = BottomSheetDialog(this,R.style.BottomSheetDialogTheme)
        dialog.setContentView(dialogView)
        recyclerView  = dialogView.findViewById(R.id.rvItem)
        ItemAdaptor = ItemAdaptor(list)
        recyclerView.adapter = ItemAdaptor
        dialog.show()
    }
}
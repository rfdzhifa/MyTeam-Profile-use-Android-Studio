package com.example.kelompok3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Sofia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sofiaprofile)

        supportActionBar?.hide()

        val EditTextSOFIA : EditText = findViewById(R.id.editTextSofia)
        val CekSOFIA : Button =  findViewById(R.id.buttonfia)

        val namaAnggota2 = "Sofia"
        val ketAnggota : TextView = findViewById(R.id.InformationMartryatusSofia)

        CekSOFIA.setOnClickListener {
            if (EditTextSOFIA.length() == 0) {
                val toast = Toast.makeText(this, "Silahkan Masukkan Nama", Toast.LENGTH_SHORT)
                toast.show()
            } else {
                val input = EditTextSOFIA.getText().toString()
                if (input == namaAnggota2) {
                    val toast =
                        Toast.makeText(this, "Martryatus Sofia XI RPL 5 / 20", Toast.LENGTH_SHORT)
                    toast.show()
                    val detailAnggota = "Martryatus Sofia XI RPL 5 / 20"
                    ketAnggota.setText(detailAnggota)
                } else {
                    val toast = Toast.makeText(
                        this,
                        "Maaf Nama yang Anda Masukkan Salah",
                        Toast.LENGTH_SHORT
                    )
                    toast.show()
                }
            }
        }
    }
}
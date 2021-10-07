package com.example.kelompok3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Aliya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aliyaprofile)

        supportActionBar?.hide()

        val EditTextALIYA : EditText = findViewById(R.id.edittext_aliya)
        val CekALIYA : Button =  findViewById(R.id.buttonaliya)

        val namaAnggota1 = "Aliya"
        val ketAnggota : TextView = findViewById(R.id.InformationNurAliyaFajri)

        CekALIYA.setOnClickListener {
            if (EditTextALIYA.length() == 0) {
                val toast = Toast.makeText(this, "Silahkan Masukkan Nama", Toast.LENGTH_SHORT)
                toast.show()
            } else {
                val input = EditTextALIYA.getText().toString()
                if (input == namaAnggota1) {
                    val toast =
                        Toast.makeText(this, "Nur Aliya Fajri XI RPL 5 / 25", Toast.LENGTH_SHORT)
                    toast.show()
                    val detailAnggota = "Nur Aliya Fajri XI RPL 5 / 25"
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
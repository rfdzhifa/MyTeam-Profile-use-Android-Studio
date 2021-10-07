package com.example.kelompok3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Fina : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.finaprofile)

        supportActionBar?.hide()

        val EditTextFINA : EditText = findViewById(R.id.editTextFina)
        val CekFINA : Button =  findViewById(R.id.buttonFina)

        val namaAnggota4 = "Fina"
        val ketAnggota : TextView = findViewById(R.id.InformationLuthfinaNararya)

        CekFINA.setOnClickListener {
            if (EditTextFINA.length() == 0) {
                val toast = Toast.makeText(this, "Silahkan Masukkan Nama", Toast.LENGTH_SHORT)
                toast.show()
            } else {
                val input = EditTextFINA.getText().toString()
                if (input == namaAnggota4) {
                    val toast =
                        Toast.makeText(this, "Luthfina Nararya Dewi Wibowo XI RPL 5 / 19", Toast.LENGTH_SHORT)
                    toast.show()
                    val detailAnggota = "Luthfina Nararya Dewi Wibowo XI RPL 5 / 19"
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
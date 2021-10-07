package com.example.kelompok3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Zhifa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.zhifaprofile)

        supportActionBar?.hide()

        val EditTextZHIFA : EditText = findViewById(R.id.edittext_zhifa)
        val CekZHIFA : Button =  findViewById(R.id.buttonzhifa)

        val namaAnggota3 = "Zhifa"
        val ketAnggota : TextView = findViewById(R.id.InfoZhifa)

        CekZHIFA.setOnClickListener {
            if (EditTextZHIFA.length() == 0) {
                val toast = Toast.makeText(this, "Silahkan Masukkan Nama", Toast.LENGTH_SHORT)
                toast.show()
            } else {
                val input = EditTextZHIFA.getText().toString()
                if (input == namaAnggota3) {
                    val toast =
                        Toast.makeText(this, "Rifdah Inas Nazhifah XI RPL 5 / 29", Toast.LENGTH_SHORT)
                    toast.show()
                    val detailAnggota = "Rifdah Inas Nazhifah XI RPL 5 / 29"
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
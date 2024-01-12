package com.example.asesment3

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.asesment3.R
import com.example.asesment3.login
import com.google.android.material.snackbar.Snackbar

class registrasi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        // Mendapatkan referensi ke root view layout
        val rootView: View = findViewById(android.R.id.content)

        // Mendapatkan referensi ke tombol registrasi
        val buttonRegistrasi: Button = findViewById(R.id.buttonlogin)

        // Menambahkan listener untuk tombol registrasi
        buttonRegistrasi.setOnClickListener {
            if (isValidRegistration()) {
                // Menampilkan Snackbar jika registrasi berhasil
                showSnackbar(rootView, "Registrasi berhasil")

                // Memulai activity login dengan penundaan
                moveToLoginActivityWithDelay()
            } else {
                // Menampilkan Snackbar jika ada field yang belum diisi
                showSnackbar(rootView, "Isi semua kolom dengan benar")
            }
        }
    }

    // Menampilkan Snackbar dengan pesan yang diberikan
    private fun showSnackbar(view: View, message: String) {
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()
    }

    // Pindah ke activity login setelah penundaan
    private fun moveToLoginActivityWithDelay() {
        val handler = Handler()

        // Memberikan penundaan 2 detik sebelum pindah ke halaman login
        handler.postDelayed({
            val intent = Intent(this@registrasi, MainMenu::class.java)
            startActivity(intent)
            finish()
        }, 2000) // Delay selama 2 detik (2000 milidetik)
    }

    // Melakukan validasi input registrasi
    private fun isValidRegistration(): Boolean {
        // Mendapatkan referensi ke semua field input
        val editTextKodeDaftar: EditText = findViewById(R.id.kodedaftar)
        val editTextNisDaftar: EditText = findViewById(R.id.nisdaftar)
        val editTextKataSandiDaftar: EditText = findViewById(R.id.katasandidaftar)
        val editTextDay: EditText = findViewById(R.id.editTextDay)
        val editTextMonth: EditText = findViewById(R.id.editTextMonth)
        val editTextYear: EditText = findViewById(R.id.editTextYear)

        // Mendapatkan nilai dari semua field input
        val kodeDaftar = editTextKodeDaftar.text.toString()
        val nisDaftar = editTextNisDaftar.text.toString()
        val kataSandiDaftar = editTextKataSandiDaftar.text.toString()
        val day = editTextDay.text.toString()
        val month = editTextMonth.text.toString()
        val year = editTextYear.text.toString()

        // Melakukan validasi sesuai kebutuhan
        return kodeDaftar.isNotEmpty() && nisDaftar.isNotEmpty() && kataSandiDaftar.isNotEmpty()
                && day.isNotEmpty() && month.isNotEmpty() && year.isNotEmpty()
    }
}

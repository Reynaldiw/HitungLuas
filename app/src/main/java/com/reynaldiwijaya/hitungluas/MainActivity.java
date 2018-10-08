package com.reynaldiwijaya.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variable global
    TextView txtJdl;
    Button btnHitung;
    EditText edtText;
    EditText edtPanjang;
    EditText edtLebar;
    TextView txtHasil;
    //Membuat variable global untuk menghitung luas
    Integer panjang,lebar,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inisiasi widget ke dalam variable java agar dapat digunakan
        txtJdl = findViewById(R.id.txtJudul);
        btnHitung = findViewById(R.id.btnHitung);
        edtText = findViewById(R.id.edtText);

        edtPanjang = findViewById(R.id.edtPanjang);  //Variable Lokal
        edtLebar = findViewById(R.id.edtLebar);
        txtHasil = findViewById(R.id.txtHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hitung();
            }
        });
    }

    public void hitung(){
        //memasukan input nama dari user ke dalam variable
        String isiEdtText = edtText.getText().toString();

        //Memasukan input dari user ke dalam variable
        panjang = Integer.valueOf(edtPanjang.getText().toString());
        lebar = Integer.valueOf(edtLebar.getText().toString());

        //Mengitung Luas Persegi Panjang = p * l
        hasil = panjang * lebar ;

        //Cetak hasil
        txtHasil.setText("Hello " + isiEdtText + ", Hasil Luasnya Adalah: " + hasil);
    }
}

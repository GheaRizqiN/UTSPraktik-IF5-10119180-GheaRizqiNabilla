package com.example.utspraktik_if5_10119180_ghearizqin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
    Tanggal pengerjaan: Kamis, 2 Juni 2022
    NIM: 10119180
    Nama: Ghea Rizqi Nabilla
    Kelas: IF-5
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent confirmActivity = new Intent(getApplicationContext(), ConfirmActivity.class);
                startActivity(confirmActivity);
            }
        });
    }
}
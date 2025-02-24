package com.example.amalidka3322;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity; // Guna AndroidX

public class SecondActivity extends AppCompatActivity {

    protected TextView tvuser, tvgrade;
    protected EditText txtmarkah;
    protected Button btngrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Inisialisasi elemen UI
        tvuser = findViewById(R.id.tvuser);
        txtmarkah = findViewById(R.id.txtmarkah);
        tvgrade = findViewById(R.id.tvgrade);
        btngrade = findViewById(R.id.btngrade);

        // Dapatkan data pengguna dari Intent
        String txtuser = getIntent().getStringExtra("my.com.ksj.Amali3322");
        if (txtuser != null) {
            tvuser.setText(txtuser);
        } else {
            tvuser.setText("User tidak dikenali");
        }

        // Event listener untuk butang kira gred
        btngrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputMarkah = txtmarkah.getText().toString().trim();

                // Pastikan pengguna memasukkan markah
                if (inputMarkah.isEmpty()) {
                    tvgrade.setText("Sila masukkan markah!");
                    return;
                }

                try {
                    int markah = Integer.parseInt(inputMarkah);
                    String gred;

                    // Tentukan gred berdasarkan markah
                    if (markah > 89) gred = "A";
                    else if (markah > 79) gred = "A-";
                    else if (markah > 69) gred = "B+";
                    else if (markah > 64) gred = "B";
                    else if (markah > 59) gred = "B-";
                    else if (markah > 54) gred = "C+";
                    else if (markah > 49) gred = "C";
                    else if (markah > 44) gred = "D+";
                    else if (markah > 39) gred = "D";
                    else if (markah > 34) gred = "D-";
                    else gred = "E";

                    // Paparkan gred kepada pengguna
                    tvgrade.setText("Gred: " + gred);
                } catch (NumberFormatException e) {
                    tvgrade.setText("Input tidak sah!");
                }
            }
        });
    }
}

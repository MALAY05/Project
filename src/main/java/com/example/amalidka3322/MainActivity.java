package com.example.amalidka3322;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity; // Gunakan AndroidX

public class MainActivity extends AppCompatActivity {

    protected EditText txtusr;
    protected EditText txtpwd; // Gantikan txtpss dengan txtpwd
    protected Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi elemen UI
        txtusr = findViewById(R.id.txtusr);
        txtpwd = findViewById(R.id.txtpwd); // Gantikan txtpss dengan txtpwd
        login = findViewById(R.id.btnlogin);

        // Event listener untuk butang login
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usr = txtusr.getText().toString();
                String pss = txtpwd.getText().toString(); // Gantikan txtpss dengan txtpwd

                if (usr.equals("user") && pss.equals("pass")) {
                    String msg = "User name and password are correct";
                    Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();

                    // Pergi ke SecondActivity
                    Intent intent1 = new Intent(getApplicationContext(), SecondActivity.class);
                    intent1.putExtra("my.com.ksj.Amali3322", usr);
                    startActivity(intent1);
                } else {
                    String msg2 = "User name and password are incorrect";
                    Toast.makeText(getApplicationContext(), msg2, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

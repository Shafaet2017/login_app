package com.example.vaibhav.k_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Login_1_wsdActivity extends AppCompatActivity {

    private EditText editTextL1Email, editTextL1Password;
    private ImageView imageViewL1Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_1_wsd);

        editTextL1Email = findViewById(R.id.id_et_l1_email);
        editTextL1Password = findViewById(R.id.id_et_l1_password);
        imageViewL1Login = findViewById(R.id.id_iv_l1_login);


        imageViewL1Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkLogin();
            }
        });
    }

    private void checkLogin() {
        String email = editTextL1Email.getText().toString();
        String password = editTextL1Password.getText().toString();

        if (!email.isEmpty()) {
            if (!password.isEmpty()) {
                if (email.equals("sabree300@gmail.com")) {
                    if (password.equals("123")) {
                        Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(this, "Incorrect Password!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(this, "Incorrect Email!", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "Password is required!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Email is required!", Toast.LENGTH_SHORT).show();
        }
    }
}

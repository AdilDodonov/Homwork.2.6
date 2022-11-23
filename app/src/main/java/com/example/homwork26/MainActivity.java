package com.example.homwork26;

import static android.graphics.Color.GRAY;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText,editText2;
    private TextView vhod,zabyli,vypolnite,sing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.edittext);
        editText2 = findViewById(R.id.edittext2);
        vhod = findViewById(R.id.vhod);
        zabyli = findViewById(R.id.zabyli);
        vypolnite = findViewById(R.id.a);
        sing = findViewById(R.id.d);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editText.getText().toString().equals("")){
                    button.setBackgroundColor(Color.GRAY);
                } else {
                    button.setBackgroundColor(Color.YELLOW);
                }
            }
        });
        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editText.getText().toString().equals("")){
                    button.setBackgroundColor(Color.GRAY);
                } else {
                    button.setBackgroundColor(Color.YELLOW);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equals("admin@gmail.com") && editText2.getText().toString().equals("admin")){
                    button.setVisibility(View.GONE);
                    editText.setVisibility(View.GONE);
                    editText2.setVisibility(View.GONE);
                    vhod.setVisibility(View.GONE);
                    zabyli.setVisibility(View.GONE);
                    vypolnite.setVisibility(View.GONE);
                    sing.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
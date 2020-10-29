package org.ernold.tugasdatetimepickers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import org.ernold.tugasdatetimepickers.R;

public class MainActivity extends AppCompatActivity {

    Button intentSpinnerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this, SpinnerActivity.class);
        MainActivity.this.startActivity(intent);
        finish();
    }

    public void showText(View view) {
        EditText editText = (EditText) findViewById(R.id.textEdit);
        if (editText != null) {
            String showString = editText.getText().toString();
            Toast.makeText(this, showString, Toast.LENGTH_SHORT).show();
        }
    }

    public void showPass(View view) {
        EditText editText = (EditText) findViewById(R.id.passEdit);
        if (editText != null) {
            String showString = editText.getText().toString();
            Toast.makeText(this, showString, Toast.LENGTH_SHORT).show();
        }
    }

    public void showEmail(View view) {
        EditText editText = (EditText) findViewById(R.id.emailEdit);
        if (editText != null) {
            String showString = editText.getText().toString();
            Toast.makeText(this, showString, Toast.LENGTH_SHORT).show();
        }
    }

    public void showPhone(View view) {
        EditText editText = (EditText) findViewById(R.id.phoneEdit);
        if (editText != null) {
            String showString = editText.getText().toString();
            Toast.makeText(this, showString, Toast.LENGTH_SHORT).show();
        }
    }
}
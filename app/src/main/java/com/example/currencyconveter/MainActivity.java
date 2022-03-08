package com.example.currencyconveter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrenty(View view) {
        Log.i("info","Button pressed");
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal);
        String amountInPounds = editText.getText().toString();
        double amountInPoundsDouble =Double.parseDouble(amountInPounds);
        double amountInDollarsDouble = amountInPoundsDouble *1.3;
        String amountInDollarsString = String.format("%.2f" ,amountInDollarsDouble);
        Toast.makeText(this, "%" + amountInPounds +"is $" + amountInDollarsString,Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
package com.example.onlineorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SallataActivity extends AppCompatActivity {
TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sallata);
        txt = (TextView) findViewById(R.id.textView8);
    }

    public void goBack(View view)
    {
        startActivity(new Intent(view.getContext(), MainActivity.class));
    }

    public void Order(View view)
    {
        txt.setText("Ju porositet");
    }
}

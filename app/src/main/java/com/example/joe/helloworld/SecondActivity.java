package com.example.joe.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SecondActivity extends AppCompatActivity {

    ToggleButton _toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        _toggleButton = (ToggleButton) findViewById(R.id.toggleButton);

        _toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(SecondActivity.this, "ON", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(SecondActivity.this, "OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

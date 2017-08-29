package com.example.joe.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //create instances for each button, will add 2 new buttons later.
    private Button _button1, _button2, _button3;
    private String _string = "this is a message";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this method creates the action listeners for each button on our page.
        CreateButtons();
    }

    private void CreateButtons(){
        //set first button to change intent
        _button1 = (Button) findViewById(R.id.button);
        _button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Look at this cool pop-up", Toast.LENGTH_LONG).show();

                Intent _intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(_intent);
            }
        });

        //second button will also change intent
        _button2 = (Button) findViewById(R.id.button2);
        _button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent _intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(_intent);
            }
        });

        //third button will also change intent
        _button3 = (Button) findViewById(R.id.button3);
        _button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(MainActivity.this, FourthActivity.class);
                startActivity(_intent);
            }
        });
    }
}

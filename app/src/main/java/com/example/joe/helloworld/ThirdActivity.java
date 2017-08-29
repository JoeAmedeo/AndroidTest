package com.example.joe.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    /*
     *
     * This intent consists of a text view, text input, and a button
     * The user will be able to type into the text input field
     * The user can then hit the button and it will replace the text view's
     * String with the input string
     *
     */

    TextView    _textView;
    EditText    _editText;
    Button      _button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //cast and find all items in your activity
        _textView = (TextView) findViewById(R.id.textView2);
        _editText = (EditText) findViewById(R.id.editText);
        _button = (Button) findViewById(R.id.button3);

        //create action listener for the button,
        // which will take the text in the edit text field and insert it into the text view field
        _button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input_string = _editText.getText().toString();
                _textView.setText(input_string);
            }
        });
    }
}

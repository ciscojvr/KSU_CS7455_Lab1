package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextFavoriteCourse;
    TextView textViewAfterSubmit;
    Button buttonClicked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFavoriteCourse = (EditText)findViewById(R.id.editTextFavoriteCourse);
        textViewAfterSubmit = (TextView)findViewById(R.id.textViewAfterSubmit);
        buttonClicked = (Button)findViewById(R.id.buttonToClick);
    }

    public void onButtonClick(View view) {
        if(editTextFavoriteCourse.getText().toString().equals("")) {
            textViewAfterSubmit.setText("");
        } else {
            textViewAfterSubmit.setText(editTextFavoriteCourse.getText() + " is fun!");
        }
    }
}

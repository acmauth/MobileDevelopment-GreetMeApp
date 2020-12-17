package com.example.my_first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Defining objects in order to reference the elements
    private EditText editTextName;
    private TextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain reference to the objects - Make the variables point to the elements
        editTextName = findViewById(R.id.editTextName);
        textViewName = findViewById(R.id.textViewName);
    }

    public void sayHello(View view) {
        // Updating the UI
        String newTextString = "Your name is: " + editTextName.getText().toString();
        textViewName.setText(newTextString);

        // Toast - Displaying Message
        String toastText = "Hello " + editTextName.getText().toString() + "!";
        Toast.makeText(MainActivity.this, toastText, Toast.LENGTH_LONG).show();

        // TODO As a homework, try and make the toast disappear-reappear after each press
    }
}
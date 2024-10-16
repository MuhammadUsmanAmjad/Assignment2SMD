package com.example.assignment2smd;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment2smd.R;

public class InputActivity extends AppCompatActivity {

    private EditText taskNameEditText;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_fragment);

        taskNameEditText = findViewById(R.id.taskNameEditText);
        saveButton = findViewById(R.id.saveButton);

        saveButton.setOnClickListener(view -> {
            String task = taskNameEditText.getText().toString();
            Intent resultIntent = new Intent();
            resultIntent.putExtra("task", task);
            setResult(RESULT_OK, resultIntent);
            finish();
        });
    }
}


package com.example.mymesssage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends Activity {

    public static final String EXTRA_MESSAGE ="message";
    Intent intent;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        textView = findViewById(R.id.message);
        textView.setText(messageText);
    }
}

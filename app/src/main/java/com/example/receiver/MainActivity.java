package com.example.receiver;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intent = getIntent();
        if (intent == null) return;

        if (intent.hasExtra(Intent.EXTRA_TEXT)) {
            final String   json = intent.getStringExtra(Intent.EXTRA_TEXT);
            final TextView tv   = findViewById(R.id.text);

            tv.setText(json);
        }
    }

    @Override
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
    }
}
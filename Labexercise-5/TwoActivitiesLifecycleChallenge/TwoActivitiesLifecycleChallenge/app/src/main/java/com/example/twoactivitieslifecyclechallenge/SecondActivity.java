package com.example.twoactivitieslifecyclechallenge;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY =
            "com.example.android.twoactivities.extra.REPLY";
    private Button replyCheese;
    private Button replyBlueberry;
    private Button replyChocolate;
    private Button replyWhiteForest;
    private Button replyButterscotch;
    private Button replyPineapple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        replyCheese = findViewById(R.id.buttonCheese);
        replyBlueberry = findViewById(R.id.buttonBlueberry);
        replyChocolate = findViewById(R.id.buttonChocolate);
        replyWhiteForest = findViewById(R.id.buttonWhiteForest);
        replyButterscotch = findViewById(R.id.buttonButterscotch);
        replyPineapple = findViewById(R.id.buttonPineapple);
    }

    public void returnReplyCheese(View view) {
        String reply = replyCheese.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyBlueberry(View view) {
        String reply = replyBlueberry.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();

    }

    public void returnReplyChocolate(View view) {
        String reply = replyChocolate.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyWhiteForest(View view) {
        String reply = replyWhiteForest.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyButterscotch(View view) {
        String reply = replyButterscotch.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyPineapple(View view) {
        String reply = replyPineapple.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
}
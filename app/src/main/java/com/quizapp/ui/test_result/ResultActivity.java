package com.quizapp.ui.test_result;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.quizapp.R;

public class ResultActivity extends AppCompatActivity {

    public static void start(Context context){
        Intent intent = new Intent(context,ResultActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }
}

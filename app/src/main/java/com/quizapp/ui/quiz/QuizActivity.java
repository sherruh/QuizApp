package com.quizapp.ui.quiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.quizapp.R;

public class QuizActivity extends AppCompatActivity {

    public static void start(Context context){
        Intent intent = new Intent(context, QuizActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
    }
}

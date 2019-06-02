package com.quizapp.ui.test;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.quizapp.R;
import com.quizapp.ui.test_result.ResultActivity;

public class TestActivity extends AppCompatActivity {

    public static void start(Context context){
        Intent intent = new Intent(context, TestActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, TestFragment.newInstance())
                    .commitNow();
        }
    }
}

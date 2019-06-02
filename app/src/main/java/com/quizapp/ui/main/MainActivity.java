package com.quizapp.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.quizapp.R;
import com.quizapp.ui.history.HistoryActivity;
import com.quizapp.ui.test.TestActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonStartTest;
    Button buttonShowHistory;
    Button buttonShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        buttonStartTest = findViewById(R.id.button_start_test);
        buttonShowHistory = findViewById(R.id.button_show_history);
        buttonShare = findViewById(R.id.button_share);
        buttonStartTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TestActivity.start(MainActivity.this);
            }
        });
        buttonShowHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HistoryActivity.start(MainActivity.this);
            }
        });
    }
}

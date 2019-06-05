package com.quizapp;

import android.app.Application;

import com.quizapp.data.IQuizRepository;
import com.quizapp.data.QuizRepository;

public class App extends Application {

    public static IQuizRepository quizRepository;

    @Override
    public void onCreate() {
        super.onCreate();
        quizRepository = new QuizRepository();
    }
}

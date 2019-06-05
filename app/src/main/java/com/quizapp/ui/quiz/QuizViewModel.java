package com.quizapp.ui.quiz;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.quizapp.App;
import com.quizapp.data.IQuizRepository;
import com.quizapp.model.Question;

import java.util.List;

public class QuizViewModel extends ViewModel {

    public QuizViewModel(){
        App.quizRepository.getQusetions(10, new IQuizRepository.QuestionsCallback() {
            @Override
            public void onSuccess(List<Question> questions) {
                //TODO Update liveData
            }

            @Override
            public void onFailure(String message) {
                Log.d("ololo",message);
            }
        });
    }
}

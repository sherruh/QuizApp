package com.quizapp.data;

import com.quizapp.model.Question;

import java.util.List;

public interface IQuizRepository {

    void getQusetions(int amount, QuestionsCallback callback);

    interface QuestionsCallback{
        void onSuccess(List<Question> questions);

        void onFailure(String message);
    }
}

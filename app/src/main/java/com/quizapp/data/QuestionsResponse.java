package com.quizapp.data;

import com.google.gson.annotations.SerializedName;
import com.quizapp.model.Question;

import java.util.List;

public class QuestionsResponse {
    @SerializedName("resonse_code")
    private int responseCode;

    @SerializedName("results")
    private List<Question> results;

    public QuestionsResponse(int responseCode, List<Question> results) {
        this.responseCode = responseCode;
        this.results = results;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public List<Question> getResults() {
        return results;
    }

    public void setResults(List<Question> results) {
        this.results = results;
    }
}

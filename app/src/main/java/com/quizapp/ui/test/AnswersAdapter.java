package com.quizapp.ui.test;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import java.util.zip.Inflater;

public class AnswersAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<String> answers;

    public AnswersAdapter(List<String> answers) {
        this.answers = answers;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //TODO check type and return
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        //TODO onBind
    }

    @Override
    public int getItemCount() {
        return answers.size();
    }

    public class MultipleTypeViewHolder extends RecyclerView.ViewHolder{

        public MultipleTypeViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
    public class BooleanTypeViewHolder extends RecyclerView.ViewHolder {

        public BooleanTypeViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

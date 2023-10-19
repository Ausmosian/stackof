package com.flipkart.mc.repository;

import com.flipkart.mc.entity.Answer;

import java.util.HashMap;
import java.util.Map;

public class AnswerRepository {
    private Map<String, Answer> answerStore;

    public Answer getAnswer(String id) {
        return answerStore.get(id);
    }

    public Answer addAnswer(Answer answer) {
        answerStore.put(answer.getId(), answer);
        return answer;
    }

    public Answer removeAnswer(Answer answer) {
        answerStore.remove(answer.getId());
        return answer;
    }

    public Answer editAnswer(Answer newAnswer) {
        answerStore.remove(newAnswer.getId());
        answerStore.put(newAnswer.getId(), newAnswer);
        return newAnswer;
    }
}

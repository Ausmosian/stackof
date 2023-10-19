package com.flipkart.mc.repository;

import com.flipkart.mc.entity.Question;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionRepository {
    private Map<String, Question> questionStore;

    public Question getQuestion(String id) {
        return questionStore.get(id);
    }

    public Question addQuestion(Question question) {
        questionStore.put(question.getId(), question);
        return question;
    }

    public Question removeQuestion(Question question) {
        questionStore.remove(question.getId());
        return question;
    }

    public Question editQuestion(Question newQuestion) {
        questionStore.remove(newQuestion.getId());
        questionStore.put(newQuestion.getId(), newQuestion);
        return newQuestion;
    }

    public List<Question> getAllQuestions() {
        return (List<Question>) questionStore.values();
    }
}

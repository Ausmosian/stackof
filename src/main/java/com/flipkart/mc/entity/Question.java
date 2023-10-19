package com.flipkart.mc.entity;

import com.flipkart.mc.util.IdGenerator;

import java.time.LocalDateTime;
import java.util.List;

public class Question {
    private String id;
    private String questionText;
    private User askedBy;
    private List<Topic> topics;
    private List<Answer> answers;
    private LocalDateTime askedOn;
    private boolean isAnswered;

    public Question(User askedBy, List<Topic> topics, String questionText) {
        this.id = IdGenerator.generateId();
        this.questionText = questionText;
        this.topics = topics;
        this.askedBy = askedBy;
        this.askedOn = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public User getAskedBy() {
        return askedBy;
    }

    public void setAskedBy(User askedBy) {
        this.askedBy = askedBy;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public LocalDateTime getAskedOn() {
        return askedOn;
    }

    public void setAskedOn(LocalDateTime askedOn) {
        this.askedOn = askedOn;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setAnswered(boolean answered) {
        isAnswered = answered;
    }

    public void addAnswer(Answer answer) {
        this.answers.add(answer);
    }
}

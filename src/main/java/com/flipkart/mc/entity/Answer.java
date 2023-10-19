package com.flipkart.mc.entity;

import com.flipkart.mc.util.IdGenerator;

import java.time.LocalDateTime;
import java.util.List;

public class Answer {
    private String id;
    private String answerText;
    private User answeredBy;
    private Question question;
    boolean isAccepted;
    int upvotes;
    private LocalDateTime answeredOn;
    private List<Comment> commentsRecieved;

    public Answer(User answeredBy, Question question, String answerText) {
        this.id = IdGenerator.generateId();
        this.answeredBy = answeredBy;
        this.question = question;
        this.answerText = answerText;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public User getAnsweredBy() {
        return answeredBy;
    }

    public void setAnsweredBy(User answeredBy) {
        this.answeredBy = answeredBy;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public LocalDateTime getAnsweredOn() {
        return answeredOn;
    }

    public void setAnsweredOn(LocalDateTime answeredOn) {
        this.answeredOn = answeredOn;
    }

    public List<Comment> getCommentsRecieved() {
        return commentsRecieved;
    }

    public void setCommentsRecieved(List<Comment> commentsRecieved) {
        this.commentsRecieved = commentsRecieved;
    }
}

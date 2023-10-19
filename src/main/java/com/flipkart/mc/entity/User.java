package com.flipkart.mc.entity;

import com.flipkart.mc.util.IdGenerator;

import java.util.List;

public class User {
    private String id;
    private String username;
    private List<Topic> subscribedTopics;
    private List<Comment> commentsMade;
    private List<Question> questionsAsked;

    public User(String username) {
        this.id = IdGenerator.generateId();
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Topic> getSubscribedTopics() {
        return subscribedTopics;
    }

    public void setSubscribedTopics(List<Topic> subscribedTopics) {
        this.subscribedTopics = subscribedTopics;
    }

    public List<Comment> getCommentsMade() {
        return commentsMade;
    }

    public void setCommentsMade(List<Comment> commentsMade) {
        this.commentsMade = commentsMade;
    }

    public List<Question> getQuestions() {
        return questionsAsked;
    }

    public void setQuestions(List<Question> questions) {
        this.questionsAsked = questions;
    }

    public void addQuestion(Question question) {
        this.questionsAsked.add(question);
    }
}

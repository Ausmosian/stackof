package com.flipkart.mc.entity;

import com.flipkart.mc.util.IdGenerator;

import java.time.LocalDateTime;

public class Comment {
    private String id;
    private String commentText;
    private User commentedBy;
    private Answer commentedOn;
    private LocalDateTime commentDateTime;

    public Comment(User commentedBy, Answer commentedOn, String commentText) {
        this.id = IdGenerator.generateId();

        this.commentedBy = commentedBy;
        this.commentedOn = commentedOn;
        this.commentText = commentText;
        this.commentDateTime = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public User getCommentedBy() {
        return commentedBy;
    }

    public void setCommentedBy(User commentedBy) {
        this.commentedBy = commentedBy;
    }

    public Answer getCommentedOn() {
        return commentedOn;
    }

    public void setCommentedOn(Answer commentedOn) {
        this.commentedOn = commentedOn;
    }

    public LocalDateTime getCommentDateTime() {
        return this.commentDateTime;
    }

    public void setCommentDateTime(LocalDateTime commentOn) {
        this.commentDateTime = commentOn;
    }
}

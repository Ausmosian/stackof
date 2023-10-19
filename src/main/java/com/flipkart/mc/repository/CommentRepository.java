package com.flipkart.mc.repository;

import com.flipkart.mc.entity.Comment;

import java.util.HashMap;
import java.util.Map;

public class CommentRepository {
    private Map<String, Comment> commentStore;

    public Comment getComment(String id) {
        return commentStore.get(id);
    }

    public Comment addComment(Comment comment) {
        commentStore.put(comment.getId(), comment);
        return comment;
    }

    public Comment removeComment(Comment comment) {
        commentStore.remove(comment.getId());
        return comment;
    }

    public Comment editComment(Comment oldComment, Comment newComment) {
        commentStore.remove(oldComment.getId());
        commentStore.put(newComment.getId(), newComment);
        return newComment;
    }
}

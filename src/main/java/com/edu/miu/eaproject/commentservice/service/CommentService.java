package com.edu.miu.eaproject.commentservice.service;

import com.edu.miu.eaproject.commentservice.domain.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getComments();
    Comment getComment(Long id);
    void add(Comment comment);
    void update(Long id1, Comment comment);
    void delete(Long id);

    List<Comment> getUserComments(Long postId);
}

package com.edu.miu.eaproject.commentservice.service;

import com.edu.miu.eaproject.commentservice.domain.Comment;

import java.util.List;

public interface CommentService {
    public List<Comment> getComments();
    public Comment getComment(Long id);
    public void add(Long userId, Long postId, Comment comment);
    public void update(Long userId, Long postId, Long id, Comment comment);
    public void delete(Long id);
}

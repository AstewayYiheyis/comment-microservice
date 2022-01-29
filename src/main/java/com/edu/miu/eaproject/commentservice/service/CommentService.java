package com.edu.miu.eaproject.commentservice.service;

import com.edu.miu.eaproject.commentservice.domain.Comments;

import javax.xml.stream.events.Comment;
import java.util.List;

public interface CommentService {
    List<Comments> getComments();
    Comments getComment(Long id);
    void add(Comments comments);
    void update(Long id1, Comments comments);
    void delete(Long id);

    List<Comments> getPostComments(Long postId);

    List<Comments> getUserComments(Long userId);

    List<Comment> getUserPostComment(Long userId, Long postId);
}

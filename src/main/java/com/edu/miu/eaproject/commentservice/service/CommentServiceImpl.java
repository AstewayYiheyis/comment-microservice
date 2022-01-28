package com.edu.miu.eaproject.commentservice.service;

import com.edu.miu.eaproject.commentservice.domain.Comment;
import com.edu.miu.eaproject.commentservice.domain.User;
import com.edu.miu.eaproject.commentservice.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    private CommentRepo commentRepo;

    @Autowired
    private CommentServiceUser commentServiceUser;

    @Override
    public List<Comment> getComments() {
        return commentRepo.findAll();
    }

    @Override
    public Comment getComment(Long id) {
        return commentRepo.findById(id).orElse(null);
    }

    @Override
    public void add(Long userId, Long postId, Comment comment) {
        User user = commentServiceUser.getUser(userId);

        if(user != null){
            comment.setUserId(userId);
            comment.setPostId(postId);

            commentRepo.save(comment);
        }
    }

    @Override
    public void update(Long userId, Long postId, Long id, Comment comment) {
        comment.setId(id);

        User user = commentServiceUser.getUser(userId);

        if(user != null){
            comment.setUserId(userId);
            comment.setPostId(postId);

            commentRepo.save(comment);
        }
    }

    @Override
    public void delete(Long id) {
        if(commentRepo.existsById(id)){
            commentRepo.deleteById(id);
        }
    }
}

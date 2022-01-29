package com.edu.miu.eaproject.commentservice.service;

import com.edu.miu.eaproject.commentservice.domain.Comments;
import com.edu.miu.eaproject.commentservice.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.stream.events.Comment;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    private CommentRepo commentRepo;

    @Override
    public List<Comments> getComments() {
        return commentRepo.findAll();
    }

    @Override
    public Comments getComment(Long id) {
        return commentRepo.findById(id).orElse(null);
    }

    @Override
    public void add(Comments comments) {
        commentRepo.save(comments);
    }

    @Override
    public void update(Long id, Comments comments) {
        comments.setId(id);

        commentRepo.save(comments);
    }

    @Override
    public void delete(Long id) {
        if(commentRepo.existsById(id)){
            commentRepo.deleteById(id);
        }
    }

    @Override
    public List<Comments> getPostComments(Long postId) {
        return commentRepo.findByPostId(postId);
    }

    @Override
    public List<Comments> getUserComments(Long userId) {
        return commentRepo.findByUserId(userId);
    }

    @Override
    public List<Comment> getUserPostComment(Long userId, Long postId) {
        return commentRepo.findByUserIdAndPostId(userId, postId);
    }
}

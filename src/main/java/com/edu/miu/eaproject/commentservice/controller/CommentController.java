package com.edu.miu.eaproject.commentservice.controller;

import com.edu.miu.eaproject.commentservice.domain.Comment;
import com.edu.miu.eaproject.commentservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public List<Comment> getComments() {
        return commentService.getComments();
    }

    @GetMapping("/comments/{id}")
    public Comment getComment(@PathVariable Long id){
        return commentService.getComment(id);
    }

    @GetMapping("/posts/{postId}/comments")
    public List<Comment> getUserComments(@PathVariable Long postId){
        return commentService.getUserComments(postId);
    }

    @PostMapping("/comments")
    public void add(@RequestBody Comment comment){
        commentService.add(comment);
    }

    @PutMapping("/comments/{id}")
    public void update(@PathVariable Long id, @RequestBody Comment comment){
        commentService.update(id, comment);
    }

    @DeleteMapping("/comments/{id}")
    public void delete(@PathVariable Long id){
        commentService.delete(id);
    }
}

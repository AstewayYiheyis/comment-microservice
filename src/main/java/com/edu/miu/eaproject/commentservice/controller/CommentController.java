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

    @GetMapping("/users/{userId}/posts/{postId}/comments")
    public List<Comment> getComments() {
        return commentService.getComments();
    }

    @GetMapping("/users/{userId}/posts/{postId}/comments/{id}")
    public Comment getComment(@PathVariable Long id){
        return commentService.getComment(id);
    }

    @PostMapping("/users/{userId}/posts/{postId}/comments")
    public void add(@PathVariable Long  userId, @PathVariable Long postId, @RequestBody Comment comment){
        System.out.println(comment);
        commentService.add(userId, postId, comment);
    }

    @PutMapping("/users/{userId}/posts/{postId}/comments/{id}")
    public void update(@PathVariable Long userId, @PathVariable Long postId, @PathVariable Long id, @RequestBody Comment comment){
        commentService.update(id, postId, id, comment);
    }

    @DeleteMapping("/users/{userId}/posts/{postId}/comments/{id}")
    public void delete(@PathVariable Long id){
        commentService.delete(id);
    }
}

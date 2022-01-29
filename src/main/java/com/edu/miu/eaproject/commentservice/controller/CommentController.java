package com.edu.miu.eaproject.commentservice.controller;

import com.edu.miu.eaproject.commentservice.domain.Comments;
import com.edu.miu.eaproject.commentservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public List<Comments> getComments() {
        return commentService.getComments();
    }

    @GetMapping("/comments/{id}")
    public Comments getComment(@PathVariable Long id){
        return commentService.getComment(id);
    }

    @GetMapping("/posts/{postId}/comments")
    public List<Comments> getPostComments(@PathVariable Long postId){
        return commentService.getPostComments(postId);
    }

    @GetMapping("/users/{userId}/comments")
    public List<Comments> getUserComments(@PathVariable Long userId){
        return commentService.getUserComments(userId);
    }

    @PostMapping("/comments")
    public void add(@RequestBody Comments comments){
        commentService.add(comments);
    }

    @PutMapping("/comments/{id}")
    public void update(@PathVariable Long id, @RequestBody Comments comments){
        commentService.update(id, comments);
    }

    @DeleteMapping("/comments/{id}")
    public void delete(@PathVariable Long id){
        commentService.delete(id);
    }
}

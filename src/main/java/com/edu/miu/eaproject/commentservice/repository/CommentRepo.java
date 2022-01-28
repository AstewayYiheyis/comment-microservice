package com.edu.miu.eaproject.commentservice.repository;

import com.edu.miu.eaproject.commentservice.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment, Long> {
    @Query("select c from Comment c where c.PostId = ?1")
    List<Comment> findByPostId(Long postId);
}

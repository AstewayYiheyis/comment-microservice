package com.edu.miu.eaproject.commentservice.repository;

import com.edu.miu.eaproject.commentservice.domain.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.xml.stream.events.Comment;
import java.util.List;

public interface CommentRepo extends JpaRepository<Comments, Long> {
    @Query("select c from Comments c where c.postId = ?1")
    List<Comments> findByPostId(Long postId);

    @Query("select c from Comments c where c.userId = ?1")
    List<Comments> findByUserId(Long userId);

    @Query("select c from Comments c where c.userId = ?1 AND c.postId = ?2")
    List<Comment> findByUserIdAndPostId(Long userId, Long postId);
}

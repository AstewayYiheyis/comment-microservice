package com.edu.miu.eaproject.commentservice.repository;

import com.edu.miu.eaproject.commentservice.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Long> {
}

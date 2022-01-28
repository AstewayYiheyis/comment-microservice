package com.edu.miu.eaproject.commentservice.domain;

import javax.persistence.*;
import java.util.List;

public class User {
    private Long id;
    private String name;
    private String phone;

    private List<Post> posts;

    private List<Comment> comments;
}

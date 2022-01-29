package com.edu.miu.eaproject.commentservice.domain;

import java.util.List;

public class Post {
    private int id;

    private String title;
    private String body;
    private List<Comments> comments;

    public Post(String title, String body, List<Comments> comments) {
        this.title = title;
        this.body = body;
        this.comments = comments;
    }

    public Post() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }
}

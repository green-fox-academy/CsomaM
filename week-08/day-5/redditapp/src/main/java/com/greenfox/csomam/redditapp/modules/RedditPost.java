package com.greenfox.csomam.redditapp.modules;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RedditPost {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    private int score;
    private String content;

    public RedditPost(String content) {
        this.score = 0;
        this.content = content;
    }

    public RedditPost() {
        this.score = 0;
        this.content = "";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

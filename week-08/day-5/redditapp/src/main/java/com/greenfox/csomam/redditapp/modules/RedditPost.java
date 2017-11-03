package com.greenfox.csomam.redditapp.modules;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class RedditPost {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    private String createdOn;
    private int score;
    private String content;

    public RedditPost(String content) {
        this.score = 0;
        this.content = content;
        this.createdOn = getNow();

    }

    public RedditPost() {
        this.score = 0;
        this.content = "";
        this.createdOn = getNow();
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
        this.score += score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    private String getNow(){
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:mm");
        Date now = new Date();
        String strDate = sdf.format(now);
        return strDate;
    }
}

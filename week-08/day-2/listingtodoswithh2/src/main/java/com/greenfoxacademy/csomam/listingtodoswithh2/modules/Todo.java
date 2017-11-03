package com.greenfoxacademy.csomam.listingtodoswithh2.modules;

import javax.persistence.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue (strategy= GenerationType.AUTO)
    long id;

    private String title;
    private boolean isUrgent;
    private boolean isDone;

    public Todo() {
        this.isUrgent = false;
        this.isDone = false;
    }

    public Todo(String title) {
        this.title = title;
        this.isUrgent = false;
        this.isDone = false;
    }

    public long getId() {
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

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}

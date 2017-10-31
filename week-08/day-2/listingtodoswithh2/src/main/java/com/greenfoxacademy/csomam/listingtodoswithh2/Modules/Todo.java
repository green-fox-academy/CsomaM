package com.greenfoxacademy.csomam.listingtodoswithh2.Modules;

public class Todo {

    private int id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;

    public Todo() {
        this.isUrgent = false;
        this.isDone = false;
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

package com.greenfox.csomam.frontend.modules;

public class Appenda {

    String appended;

    public Appenda(String appended) {
        this.appended = appended + "a";
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}

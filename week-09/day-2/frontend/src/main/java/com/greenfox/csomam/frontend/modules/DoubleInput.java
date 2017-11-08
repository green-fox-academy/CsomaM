package com.greenfox.csomam.frontend.modules;

public class DoubleInput {

    int received;
    int result;

    public DoubleInput(int received) {
        this.received = received;
        this.result = received * 2;

    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int recieved) {
        this.received = recieved;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

}

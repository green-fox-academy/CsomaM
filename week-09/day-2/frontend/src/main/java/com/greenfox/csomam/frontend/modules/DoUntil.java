package com.greenfox.csomam.frontend.modules;

public class DoUntil {

    int result;

    public DoUntil(String method, int until) {
        if (method.equals("sum")) {
            this.result = sum(until);
        } else if (method.equals("factor")) {
            this.result = factor(until);
        }
    }

    public DoUntil() {
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int sum(int number) {
        int result = 0;
        for (int j = 1; j <= number; j++) {
            result += j;
        }
        return result;
    }

    public int factor(int number) {
        int result = 1;
        for (int j = 1; j <= number ; j++) {
            result *= j;
        }
        return result;
    }
}

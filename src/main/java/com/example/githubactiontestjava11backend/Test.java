package com.example.githubactiontestjava11backend;

public class Test {
    private Long number;

    public Test(Long number) {
        this.number = number;
    }

    public String factorial(Long number) {
        if(number<0) {
            return "factorial is only defined for non-negative integers!";
        }
        else if (number == 0) {
            return "1";
        } else {
            return "0";
        }
    }
}

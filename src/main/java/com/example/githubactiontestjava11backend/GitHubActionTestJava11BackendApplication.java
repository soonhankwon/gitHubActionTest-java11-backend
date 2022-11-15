package com.example.githubactiontestjava11backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitHubActionTestJava11BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitHubActionTestJava11BackendApplication.class, args);
        long number = 1;
        long number2 = -1;
        long number3 = 0;
        Test test = new Test(number);
        test.factorial(number);
        test.factorial(number2);
        test.factorial(number3);
        System.out.println(test.factorial(number));
        System.out.println(test.factorial(number2));
        System.out.println(test.factorial(number3));
    }
}

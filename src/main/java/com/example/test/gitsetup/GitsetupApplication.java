package com.example.test.gitsetup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitsetupApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitsetupApplication.class, args);
        System.out.println("Fix Bug-1");
        System.out.println("Fix Bug-2");
        System.out.println("Feature 1");
        System.out.println("Feature 2");
    }
}

git status
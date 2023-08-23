package com.example.githubactionsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsDemoApplication {
//    echo "# github-actions-demo" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/amirsohailklm/github-actions-demo.git
//    git push -u origin main

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Github Demo";
    }
    public static void main(String[] args) {
        SpringApplication.run(GithubActionsDemoApplication.class, args);
    }

}

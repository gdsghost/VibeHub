package com.programming.sudamyasodya.springredditclone;

import com.programming.sudamyasodya.springredditclone.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class SpringRedditCloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.programming.sudamyasodya.springredditclone.SpringRedditCloneApplication.class, args);
    }

}

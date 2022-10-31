package com.bihara.demo.could.git.config.democouldgitconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoCouldGitConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCouldGitConfigApplication.class, args);
    }

}

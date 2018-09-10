package com.redhat.rhoar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorld {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public Message displayMessage() {
        return new Message();
    }

    static class Message {
        private String content = "Hello World! -- v1 --";

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}

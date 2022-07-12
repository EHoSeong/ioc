package com.example.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Base64Utils;

@SpringBootApplication
public class IocApplication {

    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=20&size=20&name=spring-boot";

        Encoder encoder = new Encoder(new UrlEncoder());
        String result = encoder.encode(url);

        System.out.println(result);

    }

}

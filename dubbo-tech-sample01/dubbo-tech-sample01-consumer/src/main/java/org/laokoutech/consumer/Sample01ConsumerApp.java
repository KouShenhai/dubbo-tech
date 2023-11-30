package org.laokoutech.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class Sample01ConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(Sample01ConsumerApp.class, args);
    }
}

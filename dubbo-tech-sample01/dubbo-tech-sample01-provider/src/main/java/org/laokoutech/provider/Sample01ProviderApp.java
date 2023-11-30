package org.laokoutech.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class Sample01ProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(Sample01ProviderApp.class, args);
    }
}

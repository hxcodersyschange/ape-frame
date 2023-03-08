package com.hx.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@MapperScan(value = "com.hx.*.mapper")
@ComponentScan("com.hx")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }

    @Bean
    public CommandLineRunner run(ApplicationContext applicationContext){
        return args -> {
            String[] beans = applicationContext.getBeanDefinitionNames();
            Arrays.stream(beans).sorted().forEach(System.out::println);
        };
    }
}

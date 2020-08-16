package com.gosang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author gosang
 * @version 1.0
 * @date 2020/8/15 16:29
 */
@SpringBootApplication
@MapperScan("com.gosang.mapper")
public class mySpringBoot001Application {
    public static void main(String[] args) {

        ApplicationContext run = SpringApplication.run(mySpringBoot001Application.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String bean : beanDefinitionNames) {
            System.out.println(bean);
        }
    }
}

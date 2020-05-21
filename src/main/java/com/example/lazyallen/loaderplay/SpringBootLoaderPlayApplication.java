package com.example.lazyallen.loaderplay;

import com.example.lazyallen.loaderplay.utils.ClassLoaderUtils;
import com.example.lazyallen.loaderplay.utils.StackUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URLClassLoader;

@SpringBootApplication
public class SpringBootLoaderPlayApplication {


    public static void main(String[] args) {
        System.out.println("========= deduce Main Application Class=============");
        System.out.println(StackUtils.deduceMainApplicationClass());

        System.out.println("========= ClassLoader Tree=============");
        System.out.println(ClassLoaderUtils.tree());

        System.out.println("========= Spring Boot Application ClassLoader Urls =============");
        System.out.println(ClassLoaderUtils.urls((URLClassLoader) SpringBootLoaderPlayApplication.class.getClassLoader()));

        System.out.println("========= System ClassLoader Urls =============");
        System.out.println(ClassLoaderUtils.urls((URLClassLoader) ClassLoader.getSystemClassLoader()));
        SpringApplication.run(SpringBootLoaderPlayApplication.class, args);
    }

}

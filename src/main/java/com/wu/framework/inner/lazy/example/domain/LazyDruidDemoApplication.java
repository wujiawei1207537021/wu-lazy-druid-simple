package com.wu.framework.inner.lazy.example.domain;

import com.alibaba.druid.support.jakarta.StatViewServlet;
import com.wu.framework.filter.LazyRequestFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LazyDruidDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(LazyDruidDemoApplication.class, args);
    }
}

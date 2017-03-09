package com.schen.compute.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by chen on 17-3-9.
 */

@EnableDiscoveryClient
@SpringBootApplication

public class ComputeServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ComputeServiceApplication.class).web(true).run(args);
    }

}

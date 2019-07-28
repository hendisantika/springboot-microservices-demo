package com.hendisantika.microservices.profilemicroserviceproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProfileMicroserviceProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProfileMicroserviceProducerApplication.class, args);
    }

}

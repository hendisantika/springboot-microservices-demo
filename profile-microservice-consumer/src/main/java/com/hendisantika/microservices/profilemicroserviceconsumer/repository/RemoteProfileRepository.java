package com.hendisantika.microservices.profilemicroserviceconsumer.repository;

import com.hendisantika.microservices.profilemicroserviceconsumer.model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : profile-microservice-consumer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-28
 * Time: 15:36
 */
public class RemoteProfileRepository implements ProfileRepository {

    @Autowired
    protected RestTemplate restTemplate;

    protected String serviceUrl;

    public RemoteProfileRepository(String serviceUrl) {
        this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
                : "http://" + serviceUrl;
    }

    @Override
    public List<Profile> getAllProfiles() {
        Profile[] profiles = restTemplate.getForObject(serviceUrl + "/profiles", Profile[].class);
        return Arrays.asList(profiles);
    }

    @Override
    public Profile getProfile(String userId) {
        return restTemplate.getForObject(serviceUrl + "/profiles/{id}",
                Profile.class, userId);
    }

}
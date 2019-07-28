package com.hendisantika.microservices.profilemicroserviceproducer.controller;

import com.hendisantika.microservices.profilemicroserviceproducer.model.Profile;
import com.hendisantika.microservices.profilemicroserviceproducer.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : profile-microservice-producer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-28
 * Time: 15:27
 */
@RestController
public class ProfileController {

    @Autowired
    ProfileRepository profileRepository;

    @RequestMapping("/profiles")
    public Profile[] all() {
        List<Profile> profiles = profileRepository.getAllProfiles();
        return profiles.toArray(new Profile[profiles.size()]);
    }

    @RequestMapping("/profiles/{id}")
    public Profile byId(@PathVariable("id") String userId) {
        Profile profile = profileRepository.getProfile(userId);
        return profile;
    }
}
package com.hendisantika.microservices.profilemicroserviceproducer.repository;

import com.hendisantika.microservices.profilemicroserviceproducer.model.Profile;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : profile-microservice-producer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-28
 * Time: 15:25
 */
public interface ProfileRepository {
    List<Profile> getAllProfiles();

    Profile getProfile(String userId);
}
package com.hendisantika.microservices.profilemicroserviceconsumer.repository;

import com.hendisantika.microservices.profilemicroserviceconsumer.model.Profile;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : profile-microservice-consumer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-28
 * Time: 15:35
 */
public interface ProfileRepository {
    List<Profile> getAllProfiles();

    Profile getProfile(String userId);
}
package com.hendisantika.microservices.profilemicroserviceproducer.repository;

import com.hendisantika.microservices.profilemicroserviceproducer.model.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : profile-microservice-producer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-28
 * Time: 15:26
 */
@Repository
public class StubProfileRepository implements ProfileRepository {

    private Map<String, Profile> profileData = new HashMap<String, Profile>();

    public StubProfileRepository() {
        Profile profile = new Profile("1000", "Ajit");
        profileData.put("1000", profile);
        profile = new Profile("2000", "Amay");
        profileData.put("2000", profile);
        profile = new Profile("3000", "Dinesh");
        profileData.put("3000", profile);
    }

    @Override
    public List<Profile> getAllProfiles() {
        return new ArrayList<Profile>(profileData.values());
    }

    @Override
    public Profile getProfile(String userId) {
        return profileData.get(userId);
    }

}
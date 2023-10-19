package com.flipkart.mc.repository;

import com.flipkart.mc.entity.User;

import java.util.Map;

public class UserRepository {
    private Map<String, User> userStore;

    public User getUser(String id) {
        return userStore.get(id);
    }

    public User addUser(User user) {
        userStore.put(user.getId(), user);
        return user;
    }

    public User removeUser(User user) {
        userStore.remove(user.getId());
        return user;
    }

    public User editUser(User newUser) {
        userStore.remove(newUser.getId());
        userStore.put(newUser.getId(), newUser);
        return newUser;
    }

}

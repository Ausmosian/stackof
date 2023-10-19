package com.flipkart.mc.service;

import com.flipkart.mc.entity.Topic;
import com.flipkart.mc.entity.User;
import com.flipkart.mc.repository.TopicRepository;
import com.flipkart.mc.repository.UserRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserService {
    UserRepository userRepository;
    TopicRepository topicRepository;

    public boolean subscribe(String userId, List<String> topicNames) {
        User user = userRepository.getUser(userId);

        Set<Topic> subscribedTopics = new HashSet<>(user.getSubscribedTopics());
        for(String name: topicNames) {
            Topic topic = topicRepository.getTopicByName(name);

            if(!subscribedTopics.contains(topic)) subscribedTopics.add(topic);
        }

        user.setSubscribedTopics(new ArrayList<>(subscribedTopics));
        userRepository.editUser(user);

        return true;
    }

    public boolean unSubscribe(String userId, List<String> topicNames) {
        User user = userRepository.getUser(userId);

        Set<Topic> subscribedTopics = new HashSet<>(user.getSubscribedTopics());
        for(String name: topicNames) {
            Topic topic = topicRepository.getTopicByName(name);

            if(subscribedTopics.contains(topic)) subscribedTopics.add(topic);
        }

        user.setSubscribedTopics(new ArrayList<>(subscribedTopics));
        userRepository.editUser(user);

        return true;
    }
}

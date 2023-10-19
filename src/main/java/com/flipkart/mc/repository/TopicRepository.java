package com.flipkart.mc.repository;

import com.flipkart.mc.entity.Topic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopicRepository {
    private Map<String, Topic> topicStore;

    public Topic getTopic(String id) {
        return topicStore.get(id);
    }

    public Topic addTopic(Topic topic) {
        topicStore.put(topic.getId(), topic);
        return topic;
    }

    public Topic removeTopic(Topic topic) {
        topicStore.remove(topic.getId());
        return topic;
    }

    public Topic editTopic(Topic oldTopic, Topic newTopic) {
        topicStore.remove(oldTopic.getId());
        topicStore.put(newTopic.getId(), newTopic);
        return newTopic;
    }

    public Topic getTopicByName(String name) {
        List<Topic> allTopics = (List<Topic>) topicStore.values();

        for(Topic topic: allTopics) {
            if(topic.getName().equals(name)) return topic;
        }

        return null;

    }
}

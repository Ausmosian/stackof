package com.flipkart.mc.util;

import com.flipkart.mc.entity.Topic;
import com.flipkart.mc.entity.User;

import java.util.List;

public class TopicSubscriptionChecker {
    public static boolean isUserSubscribedForTopic(User user, Topic topic) {
        return user.getSubscribedTopics().contains(topic);
    }

    public static boolean isUserSubscribedForTopics(User user, List<Topic> topics) {
        for(Topic topic: topics) {
            if(!isUserSubscribedForTopic(user, topic)) return false;
        }
        return true;
    }
}

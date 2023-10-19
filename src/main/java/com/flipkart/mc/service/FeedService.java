package com.flipkart.mc.service;

import com.flipkart.mc.dto.FeedFilterDTO;
import com.flipkart.mc.entity.Question;
import com.flipkart.mc.entity.Topic;
import com.flipkart.mc.entity.User;
import com.flipkart.mc.repository.QuestionRepository;
import com.flipkart.mc.repository.TopicRepository;
import com.flipkart.mc.repository.UserRepository;
import com.flipkart.mc.util.TopicSubscriptionChecker;

import java.util.ArrayList;
import java.util.List;

public class FeedService {
    UserRepository userRepository;
    TopicRepository topicRepository;

    QuestionRepository questionRepository;

    public List<Question> showFeed(String userId) {
        User user = userRepository.getUser(userId);
        List<Question> allQuestions = questionRepository.getAllQuestions();

        List<Question> subscribedQuestions = new ArrayList<>();

        for(Question question: allQuestions) {
            if(TopicSubscriptionChecker.isUserSubscribedForTopics(user, question.getTopics())) subscribedQuestions.add(question);
        }

        return subscribedQuestions;
    }

    public List<Question> showFeedByTopic(String userId, String topicName) {
        User user = userRepository.getUser(userId);
        Topic topic = topicRepository.getTopicByName(topicName);

        List<Question> allQuestions = questionRepository.getAllQuestions();

        List<Question> subscribedQuestions = new ArrayList<>();

        for(Question question: allQuestions) {
            if(TopicSubscriptionChecker.isUserSubscribedForTopics(user, question.getTopics()) && question.getTopics().contains(topic)) subscribedQuestions.add(question);
        }

        return subscribedQuestions;
    }

    public List<Question> showFeedAnswered(String userId) {
        User user = userRepository.getUser(userId);

        List<Question> allQuestions = questionRepository.getAllQuestions();

        List<Question> subscribedQuestions = new ArrayList<>();

        for(Question question: allQuestions) {
            if(TopicSubscriptionChecker.isUserSubscribedForTopics(user, question.getTopics()) && question.isAnswered()) subscribedQuestions.add(question);
        }

        return subscribedQuestions;
    }

    public List<Question> showFeedUnAnswered(String userId) {
        User user = userRepository.getUser(userId);

        List<Question> allQuestions = questionRepository.getAllQuestions();

        List<Question> subscribedQuestions = new ArrayList<>();

        for(Question question: allQuestions) {
            if(TopicSubscriptionChecker.isUserSubscribedForTopics(user, question.getTopics()) && !question.isAnswered()) subscribedQuestions.add(question);
        }

        return subscribedQuestions;
    }

    public List<Question> showFeed(FeedFilterDTO filter) {
        return null;
    }
}

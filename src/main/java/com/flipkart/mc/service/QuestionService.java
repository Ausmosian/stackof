package com.flipkart.mc.service;

import com.flipkart.mc.entity.Question;
import com.flipkart.mc.entity.Topic;
import com.flipkart.mc.entity.User;
import com.flipkart.mc.repository.QuestionRepository;
import com.flipkart.mc.repository.TopicRepository;
import com.flipkart.mc.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class QuestionService {
    UserRepository userRepository;
    TopicRepository topicRepository;

    QuestionRepository questionRepository;
    public Question addQuestion(String userId, List<String> topicNames, String questionText) {
        User user = userRepository.getUser(userId);

        List<Topic> topics = new ArrayList<>();
        for(String name: topicNames) {
            Topic topic = topicRepository.getTopicByName(name);
            topics.add(topic);
        }

        Question question = new Question(user, topics, questionText);
        questionRepository.addQuestion(question);

        user.addQuestion(question);
        userRepository.editUser(user);
        return question;
    }

//    public Question showQuestion(String userId, String question)

}

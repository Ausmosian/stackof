package com.flipkart.mc.service;

import com.flipkart.mc.entity.Answer;
import com.flipkart.mc.entity.Question;
import com.flipkart.mc.entity.User;
import com.flipkart.mc.repository.AnswerRepository;
import com.flipkart.mc.repository.QuestionRepository;
import com.flipkart.mc.repository.UserRepository;

import java.util.List;

public class AnswerService {
    UserRepository userRepository;
    QuestionRepository questionRepository;
    AnswerRepository answerRepository;

    public Answer answerQuestion(String userId, String questionId, String answerText) {
        User user = userRepository.getUser(userId);
        Question question = questionRepository.getQuestion(questionId);

        Answer answer = new Answer(user , question, answerText);

        question.addAnswer(answer);
        question.setAnswered(true);
        questionRepository.editQuestion(question);

        return answer;
    }

    public void acceptAnswer(String userId, String questionId, String answerId) {
        User user = userRepository.getUser(userId);
        Question question = questionRepository.getQuestion(questionId);
        Answer answer = answerRepository.getAnswer(answerId);

        answer.setAccepted(true);
        answerRepository.editAnswer(answer);
    }

    public List<Answer> showAnswers(String userId, String questionId) {
        User user = userRepository.getUser(userId);
        Question question = questionRepository.getQuestion(questionId);

        List<Answer> answers = question.getAnswers();
        //sort here
        return answers;
    }
}

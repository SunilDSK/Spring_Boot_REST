package com.sunilkumar.springboot.topicController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private static List<Topic> topics = new ArrayList<>(
            Arrays.asList(new Topic("Java", "Java Collections", "Learn about java collection framework"),
                    new Topic("JavaScript", "JavaScript", "Learn about javaScript"),
                    new Topic("Python", "Python language", "Learn Python")));
    private Topic topicByID;

    public List<Topic> getTopics() {
        // return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add); // This will get all the records from DB
        return topics;
    }

    public Topic getTopicByID(String id) {
//        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
        return topicRepository.findOne(id); // This will return the topic with specific ID
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic); // This will save the topic object to DB
//        topics.add(topic);
    }

    public void updateTopic(Topic topic) {
        topicRepository.save(topic); // This will update the topic,
        // since topic object contains ID it will update the existing thing else it will add it
    }

    public void deleteTopic(String id) {
        topicRepository.delete(id);
        // This will delete the topic based on topic ID
    }
}

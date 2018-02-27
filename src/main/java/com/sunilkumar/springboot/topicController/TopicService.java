package com.sunilkumar.springboot.topicController;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private static List<Topic> topics = new ArrayList<>(
            Arrays.asList(new Topic("Java", "Java Collections", "Learn about java collection framework"),
                    new Topic("JavaScript", "JavaScript", "Learn about javaScript"),
                    new Topic("Python", "Python language", "Learn Python")));
    private Topic topicByID;

    public List<Topic> getTopics() {
        return topics;
    }

    public Topic getTopicByID(String id) {
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equalsIgnoreCase(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }
}

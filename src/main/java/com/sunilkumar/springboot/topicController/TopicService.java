package com.sunilkumar.springboot.topicController;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics =
            Arrays.asList(new Topic("Java", "Java Collections", "Learn about java collection framework"),
                    new Topic("JavaScript", "JavaScript", "Learn about javaScript"),
                    new Topic("Python", "Python language", "Learn Python"));

    public List<Topic> getTopics() {
        return topics;
    }
}

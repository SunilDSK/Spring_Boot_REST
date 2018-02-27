package com.sunilkumar.springboot.topicController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics () {
        return topicService.getTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopicByID (@PathVariable String id) {
        return topicService.getTopicByID(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }
}

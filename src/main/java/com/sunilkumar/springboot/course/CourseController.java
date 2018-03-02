package com.sunilkumar.springboot.course;

import com.sunilkumar.springboot.topicController.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllTopics (@PathVariable String id) {
        return courseService.getCourses(id);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getTopicByID (@PathVariable String id) {
        return courseService.getCourseByID(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addTopic(@PathVariable String topicId, @RequestBody Course course) {
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/course/{id}")
    public void updateTopic(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/course/{id}")
    public void deleteTopic(@PathVariable String id) {
        courseService.deleteCourse(id);
    }
}

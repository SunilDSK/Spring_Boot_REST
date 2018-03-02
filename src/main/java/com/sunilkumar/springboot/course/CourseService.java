package com.sunilkumar.springboot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    private Course courseByID;

    public List<Course> getCourses(String id) {
        // return courses;
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(id).forEach(courses::add); // This will get all the records from DB
        return courses;
    }

    public Course getCourseByID(String id) {
//        return courses.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
        return courseRepository.findOne(id); // This will return the topic with specific ID
    }

    public void addCourse(Course course) {
        courseRepository.save(course); // This will save the course object to DB
//        courses.add(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course); // This will update the course,
        // since course object contains ID it will update the existing thing else it will add it
    }

    public void deleteCourse(String id) {
        courseRepository.delete(id);
        // This will delete the topic based on topic ID
    }
}

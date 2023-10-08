package com.geekster.StudentPortal.controller;

import com.geekster.StudentPortal.model.Course;
import com.geekster.StudentPortal.service.CourseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("course")
    public String addCourse(@RequestBody @Valid Course course){
        return courseService.addCourse(course);
    }

    @GetMapping("course")
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }

    @GetMapping("course/{id}")
    public Course getCourseById(@PathVariable Long id){
        return courseService.getCourseById(id);
    }

    @PutMapping("course/{title}")
    public String updateCourseByTitle(@PathVariable @Valid String title, @RequestBody @Valid Course updatedCourse){
        return courseService.updateCourseByTitle(title,updatedCourse);
    }

    @DeleteMapping("course/{id}")
    public String deleteCourseById(@PathVariable Long id){
        return courseService.deleteCourseById(id);
    }
}

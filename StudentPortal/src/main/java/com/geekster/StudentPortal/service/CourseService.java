package com.geekster.StudentPortal.service;

import com.geekster.StudentPortal.model.Course;
import com.geekster.StudentPortal.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    ICourseRepository iCourseRepository;


    // Add Course
    public String addCourse(Course course) {
        iCourseRepository.save(course);
        return "Course Added";
    }

    // Get All Course
    public List<Course> getAllCourse() {
        return iCourseRepository.findAll();
    }

    // Get Course By I'd
    public Course getCourseById(Long id) {
        return iCourseRepository.findById(id).orElseThrow();
    }

    // find Course by Title
    public Optional<Course> findCourseByTitle(String title) {
        return iCourseRepository.findByTitle(title);
    }

    // Update Course by Title
    public String updateCourseByTitle(String title, Course updatedCourse) {
        Optional<Course> courseOptional = findCourseByTitle(title);

        if(courseOptional.isPresent()){
            Course existingCourse = courseOptional.get();
            existingCourse.setTitle(updatedCourse.getTitle());
            existingCourse.setDescription(updatedCourse.getDescription());
            existingCourse.setDuration(updatedCourse.getDuration());

            iCourseRepository.save(existingCourse);
            return "Course Updated";
        }
        else{
            return "Course doesn't found!";
        }
    }

    // Delete Course By I'd
    public String deleteCourseById(Long id) {
        iCourseRepository.deleteById(id);
        return "Course deleted";
    }
}

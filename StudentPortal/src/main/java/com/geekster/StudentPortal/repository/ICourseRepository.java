package com.geekster.StudentPortal.repository;

import com.geekster.StudentPortal.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICourseRepository extends JpaRepository<Course,Long> {
    Optional<Course> findByTitle(String title);
}

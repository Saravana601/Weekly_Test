package com.geekster.StudentPortal.repository;

import com.geekster.StudentPortal.model.Student;
import com.geekster.StudentPortal.model.enums.DepartmentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Student,Long> {
    Student findByName(String studentName);
}

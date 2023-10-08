package com.geekster.StudentPortal.service;

import com.geekster.StudentPortal.model.Student;
import com.geekster.StudentPortal.model.enums.DepartmentType;
import com.geekster.StudentPortal.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepository iStudentRepository;

    // Add student
    public String addStudent(Student student) {
        iStudentRepository.save(student);
        return "Student added";
    }

    // Get Student By Name
    public Student getStudentByName(String studentName) {
        return iStudentRepository.findByName(studentName);
    }

    // Get Student By I'd
    public Student getStudentById(Long id){
        return iStudentRepository.findById(id).orElseThrow();
    }

    // Get All Students
    public List<Student> getAllStudents() {
        return iStudentRepository.findAll();
    }

    public String updateStudentDepartmentById(Long id, DepartmentType department) {
        Student existingStudent = getStudentById(id);
        existingStudent.setDepartment(department);
        iStudentRepository.save(existingStudent);
        return "Student Info Updated";
    }


    // Delete Student By I'd
    public String deleteStudentById(Long id) {
        iStudentRepository.deleteById(id);
        return "Student deleted";
    }
}

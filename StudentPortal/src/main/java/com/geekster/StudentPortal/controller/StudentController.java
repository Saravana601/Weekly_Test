package com.geekster.StudentPortal.controller;

import com.geekster.StudentPortal.model.Student;
import com.geekster.StudentPortal.model.enums.DepartmentType;
import com.geekster.StudentPortal.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Validated
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addStudent(@RequestBody @Valid  Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("student")
    public Student getStudentByName(@RequestParam @Valid String studentName) {
        return studentService.getStudentByName(studentName);
    }

    @GetMapping("student/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @GetMapping("students")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }

    @PutMapping("student")
    public String updateStudentDepartmentById(@RequestParam Long id, @RequestParam DepartmentType department) {
        return studentService.updateStudentDepartmentById(id,department);
    }

    @DeleteMapping("student/{id}")
    public String deleteStudentById(@PathVariable Long id) {
        return studentService.deleteStudentById(id);
    }
}


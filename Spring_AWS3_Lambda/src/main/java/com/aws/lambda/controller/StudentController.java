package com.aws.lambda.controller;

import com.aws.lambda.dto.StudentDTO;
import com.aws.lambda.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lambda")
public class StudentController {

    @Autowired
    public StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentDTO> createStudent(StudentDTO studentDTO) {
        // Add business logic here to create a student
        studentService.addStudent(studentDTO);
        return new ResponseEntity<>(studentDTO, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<StudentDTO>> getAllStudents() {
        List<StudentDTO> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

}

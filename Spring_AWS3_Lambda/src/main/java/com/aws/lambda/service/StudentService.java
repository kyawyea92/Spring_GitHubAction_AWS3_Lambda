package com.aws.lambda.service;

import com.aws.lambda.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

  private static final List<StudentDTO> studentList = new ArrayList<>();

  public void addStudent(StudentDTO student) {
    studentList.add(student);
  }
  public List<StudentDTO> getAllStudents() {
    return studentList;
  }
}

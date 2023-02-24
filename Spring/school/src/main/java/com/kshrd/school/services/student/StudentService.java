package com.kshrd.school.services.student;

import com.kshrd.school.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<Student> retrieveStudents();

    Student save(Student student);
}

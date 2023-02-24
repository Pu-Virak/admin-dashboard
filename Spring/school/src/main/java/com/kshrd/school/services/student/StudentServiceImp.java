package com.kshrd.school.services.student;

import com.kshrd.school.model.Student;
import com.kshrd.school.repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class StudentServiceImp implements StudentService{

    private final StudentRepo _studentRepo;
    @Override
    public List<Student> retrieveStudents() {
        return _studentRepo.findAll();
    }

    @Override
    public Student save(Student student) {
        return _studentRepo.save(student);
    }

}

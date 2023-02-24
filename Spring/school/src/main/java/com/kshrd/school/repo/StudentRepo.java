package com.kshrd.school.repo;

import com.kshrd.school.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//@Mapper
public interface StudentRepo extends JpaRepository<Student, Long> {
//    @Select("SELECT * FROM STUDENT;")
//    List<Student> retrieveStudents();

    //Retrieve all students data
    List<Student> findAll();
    Student save(Student student);
}

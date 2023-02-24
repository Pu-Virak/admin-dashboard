package com.kshrd.school.controller.student;

import com.kshrd.school.model.Student;
import com.kshrd.school.services.student.StudentService;
import com.kshrd.school.utilities.Response;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/student")
public class StudentRestController {

    private final StudentService _studentService;

//    @Operation(operationId = "retrieveStudents", summary = "retrieveAllStudents", description = "Get all of the students")
    @GetMapping("/")
    public ResponseEntity<?> retrieveStudents() {
        List<Student> _students = _studentService.retrieveStudents();
        return ResponseEntity
                .ok(Response
                        .<List<Student>>ok()
                        .setCode(200)
                        .setMessage("Retrieve all student data successfully!")
                        .setRequestedTime(LocalDateTime
                                .now())
                        .setPayload(_students));
    }

    @PostMapping("/")
    public ResponseEntity<?> registerStudent() {
        Student _student = _studentService.save(new Student(1,
                "virak",
                "male",
                "22/03/2002",
                "0965558197",
                "YEAR1",
                "IT",
                "NIGHT",
                "01/01/2023",
                "phnom penh",
                "kompong cham"));
        return ResponseEntity
                .ok(Response
                        .<Student>ok()
                        .setCode(200)
                        .setMessage("Added student successfully!")
                        .setRequestedTime(LocalDateTime
                                .now())
                        .setPayload(_student));
    }

    @GetMapping("/abc")
    public String abc() {
        return "Hello";
    }
}

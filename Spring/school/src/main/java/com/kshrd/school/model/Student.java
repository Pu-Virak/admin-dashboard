package com.kshrd.school.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.EntityGraph;

/***********************************
 * Original Author: Det Virak
 * Created Date: 25/01/2023
 * Description: Student Class
 ***********************************/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String gender;
    private String dob;
    private String phone;
    private String year;
    private String skill;
    private String studyTime;
    private String doj;
    private String pob;
    private String cAddress;

}

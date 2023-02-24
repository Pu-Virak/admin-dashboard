package org.example.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "PARENT")
@NamedQueries({
        @NamedQuery(name = "ParentRes.findAll",
                query = "SELECT p FROM ParentRes p")
})
public class ParentRes {

    @Id
    @Column(name = "p_id", columnDefinition = "int")
    private Integer id;

    @Column(name = "p_name", columnDefinition = "char")
    private String name;

    @Column(name = "p_email", columnDefinition = "char")
    private String email;

    @Column(name = "p_phone", columnDefinition = "char")
    private String phone;

    @Column(name = "p_gender", columnDefinition = "char")
    private String gender;

    @Column(name = "p_dob", columnDefinition = "date")
    private Date dateOfBirth;

    @Column(name = "p_image_url", columnDefinition = "text")
    private String imageUrl;

    @Column(name = "p_address", columnDefinition = "char")
    private String address;

}

package com.geekster.StudentPortal.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.geekster.StudentPortal.model.enums.BranchType;
import com.geekster.StudentPortal.model.enums.DepartmentType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    private Integer age;

    @Size(min = 10,max = 12)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private BranchType branch;

    @Enumerated(EnumType.STRING)
    private DepartmentType department;

    // Uni directional
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    //Bi directional
    @ManyToMany
    private Set<Course> courses;
}

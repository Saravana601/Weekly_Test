package com.geekster.StudentPortal.model;

import com.geekster.StudentPortal.model.enums.BrandType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;

    @Enumerated(EnumType.STRING)
    private BrandType brand;

    private Double price;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
}

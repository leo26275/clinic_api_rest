package com.lgcodes.demo_one.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idPatient;

    @Column(length = 70, nullable = false)
    private String firsName;
    @Column(length = 70, nullable = false)
    private String lastName;
    @Column(length = 10, nullable = false)
    private String dui;
    @Column(length = 150, nullable = false)
    private String address;
    @Column(length = 10, nullable = false)
    private String phone;
    @Column(length = 50, nullable = false)
    private String email;
}

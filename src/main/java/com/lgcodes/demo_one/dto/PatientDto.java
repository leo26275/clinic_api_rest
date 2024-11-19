package com.lgcodes.demo_one.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.processing.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PatientDto {

    @EqualsAndHashCode.Include
    private Integer idPatient;
    @NotNull
    @Size(min = 3, message = "{firstName.size}")
    private String firstName;
    @NotNull
    @Size(min = 3, message = "{lastName.size}")
    private String lastName;
    private String dni;
    private String address;

    private String phone;

    @Email
    private String email;
}

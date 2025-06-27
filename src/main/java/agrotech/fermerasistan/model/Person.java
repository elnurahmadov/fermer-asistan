package agrotech.fermerasistan.model;

import agrotech.fermerasistan.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private UUID id;
    private String fin;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String address;
    private LocalDate birthDate;
    private Gender gender;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

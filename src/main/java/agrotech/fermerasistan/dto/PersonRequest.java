package agrotech.fermerasistan.dto;

import agrotech.fermerasistan.enums.Gender;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonRequest {
    @NotBlank(message = "Fin is mandatory")
    private String fin;

    @NotBlank(message = "Name is mandatory")
    @Size(max = 255)
    private String name;

    @NotBlank(message = "Surname is mandatory")
    @Size(max = 255)
    private String surname;

    @NotBlank(message = "Phone is mandatory")
    private String phone;

    @NotBlank(message = "Email is mandatory")
    private String email;

    private String address;

    private LocalDate birthDate;

    private Gender gender;
}

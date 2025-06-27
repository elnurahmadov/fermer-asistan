package agrotech.fermerasistan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Farmer {
    private UUID id;
    private UUID personId;
    private LocalDate registrationDate;
    private String farmerType;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

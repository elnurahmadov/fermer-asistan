package agrotech.fermerasistan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Farm {
    private UUID id;
    private UUID farmerId;
    private String name;
    private String type;
    private BigDecimal area;
    private String address;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

package driver_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Credential {
    private String certificationName;
    private String licenseNumber;
    private LocalDate issueDate;
    private LocalDate expirationDate;
    private String status;
}
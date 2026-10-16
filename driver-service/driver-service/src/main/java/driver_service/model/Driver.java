package driver_service.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "drivers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Driver {

    @Id
    private String id; 

    @NotBlank(message = "El nombre completo es obligatorio")
    private String fullName; 

    @NotBlank(message = "La categoría de licencia es obligatoria")
    private String licenseCategory; 

    @NotNull(message = "La calificación de seguridad es obligatoria")
    private Double safetyScore; 

    private String contractorCompany;
    private Boolean activeLicense = true;
    private String assignedVehicleId;

    private List<Credential> credentials = new ArrayList<>();
}
package driver_service.repository;

import driver_service.model.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface DriverRepository extends MongoRepository<Driver, String> {

    // Método clave para que el API Composite consulte por vehículo.
    // findFirst... evita error si por accidente hay 2 conductores con el mismo vehículo.
    Optional<Driver> findFirstByAssignedVehicleId(String vehicleId);
}
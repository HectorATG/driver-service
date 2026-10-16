package driver_service.service;

import driver_service.model.Driver;
import driver_service.repository.DriverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DriverService {

    private final DriverRepository driverRepository;

    public List<Driver> findAll() {
        return driverRepository.findAll();
    }

    public Optional<Driver> findById(String id) {
        return driverRepository.findById(id);
    }

    public Optional<Driver> findByVehicleId(String vehicleId) {
        return driverRepository.findFirstByAssignedVehicleId(vehicleId);
    }

    public Driver saveDriver(Driver driver) {
        if (driver.getId() == null || driver.getId().isBlank()) {
            driver.setId("drv-" + UUID.randomUUID().toString().substring(0, 5));
        }
        return driverRepository.save(driver);
    }
}
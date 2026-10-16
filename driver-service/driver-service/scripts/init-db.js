// Ejecutar con:  mongosh "mongodb://localhost:27017" scripts/init-db.js
use("drivers_db");

db.drivers.drop();
db.createCollection("drivers");

db.drivers.createIndex({ assignedVehicleId: 1 });

db.drivers.insertMany([
  {
    _id: "drv-001",
    fullName: "Carlos Ramírez López",
    licenseCategory: "E",
    safetyScore: 92.5,
    contractorCompany: "Transportes del Norte",
    activeLicense: true,
    assignedVehicleId: "veh-001",
    credentials: [
      {
        certificationName: "Manejo de materiales peligrosos",
        licenseNumber: "MP-2024-001",
        issueDate: new Date("2024-01-15"),
        expirationDate: new Date("2027-01-15"),
        status: "VIGENTE"
      }
    ],
    _class: "driver_service.model.Driver"
  },
  {
    _id: "drv-002",
    fullName: "María Fernanda Soto",
    licenseCategory: "C",
    safetyScore: 88.0,
    contractorCompany: "Logística Chihuahua",
    activeLicense: true,
    assignedVehicleId: "veh-002",
    credentials: [],
    _class: "driver_service.model.Driver"
  },
  {
    _id: "drv-003",
    fullName: "Jorge Luis Prieto",
    licenseCategory: "D",
    safetyScore: 75.0,
    contractorCompany: "Fletes Rápidos",
    activeLicense: false,
    assignedVehicleId: null,
    credentials: [],
    _class: "driver_service.model.Driver"
  }
]);

print("drivers_db lista. Conductores insertados: " + db.drivers.countDocuments());

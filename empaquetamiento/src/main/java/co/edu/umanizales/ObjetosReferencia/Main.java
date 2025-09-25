package co.edu.umanizales.ObjetosReferencia;

import co.edu.umanizales.ObjetosReferencia.model.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Vehicle
        Vehicle vehicle = new Vehicle("car", "Toyota", 2023);
        
        // Obtener los tipos de vehículos
        String[] vehicleTypes = Vehicle.getVehicleTypes();
        
        // Recorrer e imprimir los tipos de vehículos
        System.out.println("=== Tipos de Vehículos ===");
        for (String type : vehicleTypes) {
            System.out.println("- " + type);
        }
        
        // Mostrar información del vehículo actual
        System.out.println("\nInformación del vehículo:");
        System.out.println(vehicle);
        
        // Cambiar el tipo de vehículo usando el arreglo
        System.out.println("\nCambiando el tipo de vehículo...");
        vehicle.setType(vehicleTypes[1]); // Cambiar a motorcycle
        System.out.println("Nuevo tipo de vehículo: " + vehicle.getType());
    }
}

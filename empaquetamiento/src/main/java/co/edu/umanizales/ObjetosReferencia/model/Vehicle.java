package co.edu.umanizales.ObjetosReferencia.model;

public class Vehicle {
    // Atributos privados
    private String type;
    private String brand;
    private int year;
    
    // Arreglo privado con los tipos de vehículos
    private static final String[] VEHICLE_TYPES = {"vehicle", "motorcycle", "electric scooter"};

    // Constructor
    public Vehicle(String type, String brand, int year) {
        this.type = type;
        this.brand = brand;
        this.year = year;
    }

    // Getters y Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Método estático para obtener los tipos de vehículos
    public static String[] getVehicleTypes() {
        return VEHICLE_TYPES.clone(); // Devolvemos una copia para mantener el encapsulamiento
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}

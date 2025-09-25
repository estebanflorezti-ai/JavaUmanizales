package co.edu.umanizales.ObjetosReferencia.model;

/**
 * Clase que representa un color con un código y descripción.
 */
public class Color {
    private byte code;
    private String description;

    public Color() {
        // Constructor por defecto
    }

    public Color(byte code, String description) {
        this.code = code;
        this.description = description;
    }

    // Getters y Setters
    public byte getCode() {
        return code;
    }

    public void setCode(byte code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package co.edu.umanizales.ObjetosReferencia.model;

/**
 * Clase de ejemplo que demuestra la creación de instancias de Color.
 */
public class ColorExamples {
    public static void main(String[] args) {
        // Crear instancias de Color
        Color red = new Color((byte)1, "rojo");
        Color green = new Color((byte)2, "verde");
        Color blue = new Color((byte)3, "azul");

        // Mostrar información de los colores
        System.out.println("Color 1: Código=" + red.getCode() + ", Descripción=" + red.getDescription());
        System.out.println("Color 2: Código=" + green.getCode() + ", Descripción=" + green.getDescription());
        System.out.println("Color 3: Código=" + blue.getCode() + ", Descripción=" + blue.getDescription());


        Color colors[] = {red, green, blue};
        for (Color color : colors) {
            System.out.println("Color: Código=" + color.getCode() + ", Descripción=" + color.getDescription());
        }


        System.out.println(colors[0].getDescription());


        Color[] colores = new Color[4];

        colores[0] = red;
        colores[1] = green;
        colores[2] = blue;
        colores[3] = new Color();
        colores[3].setCode((byte)4);
        colores[3].setDescription("amarillo");
    }
}

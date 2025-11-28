package semana02;

public class Ejemplo{
    // Esto sería estilo estructurado
    public static void metodoEstructurado() {
        int edadMascota = 4;
        String nombreMascota = "Luna";
        System.out.println(nombreMascota + " tiene " + edadMascota + " años.");
    }

    // Esto sería estilo POO
    static class Mascota {
        String nombre;
        int edad;
    }

    public static void main(String[] args) {
        metodoEstructurado();

        Mascota m = new Mascota();
        m.nombre = "Toby";
        m.edad = 3;
        System.out.println(m.nombre + " tiene " + m.edad + " años.");
    }
}


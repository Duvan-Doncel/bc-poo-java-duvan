public class Dueño {

    // ===== Atributos (4 mínimo) =====
    private String nombre;
    private String teléfono;
    private String dirección;
    private int númeroMascotas;

    // ===== Constructor =====
    public Dueño(String nombre, String teléfono, String dirección) {
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.dirección = dirección;
        this.númeroMascotas = 0;  // empieza en 0
    }

    // ===== Métodos (3 mínimo) =====

    // Método void: mostrar información
    public void mostrarInformación() {
        System.out.println("=== INFORMACIÓN DEL DUEÑO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + teléfono);
        System.out.println("Dirección: " + dirección);
        System.out.println("Número de mascotas: " + númeroMascotas);
    }

    // Método funcional: registrar una mascota nueva
    public void agregarMascota() {
        númeroMascotas++;
    }

    // Método funcional: validar si es cliente frecuente
    public boolean esClienteFrecuente() {
        return númeroMascotas >= 3;
    }

    // ===== Getter =====
    public String getNombre() {
        return nombre;
    }
}

public class Mascota {

    // ===== Atributos (5 mínimos) =====
    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean vacunado;

    // ===== Constructor =====
    public Mascota(String nombre, String especie, int edad, double peso, boolean vacunado) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = vacunado;
    }

    // ===== Método void (imprime información) =====
    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DE LA MASCOTA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Vacunado: " + (vacunado ? "Sí" : "No"));
    }

    // ===== Método que retorna un valor calculado =====
    // Ejemplo: calcular la dosis de medicamento según el peso
    public double calcularDosisMedicamento() {
        return peso * 0.75; // fórmula simple: 0.75 ml por kg
    }

    // ===== Getter =====
    public String getNombre() {
        return nombre;
    }

    // ===== Setter =====
    public void setPeso(double peso) {
        this.peso = peso;
    }
}

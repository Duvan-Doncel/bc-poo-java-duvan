public class Main {
    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE CLÍNICA VETERINARIA \"CUIDADO ANIMAL\" ===\n");

        // ============================
        // CREAR DUEÑOS (2 objetos)
        // ============================
        Dueño dueño1 = new Dueño("Carlos Ramírez", "3104587621", "Calle 23 #10-45");
        Dueño dueño2 = new Dueño("Laura Peña", "3158742251", "Carrera 8 #14-20");

        // Registrar mascotas para probar funcionalidad
        dueño1.agregarMascota();
        dueño1.agregarMascota();
        dueño2.agregarMascota();

        System.out.println("--- DUEÑOS REGISTRADOS ---");
        dueño1.mostrarInformación();
        System.out.println();
        dueño2.mostrarInformación();

        System.out.println("\n¿Cliente frecuente dueño 1?: " + (dueño1.esClienteFrecuente() ? "Sí" : "No"));
        System.out.println("¿Cliente frecuente dueño 2?: " + (dueño2.esClienteFrecuente() ? "Sí" : "No"));


        // ============================
        // CREAR MASCOTAS (2 objetos)
        // ============================
        System.out.println("\n---------------------------------------");
        System.out.println("--- MASCOTAS INGRESADAS ---");

        Mascota mascota1 = new Mascota("Max", "Perro", 4, 12.5, true);
        Mascota mascota2 = new Mascota("Mishi", "Gato", 2, 4.8, false);

        mascota1.mostrarInformacion();
        System.out.println("\nDosis recomendada para " + mascota1.getNombre() + ": " + mascota1.calcularDosisMedicamento() + " ml");

        System.out.println("\n---------------------------------------");

        mascota2.mostrarInformacion();
        System.out.println("\nDosis recomendada para " + mascota2.getNombre() + ": " + mascota2.calcularDosisMedicamento() + " ml");


        // ============================
        // PROBAR SETTERS Y CAMBIOS
        // ============================
        System.out.println("\n--- ACTUALIZANDO PESOS ---");

        mascota1.setPeso(13.2);
        mascota2.setPeso(5.1);

        System.out.println("\nMascota 1 después del cambio:");
        mascota1.mostrarInformacion();

        System.out.println("\nMascota 2 después del cambio:");
        mascota2.mostrarInformacion();
    }
}

package semana04.docs;

public class VetConsultation {
    // Atributos
    String consultationNumber;
    String petName;
    String ownerName;
    
    // Constructor
    public VetConsultation(String consultationNumber, String petName, String ownerName) {
        this.consultationNumber = consultationNumber;
        this.petName = petName;
        this.ownerName = ownerName;
    }
    
    // Método para mostrar información
    public void showInfo() {
        System.out.println("Consulta No.: " + consultationNumber);
        System.out.println("Mascota: " + petName);
        System.out.println("Dueño: " + ownerName);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        // Creación de 5 objetos con datos diferentes
        VetConsultation c1 = new VetConsultation("VET-001", "Max", "Juan Pérez");
        VetConsultation c2 = new VetConsultation("VET-002", "Luna", "María García");
        VetConsultation c3 = new VetConsultation("VET-003", "Rocky", "Carlos López");
        VetConsultation c4 = new VetConsultation("VET-004", "Mia", "Laura Rodríguez");
        VetConsultation c5 = new VetConsultation("VET-005", "Toby", "Andrés Martínez");

        // Mostrar información de todas las consultas
        c1.showInfo();
        c2.showInfo();
        c3.showInfo();
        c4.showInfo();
        c5.showInfo();
    }
}

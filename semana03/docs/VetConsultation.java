package semana03.docs;

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
    }
}

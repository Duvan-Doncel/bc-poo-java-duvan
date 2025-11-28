### Actividad 3: Primera Clase Simple (Ejercicio 03)

**Instrucciones:**
Crea tu primera clase en Java llamada `VetConsultation` (Consulta Veterinaria) con:
- **3 atributos** (ej: `consultationNumber`, `petName`, `ownerName`)
- **1 constructor** que inicialice los atributos
- **1 método** que muestre la información de la consulta

**Código de ejemplo:**

```java
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
```
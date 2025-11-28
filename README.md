# Semana 01 - Introducción al Paradigma Orientado a Objetos

**Estudiante:** Duvan Santiago Doncel Barrero  
**Ficha:** 3228970A  
**Dominio Asignado:** Clínica Veterinaria "Cuidado Animal"

---

## 📋 Contexto del Dominio

**Tipo de Negocio:** Clínica Veterinaria  
**Nombre Comercial:** Cuidado Animal  
**Ubicación:** Bogotá, Engativá  
**Especialidad:** Consultas veterinarias, vacunación, cirugías, laboratorio clínico

### Descripción Breve
Cuidado Animal es una clínica veterinaria que ofrece servicios de consulta general, vacunación, cirugías, hospitalización y análisis de laboratorio para mascotas. Cuenta con 5 veterinarios especializados y atiende aproximadamente 100 mascotas semanales.

---

## 🎯 Objetivos de la Semana 01

Al finalizar esta semana, deberás ser capaz de:

1. Identificar objetos del mundo real en el contexto de una clínica veterinaria
2. Comprender las diferencias entre programación estructurada y POO
3. Reconocer los conceptos fundamentales: clase, objeto, atributo, método
4. Crear tu primera clase simple en Java aplicada al dominio

---

## 📝 Actividades Obligatorias

### Actividad 1: Identificación de Objetos (Ejercicio 01)

**Instrucciones:**
- Lee el material teórico de la semana sobre conceptos fundamentales de POO
- Identifica **5 objetos principales** que existen en una clínica veterinaria
- Para cada objeto, describe:
  - ¿Qué es? (definición)
  - ¿Qué características tiene? (atributos)
  - ¿Qué puede hacer? (comportamientos/métodos)

**Ejemplo:**
```
Objeto: Consulta Veterinaria
- ¿Qué es?: Una cita médica para atención de una mascota
- Características: número de consulta, mascota, dueño, veterinario, motivo, fecha
- Comportamientos: agendar consulta, registrar diagnóstico, prescribir tratamiento
```

**Entregable:** Documento con la identificación de 5 objetos del dominio de la clínica veterinaria.

---

### Actividad 2: Comparación de Paradigmas (Ejercicio 02)

**Instrucciones:**
- Investiga las diferencias entre programación estructurada y POO
- Escribe un ejemplo conceptual de cómo se manejaría la información de una consulta veterinaria en:
  1. **Programación estructurada** (usando variables sueltas y funciones)
  2. **Programación orientada a objetos** (usando una clase)

**Entregable:** Documento comparativo con ejemplos explicados.

---

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

**Instrucciones adicionales:**
1. Crea una clase `Main` con el método `main`
2. Instancia **3 objetos diferentes** de tipo `VetConsultation`
3. Llama al método `showInfo()` para cada objeto

**Entregable:** Archivo `VetConsultation.java` y `Main.java` funcionando correctamente.

---

### Actividad 4: Múltiples Objetos (Ejercicio 04)

**Instrucciones:**
Amplía el ejercicio anterior:
- Crea al menos **5 objetos** de tipo `VetConsultation` con datos diferentes
- Cada consulta debe tener información coherente con una clínica veterinaria real
- Muestra la información de todas las consultas

**Ejemplo de datos:**
- VET-001, Max, Juan Pérez
- VET-002, Luna, María García
- VET-003, Rocky, Carlos López
- VET-004, Mia, Laura Rodríguez
- VET-005, Toby, Andrés Martínez

**Entregable:** Código Java con 5 instancias de `VetConsultation` y su salida en consola.

---

## 🎓 Criterios de Evaluación

| Criterio | Peso | Descripción |
|----------|------|-------------|
| **Identificación de objetos** | 25% | Objetos identificados son relevantes al dominio de la clínica veterinaria |
| **Comprensión conceptual** | 25% | Demuestra entender diferencias entre paradigmas |
| **Implementación de clase** | 30% | Clase `VetConsultation` implementada correctamente con atributos, constructor y método |
| **Instanciación de objetos** | 20% | Crea múltiples objetos con datos coherentes |

---

## 📚 Recursos de Apoyo

### Material Teórico (Carpeta `1-teoria/`)
- `01-historia-evolucion-poo.md`
- `02-paradigmas-programacion.md`
- `03-conceptos-fundamentales-poo.md`
- `04-primer-programa-poo.md`

### Ejercicios Guiados (Carpeta `2-practica/`)
- `ejercicio-01-comparacion-paradigmas/`
- `ejercicio-02-primera-clase/`
- `ejercicio-03-multiples-objetos/`
- `ejercicio-04-modelado-mundo-real/`

### Glosario
Revisa el archivo `3-recursos/glosario.md` para términos clave de esta semana.

---

## 💡 Consejos

1. **No te compliques:** Esta semana es sobre conceptos básicos, no sobre código complejo
2. **Piensa en objetos reales:** Visualiza cómo funciona una clínica veterinaria real
3. **Pregunta:** Si tienes dudas sobre el dominio o los conceptos, consulta con el instructor
4. **Compila y prueba:** Asegúrate de que tu código compile antes de entregar

---

## 📅 Fecha de Entrega

**Entrega:** Según calendario definido por el instructor  
**Formato:** Código fuente (.java) y documentos en formato Markdown o PDF

---

**Nota Importante:** Este es tu dominio personal para todo el bootcamp. Todas las actividades futuras seguirán en el contexto de la clínica veterinaria Cuidado Animal. No compartas tu código directamente con otros estudiantes, ya que cada uno tiene un dominio diferente.
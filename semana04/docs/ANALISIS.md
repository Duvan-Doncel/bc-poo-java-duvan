## Descripción del código: Creación de múltiples objetos `VetConsultation`

Este programa amplía el ejercicio anterior, creando cinco objetos de la clase `VetConsultation`, cada uno representando una consulta diferente dentro de una clínica veterinaria.

### 1. Clase `VetConsultation`
La clase conserva su estructura original:
- **Tres atributos:** `consultationNumber`, `petName`, `ownerName`
- **Un constructor:** inicializa los atributos con los datos que recibe
- **Un método `showInfo()`:** imprime en pantalla la información de la consulta

### 2. Creación de objetos en `main()`
En el método `main`, se crean cinco objetos de tipo `VetConsultation`:

- `c1` representa la consulta VET-001 de la mascota Max y su dueño Juan Pérez  
- `c2` representa la consulta VET-002 de la mascota Luna y su dueña María García  
- `c3` representa la consulta VET-003 de Rocky y su dueño Carlos López  
- `c4` representa la consulta VET-004 de Mia y su dueña Laura Rodríguez  
- `c5` representa la consulta VET-005 de Toby y su dueño Andrés Martínez  

Cada uno de estos objetos guarda su propia información dentro de sus atributos.

### 3. Mostrar la información
Después de crear los objetos, se llama al método `showInfo()` de cada uno.  
Esto imprime en la consola los datos de todas las consultas de manera ordenada.

### Resumen
Este ejercicio demuestra:
- Cómo crear múltiples objetos a partir de una clase.
- Cómo cada objeto mantiene su propia información.
- Cómo usar métodos para mostrar datos en pantalla.
- El concepto básico de instancias en Programación Orientada a Objetos.

El programa es ideal para comprender cómo funciona la creación y uso de varios objetos dentro de una aplicación Java sencilla.

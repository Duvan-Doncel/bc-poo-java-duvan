# Sistema Veterinario – Proyecto en Java

## 1. Descripción del Proyecto
Este proyecto implementa un sistema básico orientado a objetos para una veterinaria.  
El objetivo es modelar la relación entre **dueños** y **mascotas**, permitiendo registrar su información y mostrarla en consola.

El sistema está desarrollado en Java y contiene tres clases principales:
- `Duenio`
- `Mascota`
- `Main` (punto de ejecución)

---

## 2. Estructura del Proyecto

```
src/
 ├── Duenio.java
 ├── Mascota.java
 └── Main.java
```

---

## 3. Resumen de lo que se hizo

### ● Clase `Duenio`
Se creó una clase que representa al dueño de una mascota.  
Contiene atributos básicos:
- nombre  
- teléfono  
- dirección  
- id  

Incluye métodos para:
- mostrar la información del dueño  
- actualizar su número de teléfono  
- convertir sus datos a texto con `toString()`  

### ● Clase `Mascota`
Se creó una clase que representa a una mascota registrada en la veterinaria.  
Incluye atributos como:
- nombre  
- tipo (perro, gato, etc.)  
- raza  
- edad  
- dueño (objeto de tipo `Duenio`)  

Incluye métodos para:
- mostrar la información completa de la mascota  
- asignar un dueño a la mascota (`setDuenio`)  
- obtener el dueño (`getDuenio`)  
- convertir sus datos a texto con `toString()`  

### ● Relación entre `Duenio` y `Mascota`
Se estableció una **asociación** donde:
- Una mascota tiene **un dueño**
- Un dueño puede tener **una o varias mascotas**

Esto permite que la mascota pueda acceder a los datos de su dueño y mostrarlos en consola.

### ● Clase `Main`
Se creó una clase donde se ejecuta el programa.  
En ella se:
1. Creó un objeto `Duenio`.
2. Creó un objeto `Mascota`.
3. Se conectó la mascota con su dueño usando `setDuenio()`.
4. Se mostraron en consola los datos completos de ambos objetos.

Esta clase demuestra cómo funcionan juntos los tres programas.

---

## 4. Ejecución del Programa

Para correr el proyecto en Visual Studio Code:

1. Instalar el **JDK 17** (recomendado).
2. Instalar en VS Code la extensión:
   - **Extension Pack for Java**
3. Abrir la carpeta del proyecto.
4. Ir a `Main.java`.
5. Dar clic en el botón **Run** sobre el método `main`.

---

## 5. Objetivo del Proyecto
El propósito del ejercicio es practicar:
- Programación orientada a objetos  
- Creación de clases  
- Uso de atributos y métodos  
- Relaciones entre objetos  
- Organización de un proyecto en Java  

---

## 6. Autor
Proyecto realizado como parte de una práctica de Programación Orientada a Objetos (POO).


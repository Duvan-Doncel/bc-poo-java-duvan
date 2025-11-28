## 1. Diferencias entre Programación Estructurada y Programación Orientada a Objetos (POO)

### Programación Estructurada

Es un estilo de programación donde:

- El programa se divide en funciones.
- Se usan variables sueltas.
- La lógica se ejecuta paso a paso.
- No existe el concepto de objetos ni clases.

Se enfoca en **cómo se hacen** las cosas paso por paso.

**Ventajas:**

- Fácil de entender para principiantes.
- Buena para programas pequeños.

**Desventajas:**

- Si el programa crece, se vuelve desordenado.
- Se repite mucho código.
- No organiza bien datos complejos.

---

### Programación Orientada a Objetos (POO)

Es un estilo de programación donde:

- Se crean clases (plantillas).
- A partir de ellas se generan objetos.
- Los datos y funciones se agrupan dentro de estas clases.

Se enfoca en **qué es cada cosa** del programa (mascota, dueño, consulta, veterinario, etc.).

**Ventajas:**

- Organiza mejor el código.
- Evita repetir información.
- Facilita el mantenimiento del programa.
- Los objetos representan cosas reales.

**Desventajas:**

- Requiere más práctica para dominarla.
- Puede ser más larga de usar para tareas pequeñas.


## Ejemplo conceptual de una consulta veterinaria

### 1. Programación Estructurada

En programación estructurada, la información se maneja mediante variables sueltas y funciones separadas.  
Todo está disperso y no existe un lugar que agrupe los datos.

**Ejemplo conceptual:**

- Se crean variables para guardar los datos de la mascota:
  - nombreMascota
  - edadMascota
  - tipoMascota

- Otras variables para el dueño:
  - nombreDueno
  - telefonoDueno

- Luego se crea una función para registrar la consulta:
  - registrarConsulta(nombreMascota, edadMascota, tipoMascota, nombreDueno, telefonoDueno)

La información está separada y depende de que el programador recuerde cada variable y el orden correcto de los datos.

---

### 2. Programación Orientada a Objetos (POO)

En la POO se agrupa la información dentro de clases que representan objetos del mundo real.  
Los datos y las acciones están organizados en un mismo lugar.

**Ejemplo conceptual:**

- Se crea una clase llamada "Mascota" con:
  - nombre
  - edad
  - tipo

- Otra clase llamada "Dueno" con:
  - nombre
  - telefono

- Luego una clase llamada "Consulta" que contiene:
  - mascota
  - dueno
  - fecha
  - motivo

La información está organizada en objetos, cada uno representando algo real dentro de la clínica veterinaria.  
Las clases permiten manejar todo de forma ordenada y reutilizable.

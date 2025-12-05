# Análisis Orientado a Objetos - Sistema Veterinario

## 1. Identificación del Dominio

**Nombre del negocio:** Veterinaria AnimalCare  
**Tipo:** Servicio veterinario  
**Descripción:**  
Sistema básico para administrar mascotas y sus dueños dentro de una clínica veterinaria.

---

## 2. Objetos Identificados

### Objeto Principal: Mascota

**¿Qué es?:**  
Representa a un animal registrado en la veterinaria.

**Atributos identificados:**
- nombre: String - Nombre de la mascota.
- tipo: String - Tipo de animal (perro, gato, etc.).
- raza: String - Raza específica.
- edad: int - Edad de la mascota.
- duenio: Duenio - Referencia al dueño de la mascota.

**Métodos identificados:**
- mostrarInfo(): Muestra toda la información de la mascota.
- setDuenio(): Asigna un dueño a la mascota.
- getDuenio(): Retorna el dueño asignado.
- toString(): Devuelve los datos como texto formateado.

---

### Objeto Secundario: Duenio

**¿Qué es?:**  
Representa a la persona propietaria de una mascota.

**Atributos identificados:**
- nombre: String - Nombre completo del dueño.
- telefono: String - Número de contacto.
- direccion: String - Dirección de residencia.
- id: int - Identificación única del dueño.

**Métodos identificados:**
- mostrarInfo(): Muestra toda la información del dueño.
- toString(): Devuelve los datos como texto.
- actualizarTelefono(): Cambia el número de contacto del dueño.

---

## 3. Relación entre Objetos

**Tipo de relación:** Asociación (1 dueño → muchas mascotas)

**Descripción:**  
Una mascota tiene un dueño asignado, mientras que un dueño puede tener varias mascotas.  
La mascota requiere conocer a su dueño para poder registrar y mostrar sus datos correctamente.

---

## 4. Justificación del Diseño

**¿Por qué elegí estos objetos?**  
Porque representan la esencia del sistema: la entidad principal (Mascota) y el cliente (Dueño).

**¿Por qué estos atributos son importantes?**
- Permiten registrar identidad básica de la mascota.
- Permiten almacenar información del dueño.
- Facilitan consultas dentro del sistema veterinario.
- La relación mascota–dueño es clave para la lógica del negocio.
- Permiten mantener la coherencia de datos.

**¿Por qué estos métodos son necesarios?**
- mostrarInfo(): Permite mostrar todos los datos sin esfuerzo.
- setDuenio(): Permite conectar correctamente los objetos.
- toString(): Facilita mostrar los datos en consola o reportes.
- actualizarTelefono(): Permite mantener la información actualizada.

---

## 5. Comparación: POO vs Programación Estructurada

### Sin POO (Programación estructurada):
- Datos regados en muchas variables sueltas.
- No existe forma clara de unir un dueño con una mascota.
- Difícil de mantener y ampliar.
- Lógica desorganizada en funciones separadas.

### Con POO (Programación Orientada a Objetos):
- La información está organizada en clases.
- La relación dueño–mascota es clara y directa.
- Es más fácil extender el sistema (vacunas, historial, citas).
- Mejor legibilidad y mantenimiento.

**Ventajas específicas en mi dominio:**
1. Reutilización de código.
2. Facilidad para ampliar el sistema en el futuro.
3. Relación clara entre entidades (Dueño ↔ Mascota).

---




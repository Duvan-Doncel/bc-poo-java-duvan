## Descripción del código `VetConsultation`

La clase `VetConsultation` representa una consulta veterinaria básica. Su propósito es almacenar y mostrar información relacionada con una consulta realizada para una mascota.

### 1. Atributos
La clase contiene tres atributos (variables internas) que guardan la información principal de la consulta:

- **consultationNumber**: número o código que identifica la consulta.
- **petName**: nombre de la mascota atendida.
- **ownerName**: nombre del dueño de la mascota.

Estos atributos permiten que cada objeto creado de esta clase tenga su propia información específica.

### 2. Constructor
La clase tiene un constructor que recibe tres parámetros:

- `String consultationNumber`
- `String petName`
- `String ownerName`

El constructor sirve para inicializar los valores de los atributos cuando se crea un objeto.  
De esta forma, al crear una nueva consulta, podemos asignar su número, el nombre de la mascota y el nombre del dueño.

### 3. Método `showInfo()`
Este método muestra en pantalla toda la información de la consulta.  
Imprime:

- El número de consulta
- El nombre de la mascota
- El nombre del dueño

Este método facilita visualizar los datos de forma ordenada cuando sea necesario.

### Resumen
La clase `VetConsultation` es un ejemplo básico de Programación Orientada a Objetos.  
Permite representar una consulta veterinaria como un **objeto**, agrupando sus datos y las acciones relacionadas dentro de una misma estructura.

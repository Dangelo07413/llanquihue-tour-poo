# LlanquihueTourApp - Semana 3

## 🎯 Objetivo de esta semana
El objetivo de esta actividad es implementar una jerarquía de herencia orientada a objetos para modelar los distintos servicios turísticos de la cuenca del Lago Llanquihue. Se busca aplicar conceptos de encapsulamiento, reutilización de código mediante la herencia, uso de constructores heredados con `super` y sobrescritura del método `toString()`.

# Llanquihue Tour App - Semana 7

## Descripción de lo desarrollado
En esta séptima semana, se implementó el principio de polimorfismo y el uso de colecciones genéricas en el sistema.
* Se ajustó la jerarquía de clases (`ServicioTuristico`, `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural`) sobrescribiendo el método `mostrarInformacion()` mediante la anotación `@Override`.
* Se creó la clase `GestorServicios` dentro del paquete `data`, la cual almacena dinámicamente los servicios en una colección de tipo `List<ServicioTuristico>`.
* Se implementó un recorrido polimórfico mediante un bucle *for-each* para desplegar la información específica de cada servicio por consola sin necesidad de utilizar `instanceof`.

## Estructura del Proyecto
* **`src/model`**: Clases de la jerarquía de servicios turísticos.
* **`src/data`**: Clases de gestión de datos y colecciones (`GestorServicios`).
* **`src/ui`**: Clase de interfaz de usuario (`Main`).

## Instrucciones para compilar y ejecutar
1. Asegúrate de tener instalado **Java 23** (o superior).
2. Clona este repositorio en tu máquina local.
3. Abre el proyecto en tu IDE preferido (se recomienda IntelliJ IDEA).
4. Dirígete a la ruta `src/ui/Main.java`.
5. Ejecuta el archivo presionando el botón **Run** (icono verde de reproducción) en tu IDE o mediante la consola con los comandos:
   ```bash
   javac src/ui/Main.java -d out/
   java -cp out ui.Main
   ```
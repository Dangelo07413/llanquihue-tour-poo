# LlanquihueTourApp - Semana 3

## 🎯 Objetivo de esta semana
El objetivo de esta actividad es implementar una jerarquía de herencia orientada a objetos para modelar los distintos servicios turísticos de la cuenca del Lago Llanquihue. Se busca aplicar conceptos de encapsulamiento, reutilización de código mediante la herencia, uso de constructores heredados con `super` y sobrescritura del método `toString()`.

## 📂 Clases Creadas
El proyecto se organizó de manera lógica y modular en los siguientes paquetes:

*   **`model/`** (Modelado del negocio):
    *   `ServicioTuristico`: Superclase base con atributos comunes (`nombre`, `duracionHoras`).
    *   `RutaGastronomica`: Subclase con el atributo específico `numeroDeParadas`.
    *   `PaseoLacustre`: Subclase con el atributo específico `tipoEmbarcacion`.
    *   `ExcursionCultural`: Subclase con el atributo específico `lugarHistorico`.
*   **`data/`** (Persistencia y simulación de datos):
    *   `GestorServicios`: Clase encargada de instanciar y proveer los objetos de prueba del catálogo de turismo.
*   **`ui/`** (Capa de usuario):
    *   `Main`: Clase principal que ejecuta el programa y renderiza los datos en la consola.

## 🚀 Instrucciones para ejecutar Main

### Requisitos previos
*   Tener instalado el **JDK 11** o superior.
*   Un IDE compatible (IntelliJ IDEA, Eclipse, NetBeans) o la terminal del sistema.

### Ejecución desde IDE
1.  Importa el proyecto `LlanquihueTourApp` en tu entorno de desarrollo.
2.  Navega hasta la ruta `src/ui/Main.java`.
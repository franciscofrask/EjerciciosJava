TPColecciones - Ejercicios de Java con Colecciones
========================================

Este proyecto contiene tres ejercicios prácticos que demuestran el uso de colecciones en Java, 
organizados con la estructura Maven estándar.

## Estructura del Proyecto Maven
```
TPColecciones/
├── pom.xml
├── src/
│   └── main/
│       └── java/
│           ├── ejercicio1_stock/
│           ├── ejercicio2_biblioteca/
│           └── ejercicio3_universidad/
├── Ejercicio1_Stock/ (archivos antiguos)
├── Ejercicio2_Biblioteca/ (archivos antiguos)
├── Ejercicio3_Universidad/ (archivos antiguos)
└── README.txt
```

## Ejercicio 1: Sistema de Stock (package ejercicio1_stock)
**Ubicación:** `src/main/java/ejercicio1_stock/`
- **CategoriaProducto.java**: Enum con las categorías de productos
- **Producto.java**: Clase que representa un producto con sus atributos
- **Inventario.java**: Clase que maneja la colección de productos
- **MainStock.java**: Clase principal para probar el sistema

Funcionalidades:
- Agregar, eliminar y buscar productos
- Filtrar por categoría y precio
- Actualizar stock
- Obtener estadísticas del inventario

## Ejercicio 2: Sistema de Biblioteca (package ejercicio2_biblioteca)
**Ubicación:** `src/main/java/ejercicio2_biblioteca/`
- **Autor.java**: Clase que representa un autor
- **Libro.java**: Clase que representa un libro
- **Biblioteca.java**: Clase que maneja la colección de libros
- **MainBiblioteca.java**: Clase principal para probar el sistema

Funcionalidades:
- Agregar, eliminar y buscar libros
- Filtrar libros por año
- Mostrar autores disponibles
- Gestionar el catálogo de la biblioteca

## Ejercicio 3: Sistema Universitario (package ejercicio3_universidad)
**Ubicación:** `src/main/java/ejercicio3_universidad/`
- **Profesor.java**: Clase que representa un profesor
- **Curso.java**: Clase que representa un curso
- **Universidad.java**: Clase que maneja profesores y cursos
- **MainUniversidad.java**: Clase principal para probar el sistema

Funcionalidades:
- Gestionar profesores y cursos
- Asignar profesores a cursos
- Eliminar cursos y profesores (con validaciones)
- Generar reportes de asignaciones

## Compilación y Ejecución con Maven

### Compilar todo el proyecto:
```bash
mvn compile
```

### Ejecutar ejercicios específicos:
```bash
# Ejercicio 1 - Stock
mvn exec:java -Dexec.mainClass="ejercicio1_stock.MainStock"

# Ejercicio 2 - Biblioteca  
mvn exec:java -Dexec.mainClass="ejercicio2_biblioteca.MainBiblioteca"

# Ejercicio 3 - Universidad
mvn exec:java -Dexec.mainClass="ejercicio3_universidad.MainUniversidad"
```

### Limpiar y compilar:
```bash
mvn clean compile
```

## Conceptos Aplicados
- Estructura Maven estándar
- Packages Java correctamente organizados
- Colecciones Java (ArrayList, List)
- Enums
- Relaciones entre objetos
- Métodos de búsqueda y filtrado
- Gestión de referencias bidireccionales (Profesor-Curso)
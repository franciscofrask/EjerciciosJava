TPHerencias - Ejercicios de Java con Herencia y Polimorfismo
========================================

Este proyecto contiene cuatro katas prácticos que demuestran el uso de herencia y polimorfismo en Java, 
organizados con la estructura Maven estándar.

## Estructura del Proyecto Maven
```
TPHerencias/
├── pom.xml
├── src/
│   └── main/
│       └── java/
│           ├── kata1_vehiculos/
│           ├── kata2_figuras/
│           ├── kata3_empleados/
│           └── kata4_animales/
└── README.txt
```

## Kata 1: Sistema de Vehículos (package kata1_vehiculos)
**Ubicación:** `src/main/java/kata1_vehiculos/`
- **Vehiculo.java**: Clase base con atributos protegidos
- **Auto.java**: Clase derivada que extiende Vehiculo
- **MainKata1.java**: Clase principal para probar herencia básica

**Conceptos aplicados:**
- Herencia básica (extends)
- Atributos protegidos (protected)
- Override de métodos
- Constructor con super()

## Kata 2: Sistema de Figuras Geométricas (package kata2_figuras)
**Ubicación:** `src/main/java/kata2_figuras/`
- **Figura.java**: Clase abstracta base
- **Circulo.java**: Implementación concreta de figura
- **Rectangulo.java**: Implementación concreta de figura
- **MainKata2.java**: Demostración de polimorfismo con arrays

**Conceptos aplicados:**
- Clases abstractas
- Métodos abstractos
- Polimorfismo con arrays
- Override de toString()

## Kata 3: Sistema de Empleados (package kata3_empleados)
**Ubicación:** `src/main/java/kata3_empleados/`
- **Empleado.java**: Clase abstracta base
- **EmpleadoPlanta.java**: Empleado con sueldo fijo y antigüedad
- **EmpleadoTemporal.java**: Empleado con pago por horas
- **MainKata3.java**: Polimorfismo con ArrayList e instanceof

**Conceptos aplicados:**
- Herencia con clases abstractas
- Polimorfismo en colecciones (ArrayList)
- Operador instanceof
- Métodos abstractos para cálculos específicos

## Kata 4: Sistema de Animales (package kata4_animales)
**Ubicación:** `src/main/java/kata4_animales/`
- **Animal.java**: Clase base concreta
- **Perro.java**: Animal específico con sonido propio
- **Gato.java**: Animal específico con sonido propio
- **Vaca.java**: Animal específico con sonido propio
- **MainKata4.java**: Polimorfismo de métodos

**Conceptos aplicados:**
- Herencia de clase concreta (no abstracta)
- Override de métodos específicos
- Polimorfismo de comportamiento
- Colecciones polimórficas

## Compilación y Ejecución con Maven

### Compilar todo el proyecto:
```bash
mvn compile
```

### Ejecutar cada kata:
```bash
# Kata 1 - Vehículos
mvn exec:java -Dexec.mainClass="kata1_vehiculos.MainKata1"

# Kata 2 - Figuras  
mvn exec:java -Dexec.mainClass="kata2_figuras.MainKata2"

# Kata 3 - Empleados
mvn exec:java -Dexec.mainClass="kata3_empleados.MainKata3"

# Kata 4 - Animales
mvn exec:java -Dexec.mainClass="kata4_animales.MainKata4"
```

### Limpiar y compilar:
```bash
mvn clean compile
```

## Conceptos de Programación Orientada a Objetos Aplicados

### Herencia
- **Simple**: Una clase deriva de otra (extends)
- **Protegida**: Atributos protected accesibles en subclases
- **Constructor**: Uso de super() para llamar constructor padre

### Polimorfismo
- **Sobrescritura**: Override de métodos (@Override)
- **Dinámico**: Resolución en tiempo de ejecución
- **Colecciones**: Arrays y ArrayList polimórficos

### Abstracción
- **Clases abstractas**: No pueden instanciarse
- **Métodos abstractos**: Deben implementarse en subclases
- **Contratos**: Definición de interfaz común

### Encapsulación
- **Private**: Campos privados con getters/setters
- **Protected**: Acceso desde subclases
- **Public**: Interfaz pública de las clases

Cada kata progresa en complejidad, desde herencia básica hasta polimorfismo avanzado con colecciones y operadores instanceof.
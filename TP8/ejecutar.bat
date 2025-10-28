@echo off
echo ========================================
echo    TP8 - INTERFACES Y EXCEPCIONES
echo ========================================
echo.
echo Seleccione que parte del proyecto ejecutar:
echo.
echo 1. Parte 1 - Sistema E-Commerce (Interfaces)
echo 2. Parte 2 - Manejo de Excepciones
echo 3. Compilar proyecto
echo 4. Ejecutar ambas partes
echo.
set /p opcion="Ingrese su opcion (1-4): "

cd /d "c:\Users\Francisco\Documents\NetBeansProjects\TP8"

if "%opcion%"=="1" (
    echo.
    echo Ejecutando Parte 1 - Sistema E-Commerce...
    echo ==========================================
    javac -d target\classes src\main\java\tp8\interfaz\*.java src\main\java\tp8\excepcion\*.java
    java -cp "target\classes" main.java.tp8.interfaz.MainParte1
) else if "%opcion%"=="2" (
    echo.
    echo Ejecutando Parte 2 - Manejo de Excepciones...
    echo ============================================
    javac -d target\classes src\main\java\tp8\interfaz\*.java src\main\java\tp8\excepcion\*.java
    java -cp "target\classes" main.java.tp8.excepcion.MainParte2
) else if "%opcion%"=="3" (
    echo.
    echo Compilando proyecto...
    echo ======================
    javac -d target\classes src\main\java\tp8\interfaz\*.java src\main\java\tp8\excepcion\*.java
    echo.
    echo Compilacion completada. Ejecute nuevamente para correr los ejemplos.
) else if "%opcion%"=="4" (
    echo.
    echo Ejecutando ambas partes del proyecto...
    echo =====================================
    javac -d target\classes src\main\java\tp8\interfaz\*.java src\main\java\tp8\excepcion\*.java
    echo.
    echo --- PARTE 1: INTERFACES ---
    java -cp "target\classes" main.java.tp8.interfaz.MainParte1
    echo.
    echo.
    echo --- PARTE 2: EXCEPCIONES ---
    java -cp "target\classes" main.java.tp8.excepcion.MainParte2
) else (
    echo.
    echo Opcion no valida. Intente nuevamente.
)

echo.
pause
package com.esports;

/**
 * @file Main.java
 * @brief Punto de entrada para ejecutar el sistema de gestión de torneos de eSports.
 *
 * Este archivo contiene el método main para iniciar la aplicación.
 *
 * @author Sebastián
 * @date 25/04/2025
 */
public class Main {
    /**
     * @brief Método principal para ejecutar el sistema.
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Ejemplo básico de uso
        System.out.println("Bienvenido al sistema de gestión de torneos de eSports");
        Torneo torneo = new Torneo("Torneo de Prueba");
        System.out.println("Torneo creado: " + torneo.getNombre());
    }
}
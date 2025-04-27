package com.esports;

/**
 * @class Equipo
 * @brief Clase que representa un equipo participante en torneos de eSports.
 *
 * Un equipo tiene un nombre, una descripción y acumula puntos durante los torneos.
 *
 * @author Sebastián
 * @date 25/04/2025
 */
public class Equipo {
    private String nombre; ///< Nombre del equipo.
    private String descripcion; ///< Breve descripción del equipo.
    private int puntosTotales; ///< Puntos acumulados por el equipo.

    /**
     * @brief Constructor de la clase Equipo.
     * @param nombre El nombre del equipo.
     * @param descripcion Una breve descripción del equipo.
     */
    public Equipo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.puntosTotales = 0; // Inicializamos los puntos en 0
    }

    /**
     * @brief Inscribir el equipo en un torneo.
     * @param torneo El torneo en el que se inscribe el equipo.
     */
    public void inscribirEnTorneo(Torneo torneo) {
        // Prototipo: Inscribir el equipo en un torneo
    }

    /**
     * @brief Obtiene el nombre del equipo.
     * @return El nombre del equipo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @brief Obtiene la descripción del equipo.
     * @return La descripción del equipo.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @brief Obtiene los puntos totales acumulados por el equipo.
     * @return Los puntos totales del equipo.
     */
    public int getPuntosTotales() {
        return puntosTotales;
    }

    /**
     * @brief Actualiza los puntos totales del equipo.
     * @param puntosTotales Los nuevos puntos totales del equipo.
     */
    public void setPuntosTotales(int puntosTotales) {
        this.puntosTotales = puntosTotales;
    }
}
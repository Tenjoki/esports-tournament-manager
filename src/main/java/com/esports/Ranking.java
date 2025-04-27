package com.esports;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @class Ranking
 * @brief Clase que representa el ranking generado al final de un torneo.
 *
 * El ranking asocia equipos con sus posiciones basadas en los puntos acumulados.
 *
 * @author Sebastián
 * @date 25/04/2025
 */
public class Ranking {
    private Map<Equipo, Integer> posicion; ///< Mapa que asocia equipos con su posición en el ranking.

    /**
     * @brief Constructor de la clase Ranking.
     */
    public Ranking() {
        this.posicion = new HashMap<>();
    }

    /**
     * @brief Calcula el ranking basado en los puntos acumulados por los equipos.
     * @param equipos La lista de equipos participantes.
     */
    public void calcularRanking(List<Equipo> equipos) {
        // Prototipo: Calcular el ranking basado en los puntos de los equipos
    }

    /**
     * @brief Muestra el ranking en consola o interfaz.
     */
    public void mostrarRanking() {
        // Prototipo: Mostrar el ranking en consola o interfaz
    }

    /**
     * @brief Obtiene el mapa de posiciones del ranking.
     * @return El mapa que asocia equipos con sus posiciones.
     */
    public Map<Equipo, Integer> getPosicion() {
        return posicion;
    }
}
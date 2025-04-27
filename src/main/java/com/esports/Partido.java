package com.esports;

/**
 * @class Partido
 * @brief Clase que representa un partido entre dos equipos dentro de un torneo.
 *
 * Un partido registra resultados y asigna puntos automáticamente a los equipos involucrados.
 *
 * @author Sebastián
 * @date 25/04/2025
 */
public class Partido {
    private Equipo equipo1; ///< El primer equipo participante.
    private Equipo equipo2; ///< El segundo equipo participante.
    private int resultadoEquipo1; ///< Resultado del primer equipo.
    private int resultadoEquipo2; ///< Resultado del segundo equipo.

    /**
     * @brief Constructor de la clase Partido.
     * @param equipo1 El primer equipo participante.
     * @param equipo2 El segundo equipo participante.
     */
    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultadoEquipo1 = 0;
        this.resultadoEquipo2 = 0;
    }

    /**
     * @brief Registra el resultado oficial del partido.
     * @param resultadoEquipo1 El resultado del primer equipo.
     * @param resultadoEquipo2 El resultado del segundo equipo.
     */
    public void registrarResultado(int resultadoEquipo1, int resultadoEquipo2) {
        this.resultadoEquipo1 = resultadoEquipo1;
        this.resultadoEquipo2 = resultadoEquipo2;
    }

    /**
     * @brief Asigna puntos automáticamente basados en el resultado del partido.
     */
    public void asignarPuntos() {
        if (resultadoEquipo1 > resultadoEquipo2) {
            // Equipo 1 gana
            equipo1.setPuntosTotales(equipo1.getPuntosTotales() + 3);
        } else if (resultadoEquipo1 < resultadoEquipo2) {
            // Equipo 2 gana
            equipo2.setPuntosTotales(equipo2.getPuntosTotales() + 3);
        } else {
            // Empate
            equipo1.setPuntosTotales(equipo1.getPuntosTotales() + 1);
            equipo2.setPuntosTotales(equipo2.getPuntosTotales() + 1);
        }
    }

    /**
     * @brief Obtiene el primer equipo participante.
     * @return El primer equipo.
     */
    public Equipo getEquipo1() {
        return equipo1;
    }

    /**
     * @brief Obtiene el segundo equipo participante.
     * @return El segundo equipo.
     */
    public Equipo getEquipo2() {
        return equipo2;
    }

    /**
     * @brief Obtiene el resultado del primer equipo.
     * @return El resultado del primer equipo.
     */
    public int getResultadoEquipo1() {
        return resultadoEquipo1;
    }

    /**
     * @brief Obtiene el resultado del segundo equipo.
     * @return El resultado del segundo equipo.
     */
    public int getResultadoEquipo2() {
        return resultadoEquipo2;
    }
}
package com.esports;

public interface TorneoRepository {
    /**
     * Obtiene un torneo por su nombre desde la base de datos.
     * @param nombre El nombre del torneo.
     * @return El torneo encontrado, o null si no existe.
     */
    Torneo obtenerTorneoPorNombre(String nombre);
}
package com.esports;

public class TorneoService {
    private TorneoRepository torneoRepository;

    public TorneoService(TorneoRepository torneoRepository) {
        this.torneoRepository = torneoRepository;
    }

    /**
     * Obtiene un torneo por su nombre. Si no existe, lanza una excepción.
     * @param nombre El nombre del torneo.
     * @return El torneo encontrado.
     * @throws IllegalArgumentException Si el torneo no existe.
     */
    public Torneo obtenerTorneo(String nombre) {
        Torneo torneo = torneoRepository.obtenerTorneoPorNombre(nombre);
        if (torneo == null) {
            throw new IllegalArgumentException("El torneo '" + nombre + "' no existe.");
        }
        return torneo;
    }
}
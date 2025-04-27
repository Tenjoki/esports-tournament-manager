package com.esports;

import java.util.ArrayList;
import java.util.List;

/**
 * @class Torneo
 * @brief Clase que representa un torneo de eSports.
 */
public class Torneo {
    private String nombre;
    private String estado;
    private List<Equipo> equiposInscritos;
    private List<Partido> partidos;

    /**
     * Constructor de la clase Torneo.
     * @param nombre El nombre del torneo.
     */
    public Torneo(String nombre) {
        this.nombre = nombre;
        this.estado = "Abierto"; // Estado inicial
        this.equiposInscritos = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }

    /**
     * Obtiene el nombre del torneo.
     * @return El nombre del torneo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cierra las inscripciones y cambia el estado del torneo a "En curso".
     */
    public void cerrarInscripciones() {
        if ("Abierto".equals(this.estado)) {
            this.estado = "En curso";
        } else {
            throw new IllegalStateException("No se pueden cerrar inscripciones si el torneo no está abierto.");
        }
    }

    /**
     * Finaliza el torneo y cambia el estado a "Finalizado".
     */
    public void finalizarTorneo() {
        if ("En curso".equals(this.estado)) {
            this.estado = "Finalizado";
        } else {
            throw new IllegalStateException("El torneo debe estar en curso para poder finalizarse.");
        }
    }

    /**
     * Obtiene el estado actual del torneo.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Obtiene la lista de equipos inscritos en el torneo.
     */
    public List<Equipo> getEquiposInscritos() {
        return equiposInscritos;
    }

    /**
     * Obtiene la lista de partidos programados en el torneo.
     */
    public List<Partido> getPartidos() {
        return partidos;
    }
}
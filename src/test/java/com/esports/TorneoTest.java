package com.esports;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TorneoTest {

    @Test
    public void testCerrarInscripciones() {
        // Arrange
        Torneo torneo = new Torneo("Torneo de Prueba");

        // Act
        torneo.cerrarInscripciones();

        // Assert
        assertEquals("En curso", torneo.getEstado(), "El estado del torneo debe ser 'En curso' " +
                "después de cerrar inscripciones.");
    }

    @Test
    public void testFinalizarTorneo() {
        // Arrange
        Torneo torneo = new Torneo("Torneo de Prueba");
        torneo.cerrarInscripciones();

        // Act
        torneo.finalizarTorneo();

        // Assert
        assertEquals("Finalizado", torneo.getEstado(), "El estado del torneo debe ser 'Finalizado' " +
                "después de finalizar el torneo.");
    }
}
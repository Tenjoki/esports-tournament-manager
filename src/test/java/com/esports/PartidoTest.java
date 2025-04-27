package com.esports;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PartidoTest {

    @Test
    public void testAsignarPuntosGanadorEquipo1() {
        // Arrange
        Equipo equipo1 = new Equipo("Equipo A", "Descripción A");
        Equipo equipo2 = new Equipo("Equipo B", "Descripción B");
        Partido partido = new Partido(equipo1, equipo2);

        // Act
        partido.registrarResultado(3, 1); // Equipo 1 gana
        partido.asignarPuntos();

        // Assert
        assertEquals(3, equipo1.getPuntosTotales(), "El equipo ganador debe tener 3 puntos.");
        assertEquals(0, equipo2.getPuntosTotales(), "El equipo perdedor no debe tener puntos.");
    }

    @Test
    public void testAsignarPuntosEmpate() {
        // Arrange
        Equipo equipo1 = new Equipo("Equipo A", "Descripción A");
        Equipo equipo2 = new Equipo("Equipo B", "Descripción B");
        Partido partido = new Partido(equipo1, equipo2);

        // Act
        partido.registrarResultado(2, 2); // Empate
        partido.asignarPuntos();

        // Assert
        assertEquals(1, equipo1.getPuntosTotales(), "Ambos equipos deben tener 1 punto en caso de empate.");
        assertEquals(1, equipo2.getPuntosTotales(), "Ambos equipos deben tener 1 punto en caso de empate.");
    }

    @Test
    public void testAsignarPuntosGanadorEquipo2() {
        // Arrange
        Equipo equipo1 = new Equipo("Equipo A", "Descripción A");
        Equipo equipo2 = new Equipo("Equipo B", "Descripción B");
        Partido partido = new Partido(equipo1, equipo2);

        // Act
        partido.registrarResultado(1, 3); // Equipo 2 gana
        partido.asignarPuntos();

        // Assert
        assertEquals(0, equipo1.getPuntosTotales(), "El equipo perdedor no debe tener puntos.");
        assertEquals(3, equipo2.getPuntosTotales(), "El equipo ganador debe tener 3 puntos.");
    }
}
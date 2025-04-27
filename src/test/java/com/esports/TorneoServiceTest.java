package com.esports;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TorneoServiceTest {

    @Mock
    private TorneoRepository torneoRepository; // Mock del repositorio

    private TorneoService torneoService; // Servicio que vamos a probar

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this); // Inicializa los mocks
        torneoService = new TorneoService(torneoRepository); // Inyecta el mock
    }

    @Test
    public void testObtenerTorneo_Existente() {
        // Arrange
        Torneo torneoMock = new Torneo("Torneo de Prueba");
        when(torneoRepository.obtenerTorneoPorNombre("Torneo de Prueba")).thenReturn(torneoMock);

        // Act
        Torneo torneo = torneoService.obtenerTorneo("Torneo de Prueba");

        // Assert
        assertNotNull(torneo, "El torneo no debe ser nulo.");
        assertEquals("Torneo de Prueba", torneo.getNombre(), "El nombre del torneo debe coincidir.");
        verify(torneoRepository, times(1)).obtenerTorneoPorNombre("Torneo de Prueba"); // Verifica la interacción
    }

    @Test
    public void testObtenerTorneo_NoExistente() {
        // Arrange
        when(torneoRepository.obtenerTorneoPorNombre("Torneo Inexistente")).thenReturn(null);

        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            torneoService.obtenerTorneo("Torneo Inexistente");
        });
        assertEquals("El torneo 'Torneo Inexistente' no existe.", exception.getMessage());
        verify(torneoRepository, times(1)).obtenerTorneoPorNombre("Torneo Inexistente"); // Verifica la interacción
    }
}
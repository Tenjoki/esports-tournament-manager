package com.esports;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class TorneoSteps {

    private TorneoRepository torneoRepository = mock(TorneoRepository.class);
    private TorneoService torneoService = new TorneoService(torneoRepository);
    private Torneo torneoObtenido;
    private Exception exceptionLanzada;

    @Given("Existe un torneo llamado {string}")
    public void existe_un_torneo_llamado(String nombreTorneo) {
        Torneo torneo = new Torneo(nombreTorneo);
        when(torneoRepository.obtenerTorneoPorNombre(nombreTorneo)).thenReturn(torneo);
    }

    @Given("No existe un torneo llamado {string}")
    public void no_existe_un_torneo_llamado(String nombreTorneo) {
        when(torneoRepository.obtenerTorneoPorNombre(nombreTorneo)).thenReturn(null);
    }

    @When("Solicito el torneo {string}")
    public void solicito_el_torneo(String nombreTorneo) {
        try {
            torneoObtenido = torneoService.obtenerTorneo(nombreTorneo);
        } catch (Exception e) {
            exceptionLanzada = e;
        }
    }

    @Then("Recibo el torneo con nombre {string}")
    public void recibo_el_torneo_con_nombre(String nombreTorneo) {
        assertNotNull(torneoObtenido);
        assertEquals(nombreTorneo, torneoObtenido.getNombre());
    }

    @Then("Se lanza una excepción indicando que el torneo no existe")
    public void se_lanza_una_excepcion_indicando_que_el_torneo_no_existe() {
        assertNotNull(exceptionLanzada);
        assertEquals(IllegalArgumentException.class, exceptionLanzada.getClass());
        assertEquals("El torneo 'Torneo Inexistente' no existe.", exceptionLanzada.getMessage());
    }
}
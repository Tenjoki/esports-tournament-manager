Feature: Obtener un torneo desde el repositorio

  Scenario: Obtener un torneo existente
    Given Existe un torneo llamado "Torneo de Prueba"
    When Solicito el torneo "Torneo de Prueba"
    Then Recibo el torneo con nombre "Torneo de Prueba"

  Scenario: Intentar obtener un torneo inexistente
    Given No existe un torneo llamado "Torneo Inexistente"
    When Solicito el torneo "Torneo Inexistente"
    Then Se lanza una excepción indicando que el torneo no existe
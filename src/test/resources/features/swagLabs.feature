Feature: SwagLabs

  @LoginSwagLabs
  Scenario: Logueo de usuario exitoso
    Given estoy en el login
    And tipeo el usuario "standard_user"
    And ingreso la clave "secret_sauce"
    When clic en LOGIN
    Then valido que aparezca el texto "PRODUCTOS"
    And que tenga mínimo un item
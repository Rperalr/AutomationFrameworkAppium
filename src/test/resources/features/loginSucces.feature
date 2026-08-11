Feature: Login en aplicación móvil

  Background:
    Given que la aplicación móvil está abierta

  @loginSucces
  Scenario Outline: Login exitoso en la aplicación
    When login Succes usuario "<usuario>" y password "<password>"

    Examples:
      | usuario | password |
      | qa      | 1234AUT  |
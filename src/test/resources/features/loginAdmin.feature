Feature: Login en aplicación móvil

  Background:
    Given que la aplicación móvil está abierta

  @loginAdmin
  Scenario Outline: Login exitoso en la aplicación
    When ingreso el usuario "<usuario>"
    And ingreso el password "<password>"
    And doy clic en el botón login
    Then el login se ejecuta correctamenteen boton inicio sesion
    Then validar label de la cuenta
    Then cerrar app sesion

    Examples:
      | usuario | password   |
      | QA      | Automation |


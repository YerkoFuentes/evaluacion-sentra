Feature: Ver lista de tareas

    Como usuario de sentra Tasks
    deseo ver una lista de todas las tareas asociadas a mi cuenta
    para tener una visión general de mis actividades pendientes

    Background:
    Given Me encuentro en Sentra Tasks
    When Ingreso mis credenciales "asdss@gmail.com" "bbbb"
    And Selecciono ingresar
    Then Inicio sesion con mi usuario

    Scenario: Despliegue de lista sin tareas
    Given Como usuario con logeado
    When Me encuentro en la pestana Home
    Then No se muestran en pantalla las tareas

    Scenario: Despliegue de lista con tareas
    Given Como usuario con logeado
    When Me encuentro en la pestana Home
    Then Se muestran en pantalla las tareas
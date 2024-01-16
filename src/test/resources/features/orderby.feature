Feature: Ordenar tareas por título

    Como usuario con tareas creadas
    deseo poder ordenar mi lista de tareas por título, prioridad o fecha de vencimiento
    ,ya sea de manera ascendente o descendente
    para encontrar y organizar mis tareas de manera efectiva
    
    Background:
    Given Me encuentro en Sentra Tasks
    When Ingreso mis credenciales "aaaa@gmail.com" "bbbb"
    And Selecciono ingresar
    Then Inicio sesion con mi usuario

    Given Me encuentro en el home de Sentra Tasks

    Scenario: Ordenar por titulo descendente
        When Selecciono "Titulo" en la grilla de tareas
        Then Las tareas se ordenan de manera descendente

    Scenario: Ordenar por titulo ascendente
        When Realizo doble click en "titulo" dentro de la grilla de tareas
        Then Las tareas se ordenan de manera ascendente

    Scenario: Ordenar por prioridad descendente
        When Selecciono "Prioridad" en la grilla de tareas
        Then Las tareas se ordenan de manera descendente

    Scenario: Ordenar por prioridad ascendente
        When Realizo doble click en "prioridad" dentro de la grilla de tareas
        Then Las tareas se ordenan de manera ascendente
    
    Scenario: Ordenar segun Fecha Vencimiento descendente
        When Selecciono "Fecha Vencimiento" en la grilla de tareas
        Then Las tareas se ordenan de manera descendente

    Scenario: Ordenar segun Fecha Vencimiento ascendente
        When Realizo doble click en "fecha vencimiento" dentro de la grilla de tareas
        Then Las tareas se ordenan de manera ascendente
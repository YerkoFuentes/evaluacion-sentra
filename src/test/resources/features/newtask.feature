Feature: Crear nueva tarea

    Como nuevo usuario
    quiero poder crear una nueva tarea proporcionando un
    título, una descripción, una prioridad y una fecha de término
    para organizar y gestionar mis actividades
    
    Background:
    Given Me encuentro en Sentra Tasks
    When Ingreso mis credenciales "asdss@gmail.com" "bbbb"
    And Selecciono ingresar
    Then Inicio sesion con mi usuario

    @Test
    Scenario Outline: Crear tarea
    Given Me encuentro en el home de Sentra Tasks
    When Selecciono Nueva Tarea
    And Ingreso el titulo <title>, descripcion <caption>, fecha de vencimiento <dateVenc> y prioridad <prio> 
    And Selecciono Crear Tarea
    Then Se crea la tarea exitosamente
    Examples:
        | title                    | caption                                | dateVenc      | prio |
        | "Pruebas de no impacto"  | "Se debe realizar pruebas no impacto"  | "30/06/2030"  | "99" |
Feature: Modificar Informacion de Usuario

    Como usuario de sentra Tasks
    quiero poder modificar mi información personal, incluyendo nombre, apellido, correo y contraseña
    para mantener mi perfil actualizado

    Background:
    Given Me encuentro en Sentra Tasks
    When Ingreso mis credenciales "aaaa@gmail.com" "bbbb"
    And Selecciono ingresar
    Then Inicio sesion con mi usuario

    Scenario: Se comprueba cambio de usuario
        Given Como usuario con la sesion iniciada 
        When Voy a mi perfil
        And Selecciono la opcion "Editar Usuario"
        Then Se levanta la ventana "Modificar Usuario"

    
    Scenario: Se comprueba cambio de contrasena
        Given Como usuario con la sesion iniciada 
        When Voy a mi perfil
        And Selecciono la opcion "Editar Password"
        Then Se levanta la ventana "Cambiar Contrasena"

    Scenario Outline: Edito mi usuario
        Given Como usuario con la sesion iniciada 
        When Voy a mi perfil
        And Selecciono la opcion "Editar Usuario"
        And Ingreso mi nombre <nameEdit>, apellido <lastnameEdit> y correo <emailEdit>
        And Selecciono "Modificar Usuario"
        Then Se modifica mi informacion correctamente
        Examples:
            | nameEdit    | lastnameEdit    | emailEdit           |
            | "aaaaa"     | "aaaaa"         | "aaaaa@gmail.com"   |

    Scenario Outline: Edito mi password
        Given Como usuario con la sesion iniciada 
        When Voy a mi perfil
        And Selecciono la opcion "Editar Password"
        And Ingreso mi nueva contrasena <password> y la repito <repeatPassword>
        And Selecciono "Cambiar Contrasena"
        Then Se modifica mi informacion correctamente
        Examples:
            | password    | repeatPassword    |
            | "bbbb"      | "bbbb"            |
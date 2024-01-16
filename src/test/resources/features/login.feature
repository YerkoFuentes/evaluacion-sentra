Feature: Inicio de Sesion

    Como usuario registrado
    deseo poder iniciar sesion en el sitio
    utilizando mi correo y contrasena

    @Login
    Scenario Outline: El usuario inicia sesion
    Given Me encuentro en Sentra Tasks
    When Ingreso mis credenciales <emailLogin> <passwordLogin>
    And Selecciono ingresar
    Then Inicio sesion con mi usuario
    Examples:
        | emailLogin        | passwordLogin |
        | "aaaa@gmail.com"  | "bbbb"  |

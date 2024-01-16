Feature: Registro de usuario

    Como nuevo usuario
    quiero poder registrarme en el sitio proporcionando mi nombre, apellido, correo y contraseña
    para poder acceder a las funcionalidades del sitio
    
    @Signup
    Scenario: Se despliega el formulario para registrarse
        Given Navego hasta el sitio de Sentra Tasks
        When Voy a crear un nuevo usuario
        Then Se levanta la ventana para Registrar Usuario

    @Signup 
    Scenario Outline: Puedo registrar un usuario en el sitio
        Given Navego hasta el sitio de Sentra Tasks
        When Voy a crear un nuevo usuario
        And Se levanta la ventana para Registrar Usuario
        And Ingreso el nombre <username>, apellido <lastname>, correo <correo> y password <password>
        And Selecciono el boton Registrar Usuario
        Then El usuario es registrado exitosamente
        Examples:
            | username    | lastname  | correo          | password   |
            | "Johnx"      | "Wickx"   | "aaaax@gmail.com" | "503051"   |

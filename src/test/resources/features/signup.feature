Feature: Registro de usuario

    Como nuevo usuario
    quiero poder registrarme en el sitio proporcionando mi nombre, apellido, correo y contraseña
    para poder acceder a las funcionalidades del sitio
    
    Scenario: Se despliega el formulario para registrarse
        Given Navego hasta el sitio de Sentra Tasks
        When Voy a crear un nuevo usuario
        Then Se levanta la ventana para Registrar Usuario

    Scenario Outline: Puedo registrar un usuario en el sitio
        Given Ingreso el nombre <username>, apellido <lastname>, correo <correo> y password <password>
        When Selecciono el boton Registrar Usuario
        Then El usuario es registrado exitosamente
        Examples:
            | username    | lastname | correo          | password   |
            | "John"      | "Wickx"   | "aaaa@gmail.com" | "503051"   |

## Automatización de Sentra Tasks

En este proyecto se buscó realizar pruebas automatizadas para el sitio Sentra Tasks utilizando Java, Selenium, Cucumber y Gradle.
El foco de estas pruebas fueron las siguientes funcionalidades:

####Funcionalidades Automatizadas
- Registro de usuario
- Inicio de sesión
- Modificar información de usuario
- Ver lista de tareas
- Crear nuevas tareas
- Ordenar tareas por título/prioridad/fecha de término

#### Organización del proyecto
Para llevar a cabo la automatización, se utilizó la estructura POM (Page Object Model) con la siguiente estructura:

- src/test/java/pages/
- src/test/java/runner
- src/test/java/steps
- src/test/resources/features
- src/test/resources/cucumber.propierties
- .gitignore
- build.gradle


#### Ejecución de los tests

Para ejecutar los tests creados es necesario ajustar el tag "@Test" dentro de los distintos archivos "features", de esta manera se selecciona el test a ejecutar y luego dentro del Runner se realiza la ejecución.

> By Yerko Fuentes

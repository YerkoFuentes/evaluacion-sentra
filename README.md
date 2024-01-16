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

#### Reporte

Para acceder al reporte generado por el proyecto, el cual cuenta con Screenshots en caso de fallar, por favor acceder a la siguiente URL:

 - https://reports.cucumber.io/report-collections/3e54d4a1-291c-409e-b4c7-5b06e993e622

> By Yerko Fuentes

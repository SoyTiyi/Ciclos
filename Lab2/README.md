# Lab2

## La herramienta Mave:
Cuál es su mayour utilidad: simplificar los precesos de build ( compilar y.generar ejecutables a partir del código fuente).
Maven es una herramienta capaz de gestionar un proyecto software completo, desde la etapa en la que se comprueba que el código es correcto, hasta que se despliega la aplicación, pasando por la ejecución de pruebas y generación de informes y documentación.
Fases de maven:
- Validación (validate): Validar que el proyecto es correcto.
- Compilación (compile).
- Test (test): Probar el código fuente usando un framework de pruebas unitarias.
- Empaquetar (package): Empaquetar el código compilado y transformarlo en algún formato tipo .jar o .war.
- Pruebas de integración (integration-test): Procesar y desplegar el código en algún entorno donde se puedan ejecutar las pruebas de integración.
- Verificar que el código empaquetado es válido y cumple los criterios de calidad (verify).
- Instalar el código empaquetado en el repositorio local de Maven, para usarlo como dependencia de otros proyectos (install).
- Desplegar el código a un entorno (deploy).

## Ciclo de vida de construcción:
1. Validar: verificación si toda la información necesaria para la acumulación está disponible
2. compilar: compilar el código fuente
prueba de compilación: compilar el código fuente de prueba
3. prueba: ejecutar pruebas unitarias
4. Paquete: paquete compilado el código fuente en el formato distribuible (frasco, guerra, ...)
5. la integración de la prueba: proceso e implementar el paquete si es necesario para ejecutar las pruebas de integración
6. instalar: instalar el paquete a un repositorio local
Implementar: copiar el paquete al repositorio remoto

## Para qué sirven los plugins: 
Maven es en realidad un marco de ejecución de complementos en el que cada tarea se realiza mediante complementos. Los complementos de Maven generalmente se usan para:
* crear archivo jar
* crear archivo de guerra
* compilar archivos de código
* prueba unitaria de código
* crear documentación del proyecto
* crear informes de proyectos

Un complemento generalmente proporciona un conjunto de objetivos, que se pueden ejecutar utilizando la siguiente sintaxis:
**mvn [plugin-name]:[goal-name]**
Por ejemplo, un proyecto de Java se puede compilar con el objetivo de compilación de maven-compiler-plugin ejecutando el siguiente comando.
**mvn compiler:compile**

## Que es y para qué sirve el repositorio central de Maven: 
El repositorio central de Maven es un repositorio proporcionado por la comunidad de Maven. Contiene una gran cantidad de bibliotecas de uso común.
Cuando Maven no encuentra ninguna dependencia en el repositorio local, comienza a buscar en el repositorio central utilizando la siguiente 
[Repositorio Central]: https://repo1.maven.org/maven2/

### Los conceptos clave del repositorio central son los siguientes:
* Este repositorio está gestionado por la comunidad de Maven.
* No es necesario configurarlo.
* Requiere acceso a Internet para ser buscado.

Para navegar por el contenido del repositorio central de maven, la comunidad de maven ha proporcionado una [URL]: https://search.maven.org/#browse 

Con esta biblioteca, un desarrollador puede buscar todas las bibliotecas disponibles en el repositorio central.

## Ejercicio de las Figuras
1. Buscar cómo se crea un proyecto maven con ayuda de los arquetipos (archetypes):
    - Crear una nueva carpeta, puede ser en Documents llamada proyecto_maven.
    En la terminal, ubicarse en la carpeta /home/desarrollo/Documents/proyecto_maven.
    Ejecutar el siguiente comando en la terminal. Creará la estructura de carpetas y archivos del proyecto.
    **mvn archetype:generate**
2. Busque cómo ejecutar desde línea de comandos el objetivo "generate" del    plugin "archetype", con los siguientes parámetros:
    - mvn archetype:generate
    Nos mostrará el mensaje Choose a number or apply filter (**format: [groupId:]artifactId**, case sensitive contains): 923:. Se oprime la tecla Enter para tomar la lista de arquitectura del proyecto por defecto (el número puede variar).
    Nos mostrará el mensaje Choose org.apache.maven.archetypes:maven-archetype-quickstart version: 1: 1.0-alpha-1 … 6: 1.1. Choose a number: 6:. Se oprime la tecla Enter para tomar al versión de la arquitectura por defecto.
    Se establecen los datos esenciales del proyecto. Al terminar se escribe la letra Y para confirmar:
    groupId: Identificará tu proyecto frente a los demás, usaremos com.proyecto.
    artifactid: Nombre de la versión jar sin versión, usaremos primer-proyecto.
    version: Usaremos 1.0.
    package: Nombre del paquete principal de la aplicación, usaremos com.proyecto.demo.mvn 
    Compilar y Ejecutar
3. Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn:
    - "$ mvn compile – compila el proyecto y deja el resultado en target/classes"
    - "$ mvn test – compila los test y los ejecuta"
    - "$ mvn package – empaqueta el proyecto y lo dejará en taget/autentiaNegocio-1.0-SNAPSHOT.jar"
    - "$ mvn install – guarda el proyecto en el repositorio"
    - "$ mvn clean – borra el directorio de salida (target)"
4. Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase App.java como parámetro en "mainClass":
    - "exec:java -Dexec.mainClass="edu.eci.cvds.patterns.App" "
5. Buscar cómo enviar parámetros al plugin "exec".
    - "exec:java -Dexec.mainClass="edu.eci.cvds.patterns.App" -Dexec.args="arg1 " "

## Archivo .gitignore
Git tiene una herramienta imprescindible casi en cualquier proyecto, el archivo "gitignore", que sirve para decirle a Git qué archivos o directorios completos debe ignorar y no subir al repositorio de código.
Su implementación es muy sencilla, por lo que no hay motivo para no usarlo en cualquier proyecto y para cualquier nivel de conocimientos de Git que tenga el desarrollador. Únicamente se necesita crear un archivo especificando qué elementos se deben ignorar y, a partir de entonces, realizar el resto del proceso para trabajo con Git de manera habitual.
En el gitignore se especificarán todas las rutas y archivos que no se requieren y con ello, el proceso de control de versiones simplemente ignorará esos archivos. 
Implementar el gitignore
Dentro del archivo .gitignore colocarás texto plano, con todas las carpetas que quieres que Git simplemente ignore, así como los archivos.
La notación es muy simple. Por ejemplo, si indicamos la línea
bower_components/
Estamos evitando que se procese en el control de versiones todo el contenido de la carpeta "bower_components".
Si colocamos la siguiente línea:
*.DS_Store
Estaremos evitando que el sistema de control de versiones procese todos los archivos acabados de .DS_Store, que son ficheros de esos que crea el sistema operativo del Mac (OS X) automáticamente.

## Esqueleto de la Aplicacion
Pruebas:
1. Sin parametros: La instrucción se ejecuto correctamente, ya que este caso es evaluado en la clase principal (ShapeMain.java)
    - ![Ninguna](./Image/ninguna.png)
2. qwerty: La instruccion se ejecuta, ya que este tipo no esta validado por lo tanto la excepción es capturada y retorna el mensaje de que esa figura no es valida
    - ![qwerty](./Image/qwerty.png)
3. Pentagon: La instruccion se ejecuta correctamente y retorna el mensaje con el numero de lados
    - ![Pentagon](./Image/Pentagon.png)
4. Hexagon: La instruccion se ejecuta correctamente y retorn el mensaje con el numero de lados
    - ![Hexagon](./Image/Hexagon.png)



## Bibliografía:
* https://www.javiergarzas.com/2014/06/maven-en-10-min.html
* https://www.es.w3ki.com/maven/maven_build_life_cycle.html
* https://www.tutorialspoint.com/maven/maven_plugins.htm
* https://www.tutorialspoint.com/maven/maven_repositories.htm
* https://platzi.com/tutoriales/1236-java-avanzado/299-nuevo-proyecto-en-maven-desde-la-terminal-de-linux/
* https://www.adictosaltrabajo.com/2006/09/19/maven/
* https://desarrolloweb.com/articulos/archivo-gitignore.html#:~:text=Qu%C3%A9%20es%20el%20archivo%20gitignore,subir%20al%20repositorio%20de%20c%C3%B3digo.

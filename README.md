# Conversor de Monedas

Este proyecto es un conversor de monedas simple que permite convertir entre varias monedas utilizando una API de tipo REST para obtener las tasas de cambio actuales. El proyecto está desarrollado en Java y utiliza la biblioteca Gson para parsear las respuestas JSON de la API.

## Estructura del Proyecto

El proyecto está dividido en tres paquetes principales:

1. **conexion**: Contiene la clase `ConexionJson` que se encarga de realizar las peticiones a la API y obtener el valor convertido.
2. **modelos**: Contiene la clase `Moneda` que representa el modelo de datos de la respuesta JSON de la API.
3. **principal**: Contiene la clase `Principal` que es la entrada principal del programa.

## Requisitos

Para ejecutar este proyecto, necesitas tener instalados los siguientes componentes:

- Java JDK 11 o superior
- Maven (opcional, si decides manejar las dependencias y la compilación con Maven)

## Instalación

1. Clona el repositorio en tu máquina local:
    ```sh
    git clone https://github.com/tu-usuario/conversor-monedas.git
    ```
2. Navega al directorio del proyecto:
    ```sh
    cd conversor-monedas
    ```

## Uso

Para ejecutar el conversor de monedas, simplemente compila y ejecuta el programa principal.

### Compilación y Ejecución

#### Usando la línea de comandos:

1. Compila el proyecto:
    ```sh
    javac -cp gson-2.8.6.jar com/alura/convertidorMonedas/conexion/ConexionJson.java com/alura/convertidorMonedas/modelos/Moneda.java com/alura/convertidorMonedas/principal/Principal.java
    ```

2. Ejecuta el programa:
    ```sh
    java -cp .:gson-2.8.6.jar com.alura.convertidorMonedas.principal.Principal
    ```

#### Usando un IDE:

1. Importa el proyecto en tu IDE favorito (por ejemplo, IntelliJ IDEA, Eclipse).
2. Asegúrate de añadir la biblioteca Gson al classpath del proyecto.
3. Ejecuta la clase `Principal`.

### Interacción del Usuario

El programa ofrece un menú con las siguientes opciones:

1. Dólar => Peso argentino
2. Peso argentino => Dólar
3. Dólar => Real brasileño
4. Real brasileño => Dólar
5. Dólar => Peso colombiano
6. Peso colombiano => Dólar
7. Salir

El usuario selecciona una opción, ingresa el valor que desea convertir y el programa muestra el valor convertido.

## Clases

###  ConexionJson

Esta clase se encarga de manejar las peticiones HTTP y parsear la respuesta JSON para obtener el valor convertido.

###  Moneda

Esta clase representa el modelo de datos de la respuesta JSON de la API.

###  Principal

Esta clase contiene el método main y maneja la interacción con el usuario.

## Contribución

Si deseas contribuir a este proyecto, por favor abre un pull request o crea un issue para discutir los cambios que deseas realizar.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT.


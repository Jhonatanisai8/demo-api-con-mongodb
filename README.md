# 🚀 API REST de Gestión de Personas con Spring Boot y MongoDB 🚀

Este proyecto es una API REST simple construida con **Spring Boot** que permite gestionar información de personas, utilizando **MongoDB** como base de datos NoSQL. Ideal para entender los fundamentos de una API RESTful con persistencia en MongoDB.

![APIS](https://github.com/user-attachments/assets/3cc863dc-833a-447c-8aea-fce0d3b4c567)

## ✨ Funcionalidades

Esta API proporciona los siguientes endpoints para la gestión de personas:

* **Crear Nueva Persona:** Registra un nuevo individuo en la base de datos.
* **Obtener Todas las Personas:** Recupera la lista completa de personas registradas.
* **Obtener Persona por ID:** Busca y devuelve los detalles de una persona específica por su ID.
* **Actualizar Persona:** Modifica los datos de una persona existente.
* **Eliminar Persona:** Borra un registro de persona de la base de datos.

## ✨ Funcionalidades (Endpoints)

La API expone los siguientes endpoints para la gestión de recursos `Persona`:

* **`POST /api/v1/personas/registrar`**:
    * **Propósito**: Crea un nuevo registro de persona en la base de datos.
    * **Detalles**: Recibe un objeto `Persona` en formato JSON en el cuerpo de la petición. El `id` será generado automáticamente por MongoDB.
* **`GET /api/v1/personas`**:
    * **Propósito**: Recupera una lista completa de todas las personas registradas en la base de datos.
    * **Detalles**: No requiere parámetros.
* **`GET /api/v1/personas/buscar/{idRequestId}`**:
    * **Propósito**: Busca y devuelve los detalles de una persona específica por su `id`.
    * **Detalles**: El `{idRequestId}` debe ser el ID único de la persona a buscar.
* **`PUT /api/v1/personas/actualizar`**:
    * **Propósito**: Actualiza los datos de una persona existente.
* **`DELETE /api/v1/personas/eliminar/{idRequestId}`**:
    * **Propósito**: Elimina un registro de persona de la base de datos.
    * **Detalles**: El `{idRequestId}` debe ser el ID único de la persona a eliminar.
  
## 🛠️ Tecnologías Utilizadas

* **Spring Boot**: Framework para construir aplicaciones Java robustas y rápidas.
* **Spring Data MongoDB**: Abstracción para interactuar fácilmente con MongoDB.
* **MongoDB**: Base de datos NoSQL basada en documentos.
* **Lombok**: Librería para reducir código boilerplate en Java.
* **Maven**: Herramienta de automatización de construcción.

## 🚀 Cómo Empezar

Sigue estos pasos para poner en marcha la API en tu entorno local.

### Prerrequisitos

* **Java 21 o superior**: Asegúrate de tener el JDK instalado.
* **Maven**: La herramienta de construcción de tu proyecto.
* **MongoDB Server**: Debes tener una instancia de MongoDB ejecutándose localmente.
    * **Verificar y Ejecutar MongoDB (Windows):**
        Abre el Símbolo del Sistema (CMD) o PowerShell **como Administrador** y ejecuta:
        ```bash
        net start MongoDB
        ```
        Si no se inicia, consulta la documentación oficial para iniciar `mongod.exe` manualmente.
* **Un cliente REST**: Como [Postman](https://www.postman.com/downloads/), [Insomnia](https://insomnia.rest/download), o la extensión [Thunder Client](https://marketplace.visualstudio.com/items?itemName=rangav.vscode-thunder-client) para VS Code.

### 1. Clonar el Repositorio

```bash
git clone https://github.com/Jhonatanisai8/demo-api-con-mongodb.git
```

### 2. Configuración de la Base de Datos
Asegúrate de que el archivo `application.properties` (o `application.yml` si usas YAML) ubicado en `src/main/resources` esté configurado para apuntar a tu instancia de MongoDB:
```properties
# src/main/resources/application.properties

# Configuración de Spring Data MongoDB
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=persona-db # <--- ¡Cambia a tu nombre de base de datos preferido!
```
### 3. 💻 Guía de Endpoints de la API
A continuación, se detallan los endpoints disponibles y cómo interactuar con ellos usando un cliente REST. La base URL para todos los endpoints es 

```bash
http://localhost:8080/api/v1/personas
```

1. POST /api/v1/personas/registrar - Crear una Nueva Persona
```bash
http://localhost:8080/api/v1/personas/registrar
```
Este endpoint permite registrar una nueva persona en la base de datos.
![image](https://github.com/user-attachments/assets/b668b68d-137e-4fb5-8fae-40e7e40e3c98)

2. GET /api/v1/personas - Obtener Todas las Personas
Este endpoint devuelve una lista de todas las personas registradas en la base de datos.
Método: GET
URL: http://localhost:8080/api/v1/personas
Respuesta Exitosa (HTTP 200 OK):
```bash
http://localhost:8080/api/v1/personas
```
![image](https://github.com/user-attachments/assets/8033e00b-a26d-48f7-ae9b-a4b85a09437d)

3. GET /api/v1/personas/buscar/{idRequestId} - Obtener Persona por ID
Este endpoint recupera los detalles de una persona específica utilizando su ID único.
Método: GET
URL: http://localhost:8080/api/v1/personas/buscar/6843b7520b800a49c4374a4b
Nota: Reemplaza 6843b7520b800a49c4374a4b con un ID real de una persona existente en tu base de datos.
![image](https://github.com/user-attachments/assets/316b2f46-7fd9-42ea-8530-78ae272f88a2)

Respuesta Exitosa (HTTP 200 OK):
```bash
http://localhost:8080/api/v1/personas/buscar/6843b7520b800a49c4374a4b
```


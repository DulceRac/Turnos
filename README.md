# Sistema de Gestión de Turnos

Este proyecto es una aplicación backend desarrollada con **Spring Boot** para la gestión de turnos. Utiliza **RabbitMQ** para la comunicación de eventos entre componentes y está construida con Maven como herramienta de gestión de dependencias y empaquetado.

## Características

- API REST para gestionar turnos.
- Comunicación asincrónica mediante RabbitMQ.
- Arquitectura basada en eventos.
- Organización modular del código (DTO, Controller, Service, Configuración).
- Archivo `application.properties` para configuración del entorno.

## Tecnologías Utilizadas

- Java 17+
- Spring Boot
- RabbitMQ
- Maven
- JPA / Hibernate
- MySQL 

## Cómo Ejecutar

1. **Requisitos previos**:
   - Java JDK 17 o superior
   - Maven
   - RabbitMQ instalado y corriendo localmente
   - MySQL (opcional si el proyecto persiste datos)

2. **Clonar el repositorio y construir el proyecto**:
   ```bash
   mvn clean install
   ```

3. **Ejecutar la aplicación**:
   ```bash
   mvn spring-boot:run
   ```

4. **RabbitMQ**:
   Asegúrate de que RabbitMQ esté ejecutándose en `localhost` y que los parámetros coincidan con los definidos en `application.properties`.

## Endpoints

A continuación se describen algunos endpoints expuestos por el backend (ejemplos):

- `POST /api/turnos` - Crear un nuevo turno.
- `GET /api/turnos` - Obtener todos los turnos.

## Configuración

El archivo `application.properties` contiene la configuración principal, incluyendo:

- Puerto de ejecución
- Parámetros de RabbitMQ
- Configuración de base de datos


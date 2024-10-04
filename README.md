# retoPichincha

Este proyecto realiza una prueba funcional automatizada (E2E) del flujo de compra en la página OpenCart.

## Requisitos Previos

- Java Development Kit (JDK) 17 
- Gradle 8.0 o superior
- Navegador Edge

## Configuración del Proyecto

1. **Clonar el repositorio**:
    ```sh
    git clone https://github.com/jhonferre/retoPichincha.git
    cd retoPichincha
    ```

2. **Configurar las dependencias**:
    ```sh
    ./gradlew clean build
    ```

## Ejecución de las Pruebas

Para ejecutar las pruebas y generar el reporte agregado, utiliza el siguiente comando:
```sh
./gradlew clean test aggregate
```

## Funcionalidades Probadas

- **Agregar dos productos al carrito**
- **Visualizar el carrito**
- **Completar el “Checkout” como invitado: “Guest Checkout”**
- **Finalizar la compra hasta la confirmación: “Your order has been placed!”**

## Reporte de Serenity

Después de ejecutar las pruebas, puedes encontrar el reporte generado por Serenity en la siguiente ruta:
```sh
<project-root>/target/site/serenity/index.html
```
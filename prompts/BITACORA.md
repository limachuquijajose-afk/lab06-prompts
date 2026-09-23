# Bitacora de prompts

Laboratorio 06: Fundamentos de Ingenieria de Prompts.

Herramienta de IA usada: ChatGPT

## Ejercicio 2: Tokens y ventana de contexto

| Texto                              | Caracteres | Tokens |
| ---------------------------------- | ---------- | ------ |
| Los estudiantes programan en Java. | 34         | 7      |
| The students program in Java.      | 29         | 6      |
| desafortunadamente                 | 18         | 4      |

En el paso #4 la IA pudo decir la respuesta al identificar el contexto previo que le pasamos.

En el paso #5 la IA no pudo decir la respuesta debido a que carecia de un contexto previo.

## Ejercicio 3: Temperatura

| Temperatura | % de BiblioTec | Nombres en los 5 intentos                             |
| ----------- | -------------- | ----------------------------------------------------- |
| 0           | 100.0%         | BiblioTec, BiblioTec, BiblioTec, BiblioTec, BiblioTec |
| 0.5         | 65.3%          | PaginaLibre, LibroYa, LibroYa, LibroYa, BiblioTec     |
| 1           | 44.5%          | LectoGo, BiblioTec, LibroYa, BiblioTec, LibroYa       |
| 1.8         | 32.2%          | LectoGo, LibroYa, LibroYa, NubeDeTinta, LectoGo       |

Al subir la temperatura los porcentajes se reparten mas y los nombres en los 5 intentos cambian y son mas variados.

El simulador nunca inventa un nombre nuevo porque la temperatura solo cambia que tan arriesgado es eligiendo entre lo que ya esta en la lista, no le agrega conocimientos nuevos.

## Ejercicio 4: Prompt vago vs estructurado

| Criterio                            | Prompt vago | Prompt estructurado |
| ----------------------------------- | ----------- | ------------------- |
| Menciona el objetivo del sistema    | Si          | Si                  |
| Menciona a los usuarios principales | No          | Si                  |
| Tiene exactamente 3 funcionalidades | No          | Si                  |
| Esta en 3 parrafos                  | Si          | Si                  |
| Lo usaria en un informe real        | No          | Si                  |

## Ejercicio 5: Anatomia de un prompt

| Componente  | Texto de mi prompt                                                         |
| ----------- | -------------------------------------------------------------------------- |
| Rol         | Actua como desarrollador Java.                                             |
| Instruccion | Crea un programa en Java para gestionar los productos de una tienda...     |
| Contexto    | ...para gestionar los productos de una tienda...                           |
| Ejemplo     | Usa este estilo para los metodos: getPrecio(), setPrecio(double precio).   |
| Formato     | Explica primero la estructura de la clase y luego presenta el codigo Java. |

- Nivel 1: La IA crea un programa cualquiera muy basico como un hola mundo.

- Nivel 2: La IA asume el rol de programador pero el codigo sigue siendo general.

- Nivel 3: La IA ya enfoca el programa para la gestion de productos de una tienda.

- Nivel 4: La IA crea la clase especifica con los atributos pedidos (codigo, nombre, precio, stock).

- Nivel 5: La IA explica la estructura primero, formatea el codigo y usa el estilo de metodos requerido.

## Ejercicio 6: Del prompt basico al profesional

Prompt final:

```text
Actua como desarrollador Java. Crea un ejemplo de login para una aplicacion de escritorio utilizando Swing. El usuario debe ingresar correo y contrasena. Explica brevemente el funcionamiento y presenta el codigo organizado por clases.

[Instrucción de mejora:]
Mejora el codigo anterior con estas restricciones: no uses librerias externas, valida que el correo contenga @ y que la contrasena tenga al menos 8 caracteres, y muestra los mensajes con JOptionPane.
```

| Qué revisar                                            | Cumple (Si/No) |
| ------------------------------------------------------ | -------------- |
| ¿Está escrito en Java y usa Swing?                     | Si             |
| ¿Pide correo y contraseña?                             | Si             |
| ¿Explica el funcionamiento antes o después del código? | Si             |
| ¿El código está organizado en clases?                  | Si             |
| ¿Valida los datos que ingresa el usuario?              | Si             |

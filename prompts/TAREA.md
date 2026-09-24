# Tarea: Mi prompt profesional

## Funcionalidad elegida

Aplicacion de consola en Python para la gestion de inventario y stock de un minimarket propio (registrar productos, consultar stock, actualizar precios y mostrar alertas de stock bajo).

## Version 1: prompt basico

```text
Crea un programa en Python para un minimarket.
```

Que cambie / por que: Use un prompt demasiado general y simple para ver como reaccionaba la IA sin darle instrucciones precisas.

Que mejoro en la respuesta: La IA dio un codigo muy basico o incompleto que solo imprimia un menu generico sin la logica real para gestionar un inventario.

## Version 2

```text
Crea un programa en Python para gestionar el inventario de un minimarket usando un diccionario. Debe permitir agregar productos y mostrar la lista.
```

Que cambie / por que: Agregue un poco de contexto tecnico (usar un diccionario) y una instruccion un poco mas especifica (agregar y mostrar productos) para solucionar el problema de que el prompt anterior era muy abierto.

Que mejoro en la respuesta: La estructura mejoro bastante, ya creo un diccionario para almacenar los productos y funciones basicas para registrar y listar, pero aun faltaba darle un rol claro, formato de salida y ejemplos.

## Version 3: prompt final

```text
Actua como desarrollador Python. Crea un programa modular en Python para gestionar el inventario de un minimarket propio. El sistema debe utilizar un diccionario donde la clave sea el nombre del producto y el valor sea un diccionario con 'precio' y 'stock'.

Incluye funciones para registrar un producto, actualizar el stock y mostrar un reporte general.

Usa este formato de salida para las alertas: "ALERTA: El producto [nombre] tiene stock bajo ([cantidad] unidades)".

No uses librerias externas. Explica brevemente el codigo antes de presentarlo.
```

Que cambie / por que: Integre los cinco componentes clave (Rol, Instruccion, Contexto, Ejemplo y Formato) y agregue restricciones explicitas para asegurar que el codigo sea exactamente lo que necesito sin dependencias externas.

Que mejoro en la respuesta: La IA genero un codigo profesional, bien estructurado, con manejo de diccionarios anidados, formato exacto para las alertas y sin librerias externas.

## Componentes del prompt final

| Componente  | Texto de mi prompt                                                                                  |
| ----------- | --------------------------------------------------------------------------------------------------- |
| Rol         | Actua como desarrollador Python.                                                                    |
| Instruccion | Crea un programa modular en Python para gestionar el inventario...                                  |
| Contexto    | ...para gestionar el inventario de un minimarket propio. El sistema debe utilizar un diccionario... |
| Ejemplo     | Usa este formato de salida para las alertas: "ALERTA: El producto [nombre] tiene stock bajo..."     |
| Formato     | Explica brevemente el codigo antes de presentarlo.                                                  |

## Evaluacion del resultado

| Que revisar                                               | Cumple (Si/No) |
| --------------------------------------------------------- | -------------- |
| ¿Esta escrito en Python y usa diccionarios?               | Si             |
| ¿Permite registrar productos y actualizar stock?          | Si             |
| ¿Utiliza el formato de alerta indicado con el ejemplo?    | Si             |
| ¿Cumple con la restriccion de no usar librerias externas? | Si             |
| ¿Explica el codigo antes de presentarlo?                  | Si             |

## Errores que evite

- Ser demasiado general: En la Version 1 la IA no sabia que hacer exactamente porque solo pedi "un programa para un minimarket". Lo evite en el prompt final detallando las funciones exactas (registrar, actualizar, mostrar) y la estructura interna con diccionarios.
- No indicar el formato: Al principio los mensajes de alerta salian de cualquier manera. Lo evite incluyendo un ejemplo textual de como debia mostrarse exactamente la alerta de stock bajo.

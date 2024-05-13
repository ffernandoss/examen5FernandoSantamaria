

# Examen 5 - Fernando Santamaria

## Entrega 1
se ha usado el patron factory y strategy para este ejercicio

Formado por las siguientes clases e interfaces:

### Clases:
- EstrategiaDeServicioDeLujo
- EstrategiaDeServicioRapido
- EstrategiaDeServicioTematico
- GestorDeRestaurante
- Main
- RestauranteDeLujo
- RestauranteFactory
- RestauranteRapido
- RestauranteTematico

### Interfaces:
- EntregaDeServicio
- Restaurante

El código y el diagrama UML correspondiente se encuentran dentro del paquete `entrega1`. Los tests están dentro de la carpeta `test` en la clase `testsEntrega1`.

## Entrega 2
se ha usado el patron composite y observer

Formado por la siguiente clase abstracta, clases e interfaces:

### Clase abstracta:
- ComponenteRestaurante

### Clases:
- AdapterSistemaExterno
- GrupoRestaurante
- Main
- ObserverImpl
- SistemaExternoImpl

### Interfaces:
- Observer
- SistemaExterno

El código y el diagrama UML correspondiente se encuentran dentro del paquete `entrega2`.

## Entrega 3

se ha usado el patron Command y State

Formado por la siguiente clase abstracta, clases e interfaces:

### Clase abstracta:
- Componente

### Clases:
- CancelarCommand
- Cocina
- Entrega
- Libre
- Main
- Mesa
- Ocupada
- OrdenarCommand
- Reservada
- ReservarCommand
- RestauranteMediator
- ServicioAlCliente

### Interfaces:
- Command
- EstadoMesa
- Mediator

El código y el diagrama UML correspondiente se encuentran dentro del paquete `entrega3`.

## Entrega 4
se ha usado el patron composite y Swing para la parte de modelo vista controlador

Formado por las siguientes clases e interfaces:

### Clases:
- ControladorRestaurante
- ElementoRestaurante
- Main
- ModeloRestaurante
- Restaurante
- VistaRestaurante

### Interfaces:
- ComponenteRestaurante

El código y el diagrama UML correspondiente se encuentran dentro del paquete `entrega4`.

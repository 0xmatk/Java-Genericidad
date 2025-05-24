# Ejercicios de Genericidad en Java

## 1. Almacenamiento

Crear una clase genérica llamada **`Almacenamiento`** que pueda almacenar cualquier tipo de objeto.  
Debe tener métodos para:
- Agregar
- Eliminar
- Buscar objetos en el almacenamiento

🔎 **Se realizan pruebas con diferentes tipos de objetos.**

---

## 2. Pila

Crear una clase genérica llamada **`Pila`** que funcione como una pila de objetos.  
Debe tener métodos para:
- Agregar elementos (`apilar`)
- Quitar elementos (`desapilar`)
- Verificar si está vacía
- Obtener la cantidad de elementos

🧪 **Se realizan pruebas con diferentes tipos de objetos.**

---

## 3. OperacionMatematica

Crear una clase genérica llamada **`OperacionMatematica`** que pueda realizar operaciones matemáticas simples (`suma`, `resta`, `multiplicación`, `división`) con cualquier tipo de número (`Integer`, `Double`, etc.).  
Debe tener métodos para:
- Cada operación
- Establecer los números de entrada

🧠 **Se realizan pruebas con diferentes tipos de números.**

---

## 4. Conjunto

Crear una clase genérica llamada **`Conjunto`** que pueda almacenar elementos **únicos** de cualquier tipo.  
Debe tener métodos para:
- Agregar elementos
- Eliminar elementos
- Verificar si un elemento está presente

🔄 **Se prueban con tipos de datos distintos.**

---

## 5. ListaOrdenada

Crear una clase genérica llamada **`ListaOrdenada`** que pueda almacenar elementos en orden **ascendente** o **descendente**.  
Debe tener métodos para:
- Agregar elementos
- Eliminar elementos
- Obtener un elemento por posición (índice)

📊 **Se hacen pruebas con diferentes tipos y órdenes.**

---

## 🛫 Ejercicio Bonus Track 😝

Crear un `main` que invoque únicamente las funciones que **compilen correctamente**.

### Sistema de gestión para el Aeropuerto Internacional Astor Piazzolla

El aeropuerto debe manejar:

- **Nombre**
- **Código internacional**
- **Dirección**
- **Capacidad de operación** (máximo de aviones en pista)

### Cada **hangar** administra diferentes tipos de aviones con sus propias restricciones.

### Todos los aviones tienen:
- Modelo
- Marca
- Capacidad de combustible
- Tipo de motor
- Cantidad de asientos (aviones de carga tienen 0)

### Tipos de aviones:

- ✈️ **Comercial**: cantidad de azafatas + lista de servicios
- 🛩️ **Privado**: jacuzzi (true/false) + clave de wifi
- 🚚 **De carga**: capacidad de kilos + lista de productos
- 💣 **Militar**: sistema de armas (aire-aire o aire-tierra) + cantidad de balas

### Acciones comunes:

- Todos los aviones: `despegan()`, `aterrizan()`, `vuelan()`
- Comercial y Privado: `servirComida()`, `darManta()`
- Solo Privado: `verMundial()`
- Militar y DeCarga: `ingresar()` (devuelve true/false)
- DeCarga: `descargarContenido()`

### Reglas especiales:

- Si se supera la capacidad del aeropuerto, no se permite ingresar el avión (se lanza mensaje).
- Crear un método para hacer **despegar todos los aviones** de un hangar determinado.

---

🧪 Este ejercicio fue diseñado para practicar herencia, polimorfismo y clases genéricas en Java.

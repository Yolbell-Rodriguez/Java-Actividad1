package com.example.demo;
/*
* Los platos tendrán un nombre, precio y lista de ingredientes. Se podrán clasificar como primeros, segundos o postre.
* Podré dar de alta, editar, baja los platos así como manipular sus ingredientes. También podré filtrar por primero,
* segundo o postre o buscar por un ingrediente concreto.

Las vistas serían:
Listado de platos con nombre y precio. Esta vista incluye los filtros anteriores. Desde el “item” plato puedo borrarlo,
*ir a editarlo o mostrar la pantalla de detalle.

Vista de detalle del plato con:
Nombre
Precio
Listado de ingredientes
Añadir un plato eligiendo los ingredientes
Editar un plato junto a todas sus propiedades

Más adelante incluiremos la capa de persistencia en la actividad 2. Puedes utilizar el lenguaje de programación que desees entre Java
 (utilizando Spring Boot), PHP (sin frameworks). Es recomendable elaborar un diagrama E/R sólido y ampliable.
*/

import java.util.ArrayList;
import java.util.List;

public class Plato {
    private String plato;
    private double precio;
    private String tipo;

    @Override
    public String toString() {
        return "Plato{" +
                "plato='" + plato + '\'' +
                ", precio=" + precio +
                '}';
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
/*
    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void addIngrediente(Ingredientes i) { ingredientes.add(i);

    }
    public void removeIngrediente(Ingredientes i) { ingredientes.remove(i);

    }
    */
}

package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Plato {
    private String nombre;
    private double precio;
    private TipoPlatos tipo;
    private List<String> ingredientes = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoPlatos getTipo() {
        return tipo;
    }

    public void setTipo(TipoPlatos tipo) {
        this.tipo = tipo;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Plato{nombre='" + nombre + "', precio=" + precio +
                ", tipo=" + tipo + ", ingredientes=" + ingredientes + '}';
    }
}

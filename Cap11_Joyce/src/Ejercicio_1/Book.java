/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

/**
 *
 * @author Admin
 */
public abstract class Book {
      private String nombre;
    private Double precio;

    public Book(String nomrbe) {
        this.nombre = nomrbe;
        this.precio = setPrecio();
    }

    public String getNomrbe() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public abstract Double setPrecio();

    @Override
    public String toString() {
        return "Book{" +
                "nomrbe='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}

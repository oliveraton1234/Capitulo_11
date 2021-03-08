/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

/**
 *
 * @author Admin
 */
public abstract class Auto {
     private String Marca;
    private Integer precio;

    public Auto(String a){
        this.Marca = a;
        this.precio = setPrecio();
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Integer getPrecio() {
        return precio;
    }

    public abstract Integer setPrecio();   
}

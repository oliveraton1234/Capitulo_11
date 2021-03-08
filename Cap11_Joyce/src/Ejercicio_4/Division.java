/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

/**
 *
 * @author Admin
 */
public abstract class Division {
  private String nombre;
    private Integer noCuenta;

    public Division(String nombre, Integer noCuenta) {
        this.nombre = nombre;
        this.noCuenta = noCuenta;
    }

    public abstract void visualizacion();   
}

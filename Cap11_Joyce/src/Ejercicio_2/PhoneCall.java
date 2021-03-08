/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

/**
 *
 * @author Admin
 */
public class PhoneCall {
     private String noTelefono;
    private Double precioXLlamada;

    public PhoneCall(String noTelefono) {
        this.noTelefono = noTelefono;
        this.precioXLlamada = precio();
    }

    public abstract Double precio();

    public abstract Double noTelefono();

    public abstract Double info();

    @Override
    public String toString() {
        return "PhoneCall{" +
                "noTelefono='" + noTelefono + '\'' +
                ", precioXLlamada=" + precioXLlamada +
                '}';
    }
}

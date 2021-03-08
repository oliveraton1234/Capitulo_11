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
public class DomesticDivision extends Division{
    private String estado;

    public DomesticDivision(String nombre, Integer noCuenta, String estado) {
        super(nombre, noCuenta);
        this.estado = estado;
    }

    @Override
    public void visualizacion() {
        System.out.println("DomesticDivision{" +
                "estado='" + estado + '\'' +
                '}');
    }
}

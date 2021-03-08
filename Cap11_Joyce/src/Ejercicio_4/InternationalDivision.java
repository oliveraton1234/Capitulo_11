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
public class InternationalDivision extends Division{
 private String pais;
    private String idioma;
    public InternationalDivision(String nombre, Integer noCuenta, String pais, String x) {
        super(nombre, noCuenta);
        this.pais = pais;
        this.idioma = x;
    }

    @Override
    public void visualizacion() {
        System.out.println("InternationalDivision{" +
                "pais='" + pais + '\'' +
                ", idioma='" + idioma + '\'' +
                '}');
    }    
}

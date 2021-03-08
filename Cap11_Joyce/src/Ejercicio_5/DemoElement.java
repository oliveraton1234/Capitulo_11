/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_5;

/**
 *
 * @author Admin
 */
public class DemoElement {

    public static void main(String[] args) {
        Element a = new MetalElement("A",15,65.6);
        a.describeElement();

        Element b = new NonMetalElement("b",65,654.6);
        b.describeElement();

    }   
}

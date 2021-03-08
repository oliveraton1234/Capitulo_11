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
public class MetalElement extends Element{
  public MetalElement(String simbolo, Integer noAtomico, Double pesoAtomico) {
        super(simbolo, noAtomico, pesoAtomico);
    }

    @Override
    public void describeElement() {
        System.out.println("Los metales son buenos conductores de electricidad");
    }   
}

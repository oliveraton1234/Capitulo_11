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
public class Element {
     private String simbolo;
    private  Integer noAtomico;
    private Double pesoAtomico;

    public abstract void describeElement();

    public Element(String simbolo, Integer noAtomico, Double pesoAtomico) {
        this.simbolo = simbolo;
        this.noAtomico = noAtomico;
        this.pesoAtomico = pesoAtomico;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public Integer getNoAtomico() {
        return noAtomico;
    }

    public Double getPesoAtomico() {
        return pesoAtomico;
    }
}

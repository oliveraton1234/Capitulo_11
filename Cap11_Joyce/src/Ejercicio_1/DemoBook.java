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
public class DemoBook {

    public static void main(String[] args) {
        Book a = new Fiction("TITULO");
        System.out.println(a.toString());

        Book b = new NoFiction("LIBRO");
        System.out.println(b.toString());

    }
    
}

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
public class OutgoingPhoneCall extends PhoneCall{
    public OutgoingPhoneCall(String noTelefono) {
        super(noTelefono);
    }

    @Override
    public Double precio() {
        return null;
    }

    @Override
    public Double noTelefono() {
        return null;
    }

    @Override
    public Double info() {
        return null;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2adonysmercadal;

/**
 *
 * @author adony
 */
public class FireType extends Pokemon {
    int poderLlamas;
     
    public FireType(int poderLlamas, String nombre, int numPoke, String naturaleza, boolean atrapado) {
        super(nombre, numPoke, naturaleza, atrapado);
        this.poderLlamas = poderLlamas;
    }
    
}

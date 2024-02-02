/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2adonysmercadal;

/**
 *
 * @author adony
 */
public class WaterType extends Pokemon{
    boolean puedeVivirTierra;
    int velocidadNadar;

    public WaterType(boolean puedeVivirTierra, int velocidadNadar, String nombre, int numPoke, String naturaleza, boolean atrapado) {
        super(nombre, numPoke, naturaleza, atrapado);
        this.puedeVivirTierra = puedeVivirTierra;
        this.velocidadNadar = velocidadNadar;
    }

    
}

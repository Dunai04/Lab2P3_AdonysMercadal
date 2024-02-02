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

    public boolean isPuedeVivirTierra() {
        return puedeVivirTierra;
    }

    public void setPuedeVivirTierra(boolean puedeVivirTierra) {
        this.puedeVivirTierra = puedeVivirTierra;
    }

    public int getVelocidadNadar() {
        return velocidadNadar;
    }

    public void setVelocidadNadar(int velocidadNadar) {
        this.velocidadNadar = velocidadNadar;
    }

    @Override
    public String toString() {
        return super.toString()+"Puede vivir en el Agua?: "+puedeVivirTierra+"Velocidad de natacion: "+velocidadNadar;
    }

    
}

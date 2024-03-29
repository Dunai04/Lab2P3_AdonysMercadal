/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2adonysmercadal;

/**
 *
 * @author adony
 */
public class GrassType extends Pokemon {
    String habitat;
    int dominioPlantas;

    public GrassType(String habitat, int dominioPlantas, String nombre, int numPoke, String naturaleza, boolean atrapado) {
        super(nombre, numPoke, naturaleza, atrapado);
        this.habitat = habitat;
        this.dominioPlantas = dominioPlantas;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getDominioPlantas() {
        return dominioPlantas;
    }

    public void setDominioPlantas(int dominioPlantas) {
        this.dominioPlantas = dominioPlantas;
    }

    @Override
    public String toString() {
        return super.toString()+"habitat: " + habitat + ", dominio de Plantas: " + dominioPlantas;
    }

}

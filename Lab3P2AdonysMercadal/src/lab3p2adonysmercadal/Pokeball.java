/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2adonysmercadal;

import java.util.ArrayList;

/**
 *
 * @author adony
 */
public class Pokeball {
   
    protected String Color;
    protected String numeroDeSerie;
    protected int eficiencia;

    public Pokeball(String Color, String numeroDeSerie, int eficiencia) {
        this.Color = Color;
        this.numeroDeSerie = numeroDeSerie;
        this.eficiencia = eficiencia;
    }

    @Override
    public String toString() {
        return "Pokeball{" + "Color: " + Color + ", Numero: " + numeroDeSerie + ", Eficiencia: " + eficiencia + '}';
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2adonysmercadal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author adony
 */
public class Pokemon {
    
    protected String nombre;
    protected int numPoke;
    protected String naturaleza;
    protected boolean atrapado;
    protected Pokeball pokeBola;

    public Pokemon(String nombre, int numPoke, String naturaleza, boolean atrapado) {
        this.nombre = nombre;
        this.numPoke = numPoke;
        this.naturaleza = naturaleza;
        this.atrapado = atrapado;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPoke() {
        return numPoke;
    }

    public void setNumPoke(int numPoke) {
        this.numPoke = numPoke;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public boolean isAtrapado() {
        return atrapado;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }

    public Pokeball getPokeBola() {
        return pokeBola;
    }

    public void setPokeBola(Pokeball pokeBola) {
        this.pokeBola = pokeBola;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "Nombre: " + nombre + ", Numero: " + numPoke + ", Naturaleza: " + naturaleza + ", Atrapado: " + atrapado + ", Pokebola: " + pokeBola + '}';
    }

   
}

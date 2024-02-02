/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2adonysmercadal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adony
 */
public class Lab3P2AdonysMercadal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pokemon> listaPokemon = new ArrayList();
        ArrayList<Pokeball> listaPokeballs = new ArrayList();
        Scanner s = new Scanner(System.in);
        int entrar = 1;
        while (entrar == 1) {
            System.out.println("Menu Principal");
            System.out.println("1.Crear Pokemon");
            System.out.println("2.Crear Pokebola");
            System.out.println("3.Listar Pokemon");
            System.out.println("4.Eliminar Pokemon");
            System.out.println("5.Capturar Pokemon");
            System.out.println("6.Modificar Pokemon");
            System.out.println("7.Salir");
            int opc = s.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Creacion de Pokemon");
                    break;
                case 2:
                    System.out.println("Creacion de Pokebola");
                    break;
                case 3:
                    System.out.println("Listar Pokemons");
                    break;
                case 4:
                    System.out.println("Eliminar Pokemon");
                    break;
                case 5:
                    System.out.println("Capturar Pokemon");
                    break;
                case 6:
                    System.out.println("Modificar Pokemon");
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    entrar += 3;
            }
        }
    }

}

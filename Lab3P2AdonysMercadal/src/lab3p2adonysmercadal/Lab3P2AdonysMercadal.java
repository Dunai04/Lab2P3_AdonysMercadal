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
public static ArrayList<Pokemon> listaPokemon = new ArrayList();
public static  ArrayList<Pokeball> listaPokeballs = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
                    anadirP();
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
    static void anadirP(){
        String naturaleza ="";
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del pokemon");
        String nombre = n.nextLine();
        System.out.println("Ingrese el numero del pokemon");
        int num = n.nextInt();
        System.out.println("Ingrese La naturaleza del pokemon");
        System.out.println("1.Timido,2.Energetico,3.Misterioso");
        int opc = n.nextInt();
        switch (opc){
            case 1:
                   naturaleza = "Timido";
                   break;
            case 2:
                   naturaleza = "Energetico";
                   break;
            case 3:
                  naturaleza = "Misteriosos";
                  break;
            default:
                System.out.println("No es una opcion");
                break;
        }
        System.out.println("Ingrese el tipo del pokemon");
        System.out.println("1.Fuego,2.Agua,3.Planta");
        int opc2 = n.nextInt();
        switch(opc2){
            case 1:
                System.out.println("Fuego");
                System.out.println("Ingrese el poder de las llamas (numero)");
                int poder = n.nextInt();
                Pokemon nuevoP = new FireType(poder, nombre, num, naturaleza, false);
                listaPokemon.add(nuevoP);
                break;
            case 2:
                System.out.println("Agua");
                System.out.println("Puede vivir fuera del agua? y/n");
                String opc3;
                switch (){
                    case "y":
                        boolean vivirF = true;
                        break;
                }
                break;
            case 3:
                System.out.println("Planta");
                break;
            default:
                System.out.println("Opcion no existe");
                break;
        }
    }
}

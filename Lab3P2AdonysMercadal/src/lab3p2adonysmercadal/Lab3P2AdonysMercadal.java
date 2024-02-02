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
    public static ArrayList<Pokeball> listaPokeballs = new ArrayList();

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
                    listarP();
                    break;
                case 4:
                    System.out.println("Eliminar Pokemon");
                    if (listaPokemon.isEmpty()) {
                        System.out.println("La lista esta vacia");
                        break;
                    }
                    eliminarL();
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

    static void anadirP() {
        String naturaleza = "";
        boolean vivirF = false;
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del pokemon");
        String nombre = n.nextLine();
        System.out.println("Ingrese el numero del pokemon");
        int num = n.nextInt();
        System.out.println("Ingrese La naturaleza del pokemon");
        System.out.println("1.Timido,2.Energetico,3.Misterioso");
        int opc = n.nextInt();
        switch (opc) {
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
        switch (opc2) {
            case 1:
                System.out.println("Fuego");
                System.out.println("Ingrese el poder de las llamas (numero)");
                int poder = n.nextInt();
                Pokemon nuevoP = new FireType(poder, nombre, num, naturaleza, false);
                listaPokemon.add(nuevoP);
                System.out.println("Pokemon anadido");
                break;
            case 2:
                System.out.println("Agua");
                System.out.println("Puede vivir fuera del agua? y/n");
                n.nextLine();
                String opc3 = n.nextLine();
                switch (opc3) {
                    case "y":
                        vivirF = true;
                        break;
                    case "n":
                        vivirF = false;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
                System.out.println("Ingrese rapidez al nadar(numero)");
                int rapidezN = n.nextInt();
                nuevoP = new WaterType(vivirF, rapidezN, nombre, num, naturaleza, false);
                listaPokemon.add(nuevoP);
                System.out.println("Pokemon anadido");
                break;
            case 3:
                System.out.println("Planta");
                System.out.println("Ingrese el habitat del pokemon");
                n.nextLine();
                String habitat = n.nextLine();
                System.out.println("Ingrese el domino de las plnatas (0-100)");
                int dominoP = n.nextInt();
                if (dominoP > 100 || dominoP < 0) {
                    System.out.println("Rango no valido");
                    break;
                }
                nuevoP = new GrassType(habitat, dominoP, nombre, num, naturaleza, false);
                listaPokemon.add(nuevoP);
                System.out.println("Pokemon anadido");
                break;
            default:
                System.out.println("Opcion no existe");
                break;
        }
    }

    static void crearPokebola() {

    }

    static void listarP() {
        System.out.println("Lista de Pokemons");
        System.out.println("Pokemon Tipo Fuego");
        for (Pokemon t : listaPokemon) {
            if (t instanceof FireType) {
                System.out.println(listaPokemon.indexOf(t) + "-" + t);
            }

        }
        System.out.println("Pokemon Tipo Agua");
        for (Pokemon t : listaPokemon) {
            if (t instanceof WaterType) {
                System.out.println(listaPokemon.indexOf(t) + "-" + t);
            }

        }
        System.out.println("Pokemon Tipo Planta");
        for (Pokemon t : listaPokemon) {
            if (t instanceof GrassType) {
                System.out.println(listaPokemon.indexOf(t) + "-" + t);
            }

        }
    }

    static void eliminarL() {
        Scanner n = new Scanner(System.in);
        System.out.println("Que tipo de pokemon quiere eliminar:\n"
                + "1.Fuego,2.Agua,3.Planta");
        int opc = n.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Pokemon Tipo Fuego");
                for (Pokemon t : listaPokemon) {
                    if (t instanceof FireType) {
                        System.out.println(listaPokemon.indexOf(t) + "-" + t);
                    }

                }
                elimina();
                break;
            case 2:
                System.out.println("Pokemon Tipo Agua");
                for (Pokemon t : listaPokemon) {
                    if (t instanceof WaterType) {
                        System.out.println(listaPokemon.indexOf(t) + "-" + t);
                    }

                }
                elimina();
                break;
            case 3:
                System.out.println("Pokemon Tipo Planta");
                for (Pokemon t : listaPokemon) {
                    if (t instanceof GrassType) {
                        System.out.println(listaPokemon.indexOf(t) + "-" + t);
                    }

                }
                elimina();
                break;
        }

    }

    static void elimina() {
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese el numero del pokemon que quiera eliminar");
        int indi = n.nextInt();
        if (indi >= 0 && indi < listaPokemon.size()) {
            Pokemon eliminado = listaPokemon.remove(indi);
            System.out.println("Has eliminado a " + eliminado + " del pokedex " + indi);
        } else {
            System.out.println("No valido");
        }
    }
}

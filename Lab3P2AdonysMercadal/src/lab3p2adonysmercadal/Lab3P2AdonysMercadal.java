/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2adonysmercadal;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author adony
 */
public class Lab3P2AdonysMercadal {
//carlos uwu

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
                    crearBOLASBB();
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
                    Scanner n = new Scanner(System.in);
                    System.out.println("Capturar Pokemon");
                    if (listaPokeballs.isEmpty()) {
                        System.out.println("No hay BOLAS en el inventario");
                        break;
                    }
                    listarBOLAS();//hehehe BOLAS
                    System.out.println("Selecciona la pokebola");
                    int indi = n.nextInt();
                    Pokeball bolaSele = listaPokeballs.get(indi);
                    Pokemon randomPokemon;
                    do {
                        randomPokemon = listaPokemon.get(new Random().nextInt(listaPokemon.size()));
                    } while (randomPokemon.isAtrapado());
                    System.out.println("El pokemon " + randomPokemon.getNombre() + " ha aparcido");
                    System.out.println("¿Quieres usar la pokeBOLA para capturar o huir? (1 capturar/ 2 huir)");
                    int opc2 = n.nextInt();
                    switch (opc2) {
                        case 1:
                            int posi = new Random().nextInt(3) + 1;
                            if (posi <= bolaSele.getEficiencia()) {
                                randomPokemon.setAtrapado(true);
                                randomPokemon.setPokeBola(bolaSele);
                                System.out.println("Has atrapado a " + randomPokemon.getNombre());
                                System.out.println("Q pro");
                                break;
                            } else {
                                System.out.println("No se pudo atrapar a " + randomPokemon.getNombre());
                            }
                            listaPokeballs.remove(indi);
                            break;
                        case 2:
                            System.out.println("A la proxima bro :(");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Modificar Pokemon");
                    if (listaPokemon.isEmpty()) {
                        System.out.println("No hay Pokemons en la lista");
                        break;
                    }
                    modificarP();
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
        ArrayList<Pokemon> listaSeleccionada = new ArrayList<>();
        switch (opc) {
            case 1:
                System.out.println("Pokemon Tipo Fuego");
                for (Pokemon t : listaPokemon) {
                    if (t instanceof FireType) {
                        listaSeleccionada.add(t);
                        System.out.println(listaSeleccionada.indexOf(t) + "-" + t);
                    }
                }
                break;
            case 2:
                System.out.println("Pokemon Tipo Agua");
                for (Pokemon t : listaPokemon) {
                    if (t instanceof WaterType) {
                        listaSeleccionada.add(t);
                        System.out.println(listaSeleccionada.indexOf(t) + "-" + t);
                    }
                }
                break;
            case 3:
                System.out.println("Pokemon Tipo Planta");
                for (Pokemon t : listaPokemon) {
                    if (t instanceof GrassType) {
                        listaSeleccionada.add(t);
                        System.out.println(listaSeleccionada.indexOf(t) + "-" + t);
                    }
                }
                break;
        }
        elimina(listaSeleccionada);
    }

    static void elimina(ArrayList<Pokemon> listaSeleccionada) {
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese el numero del pokemon que quiera eliminar");
        int indi = n.nextInt();
        if (indi >= 0 && indi < listaSeleccionada.size()) {
            Pokemon eliminado = listaSeleccionada.remove(indi);
            listaPokemon.remove(eliminado);
            System.out.println("Has eliminado a " + eliminado + " del pokedex " + indi);
        } else {
            System.out.println("No valido");
        }
    }

    static void crearBOLASBB() {
        Scanner n = new Scanner(System.in);
        System.out.println("Ingresar el color de la pokeBOLA");
        String color = n.nextLine();
        System.out.println("Ingresar el numero de serie de la bola");
        String numeroS = n.nextLine();//ojito un numero de serie puede contener letras tambien :)
        System.out.println("Ingresar el nivel de eficiencia(1-3)");
        int efi = n.nextInt();
        if (efi > 3 || efi < 1) {
            System.out.println("Nivel de eficiencia invalido");
            return;
        }
        Pokeball nuevaBOLA = new Pokeball(color, numeroS, efi);
        listaPokeballs.add(nuevaBOLA);
    }

    static void listarBOLAS() {
        for (Pokeball t : listaPokeballs) {
            if (t instanceof Pokeball) {
                System.out.println(listaPokeballs.indexOf(t) + "-" + t);
            }
        }
    }

    static void modificarP() {
        boolean vivirF = true;
        listarP();
        Scanner n = new Scanner(System.in);
        System.out.println("Seleccione el pokemon a modificar");
        int indice = n.nextInt();
        if (!listaPokemon.get(indice).isAtrapado()) {
            System.out.println("El pokemon no esta atrapado aun");
        } else {
            if (listaPokemon.get(indice) instanceof FireType) {
                System.out.println("Modificaciones disponibles");
                System.out.println("1.Nombre");
                System.out.println("2.Numero de Entrada de pokedex");
                System.out.println("3.Potencia de llamas");
                int opc3 = n.nextInt();
                switch (opc3) {
                    case 1:
                        System.out.println("Ingrese el nuevo nombre");
                        n.nextLine();
                        String nombre = n.nextLine();
                        listaPokemon.get(indice).setNombre(nombre);
                        break;
                    case 2:
                        System.out.println("Ingrese el nuevo numero del pokedex");
                         n.nextInt();
                        int numP = n.nextInt();
                        listaPokemon.get(indice).setNumPoke(numP);
                        break;
                    case 3:
                        System.out.println("Ingresa la nueva potencia de flamas");
                        int nPoten= n.nextInt();
                }
            }
            if (listaPokemon.get(indice) instanceof WaterType) {
                System.out.println("Modificaciones disponibles");
                System.out.println("1.Nombre");
                System.out.println("2.Numero de Entrada de pokedex");
                System.out.println("3.Vivir fuera del agua");
                int opc3 = n.nextInt();
                switch (opc3) {
                    case 1:
                        System.out.println("Ingrese el nuevo nombre");
                        n.nextLine();
                        String nombre = n.nextLine();
                        listaPokemon.get(indice).setNombre(nombre);
                        break;
                    case 2:
                        System.out.println("Ingrese el nuevo numero del pokedex");
                        n.nextInt();
                        int numP = n.nextInt();
                        listaPokemon.get(indice).setNumPoke(numP);
                        break;
                    case 3:
                        System.out.println("Puede vivir fuera del agua? y/n");
                        n.nextLine();
                        String opc4 = n.nextLine();
                        switch (opc4) {
                            case "y":
                                vivirF = true;
                                break;
                            case "n":
                                vivirF = false;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                }
            }
            if (listaPokemon.get(indice) instanceof GrassType) {
                System.out.println("Modificaciones disponibles");
                System.out.println("1.Nombre");
                System.out.println("2.Numero de Entrada de pokedex");
                System.out.println("3.Habitat");
                int opc3 = n.nextInt();
                switch (opc3) {
                    case 1:
                        System.out.println("Ingrese el nuevo nombre");
                        n.nextLine();
                        String nombre = n.nextLine();
                        listaPokemon.get(indice).setNombre(nombre);
                        break;
                    case 2:
                        System.out.println("Ingrese el nuevo numero del pokedex");
                         n.nextInt();
                        int numP = n.nextInt();
                        listaPokemon.get(indice).setNumPoke(numP);
                        break;
                    case 3:
                        System.out.println("Ingresa el nuevo nombre del habitat");
                        String nombreH= n.nextLine();
                }
            }
        }

    }

}

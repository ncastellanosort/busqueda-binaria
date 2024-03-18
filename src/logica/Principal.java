/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Principal {
    
    Scanner in = new Scanner(System.in);

    boolean cond = true;
    
    Lista procesosLista = new Lista();

    public void Menu() {

        do {

            System.out.println("\n-----------------------\n");
//            System.out.println("1. Elegir tamano array");
            System.out.println("2. Rellenar Array");
            System.out.println("3. Seleccionar elemento a buscar");
            System.out.println("5. Salir");

            System.out.println("\n-----------------------\n");

            System.out.println("Seleccione la opcion: ");
            int opc = in.nextInt();

            switch (opc) {

                case 1:
                    System.out.println("\nIngrese el tamano del array: ");
                    int tamano = in.nextInt();
                    procesosLista.setTamano(tamano);
                    break;

                case 2:
                    procesosLista.llenarLista();
                    break;

                case 3:
                    procesosLista.seleccionarElemento();
                    System.out.println(procesosLista.getTamano());
                    break;

                case 4:
                    System.out.println("\nElementos:\n");
//                    procesosLista.mostarLista();
                   
                    break;

                case 5:
                    System.out.println("Hasta luego");
                    cond = false;
                    break;

                default:
                    System.out.println("\nIngrese una opcion correcta\n");
                    break;

            }
        } while (cond);

    }
}

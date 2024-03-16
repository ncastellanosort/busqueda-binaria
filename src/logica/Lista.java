/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class Lista {

    Random random = new Random();

    private int tamano;

    private int elemento;

    public int getElem() {
        return elemento;
    }

    public void setElem(int elemento) {
        this.elemento = elemento;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    private int lista[] = new int[tamano];

    public Lista() {
        this.tamano = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique la cantidad de elementos: "));
        this.lista = new int[tamano];
    }

    public void llenarLista() {

        System.out.println();

        for (int i = 0; i < lista.length; ++i) {

            lista[i] = random.nextInt(0,tamano);

        }

        Arrays.sort(lista);

        JOptionPane.showMessageDialog(null, "Lista rellenada exitosamente");

    }

    public void seleccionarElemento() {
        int elem = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el elemento a buscar: "));

        setElem(elem);

        long inicio = System.currentTimeMillis();
        long end = System.currentTimeMillis();

        long tiempo = end - inicio;

        int busq = Arrays.binarySearch(lista, elemento);

        if (busq > 0) {
            JOptionPane.showMessageDialog(null, "Elemento [" + elem + "] encontrado en la posicion [" + Arrays.binarySearch(lista, elemento) + "] en " + tiempo + "ms");

        } else {
            JOptionPane.showMessageDialog(null, "Elemento no encontrado");
        }

    }

    public void mostarLista() {
        for (int numero : lista) {
            System.out.println(numero);
        }

    }

}

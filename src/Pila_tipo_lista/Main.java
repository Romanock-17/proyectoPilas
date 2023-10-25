package Pila_tipo_lista;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcion, dato;
        Pila nuevaPila1 = new Pila(5);
        Pila nuevaPila2 = new Pila(5);
        do {
            String menu = "Menú:\n" +
                    "1. Estado Pila (Llena o Vacia) \n" +
                    "2. Insertar en pila\n" +
                    "3. Insertar ordenado \n" +
                    "4. Mostrar Pila\n" +
                    "5. Buscar en pila\n" +
                    "6. Ordenar Pila \n" +
                    "7. Sumar pilas\n" +
                    "8. Salir";
            String metodo = JOptionPane.showInputDialog(null, menu, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
            opcion = Integer.parseInt(metodo);

            switch (opcion) {
                case 1:
                    if (nuevaPila1.pilaVacia()) {
                        JOptionPane.showMessageDialog(null, "La pila está vacía");
                    } else {
                        JOptionPane.showMessageDialog(null, "La pila no está vacía");

                    }
                    break;
                case 2:
                    String listaInput = JOptionPane.showInputDialog("¿En que pila desea insertar?:\n" +
                            "1. Pila 1\n" +
                            "2. Pila 2\n" );
                    int opc = Integer.parseInt(listaInput);
                    String datoInput = JOptionPane.showInputDialog("Ingrese el dato");
                    dato = Integer.parseInt(datoInput);
                    if (opc == 1) nuevaPila1.insertarInicio(dato);
                    if (opc == 2) nuevaPila2.insertarInicio(dato);
                    break;
                case 3:
                    String Insertarordenado = "¿En qué pila desea insertar ordenado?\n" +
                            "1. Pila 1\n" +
                            "2. Pila 2\n";
                    String opcioninsertarordenado = JOptionPane.showInputDialog(null, Insertarordenado, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
                    int insertarOrde = Integer.parseInt(opcioninsertarordenado);
                    String listainsertarordando = JOptionPane.showInputDialog("Ingrese el dato");
                    dato = Integer.parseInt(listainsertarordando);
                    if (insertarOrde == 1) nuevaPila1.insertarOrdenado(dato);
                    if (insertarOrde == 2) nuevaPila2.insertarOrdenado(dato);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Lista 1:\n");
                    nuevaPila1.Mostrar();
                    JOptionPane.showMessageDialog(null, "Lista 2:\n");
                    nuevaPila2.Mostrar();
                    break;

                case 5:
                    String buscar = JOptionPane.showInputDialog("Dato a buscar");
                    int busqueda = Integer.parseInt(buscar);
                    boolean ecnontrado = nuevaPila1.Buscar(busqueda);
                    if (ecnontrado) {
                        JOptionPane.showMessageDialog(null, "Dato encontrado");
                    } else if (!ecnontrado){
                        JOptionPane.showMessageDialog(null, "Dato no encontrado");
                    }
                    break;
                case 6:
                    String ordenar = "¿Qué pila desea ordenar?\n" +
                            "1. Pila 1\n" +
                            "2. Pila 2\n";
                    String opcionordenar = JOptionPane.showInputDialog(null, ordenar, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
                    int listaordenar = Integer.parseInt(opcionordenar);
                    if (listaordenar == 1) nuevaPila1.ordenarPila();
                    if (listaordenar == 2) nuevaPila2.ordenarPila();
                    break;
                case 7:
                    Pila nuevaPila3 = new Pila(5);
                    JOptionPane.showMessageDialog(null, "La suma de listas es: ");
                    nuevaPila3.sumarPilas(nuevaPila1, nuevaPila2);
                    nuevaPila3.Mostrar();
                    break;

                case 8:
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Salir");
                    break;

            }
        } while (opcion != 9);
    }
}



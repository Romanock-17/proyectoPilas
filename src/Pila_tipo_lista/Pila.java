package Pila_tipo_lista;

import javax.swing.*;

public class Pila {

    private Nodo punta;
    public int limite, tope;

    public Pila (int tam) {
        this.limite = tam - 1;
        this.tope = -1;
        this.punta = null;
    }

    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        tope++;
        nuevo.setDato(dato);
        if (this.punta != null) nuevo.setLiga(this.punta);
        this.punta = nuevo;
    }

    public boolean pilaVacia() {
        return tope <= -1;
    }

    public boolean pilaLlena() {
        return tope == limite;
    }

    public void apilar(int d) {
        insertarInicio(d);
    }

    public int desapilar() {
        Nodo P = punta;
        tope--;
        int r = punta.getDato();
        punta = punta.getLiga();
        P.setLiga(null);
        return (r);
    }

    public void llenarPila(Pila PA) {
        int r;
        while (!PA.pilaVacia()) {
            r = PA.desapilar();
            apilar(r);
        }
    }

    public void Mostrar() {
        Nodo aux = punta;
        String mostrar = "";
        while (aux != null) {
            mostrar += aux.getDato() + "\n";
            aux = aux.getLiga();

        }
        JOptionPane.showMessageDialog(null, mostrar);
        mostrar = "";
    }

    public boolean Buscar(int d) {
        Pila A = new Pila(this.limite);
        boolean encontrado = false;

        while ( punta.getDato() != d && !pilaVacia()) {
            A.apilar(desapilar());
        }
        llenarPila(A);
        if (punta.getDato() == d && !pilaVacia()) encontrado = true;

        return encontrado;
    }

    public void ordenarPila() {
        Pila pilaA = new Pila(this.limite);
        Pila pilaB = new Pila(this.limite);
        int Acum = 0;

        while (!pilaVacia()) {
            if (Acum == 0) {
                pilaA.apilar(desapilar());
                Acum = 1;
            } else {
                if (punta.getDato() > pilaA.punta.getDato()) {
                    while (!pilaA.pilaVacia() && punta.getDato() > pilaA.punta.getDato()) {
                        pilaB.apilar(pilaA.desapilar());
                    }
                    pilaA.apilar(desapilar());
                    while (!pilaB.pilaVacia()) {
                        pilaA.apilar(pilaB.desapilar());
                    }
                } else {
                    pilaA.apilar(desapilar());
                }
            }
        }
        llenarPila(pilaA);
    }


    public void insertarOrdenado(int d){
        Pila Aux= new Pila(this.limite);
        while (!pilaVacia() && punta.getDato() > d){
                Aux.apilar(desapilar());
        }
        apilar(d);
        while (!Aux.pilaVacia()) {
            apilar(Aux.desapilar());
        }
    }

    public void sumarPilas(Pila A, Pila B){
        Pila aux = new Pila(this.limite);
        int r, s,suma;
        while (!A.pilaVacia() && !B.pilaVacia()){
            r = A.desapilar();
            s = B.desapilar();
            suma=s+r;
            apilar(suma);
        }
    }

}




























package Pila_tipo_lista;

    public class Nodo {
            //Atributos
            private int Dato;
            private Nodo Liga;


        //Metodos

        public Nodo(int dato) {
            this.Dato = dato;
            this.Liga = null;
        }

        public Nodo(int dato, Nodo liga) {
            Dato = dato;
            Liga = liga;
        }

        public int getDato() {
            return Dato;
        }

        public void setDato(int dato) {
            Dato = dato;
        }

        public Nodo getLiga() {
            return Liga;
        }

        public void setLiga(Nodo liga) {
            Liga = liga;
        }
    }
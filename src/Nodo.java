public class Nodo {

    private Nodo padre;
    private Nodo derecho;
    private Nodo izquierdo;

    private int indice;
    private String nombre;

    public Nodo(int indice, String nombre){
        this.nombre = nombre;
        this.indice = indice;

        padre = null;
        derecho = null;
        izquierdo = null;
    }

    public void mostrarNodo(){
        System.out.println("Indice: "+indice+" nombre: "+nombre);
    }

    public Nodo getPadre() {
        return padre;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public int getIndice() {
        return indice;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
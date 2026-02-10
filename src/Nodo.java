public class Nodo{
    private Nodo padre;
    private Nodo izquierdo;
    private Nodo derecho;

    private int indice;
    private String nombre;


    public Nodo(int indice, String nombre){
        this.nombre = nombre;
        this.indice = indice;
        padre = null;
        izquierdo = null;
        derecho = null;
    }

    public void mostrarNodo(){
        System.out.println("Indice: "+indice+" Nombre: "+nombre);
    }

    public Nodo getPadre() {
        return padre;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
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

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
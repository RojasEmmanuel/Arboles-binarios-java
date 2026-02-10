public class Arbol {

    private Nodo raiz;
    private static Arbol arbol = null;

    private Arbol(){
        this.raiz = null;
    }

    //Aplicamos singleton para asegurar que solo haya una instancia del arbol
    public static Arbol getInstance(){
        if(arbol == null) arbol = new Arbol();
        return arbol;
    }

    public void addNodo(int indice, String nombre){
        Nodo nodo = new Nodo(indice, nombre);

        if(raiz == null){
            raiz = nodo;
        }else{

            Nodo aux = raiz;
            while(aux != null){
                nodo.setPadre(aux);

                if(nodo.getIndice() < aux.getIndice()){
                    aux = aux.getIzquierdo();
                }else{
                    aux = aux.getDerecho();
                }
            }

            if(nodo.getPadre().getIndice() > nodo.getIndice()){
                nodo.getPadre().setIzquierdo(nodo);
            }else{
                nodo.getPadre().setDerecho(nodo);
            }
        }
    }

    public void recorridoInOrden(){
        System.out.println("\nRecorrido in orden");
        inOrden(raiz);
    }

    public void recorridoPreOrden(){
        System.out.println("\nRecorrido pre orden");
        preOrden(raiz);
    }

    public void recorridoPostOrden(){
        System.out.println("\nRecorrido post orden");
        postOrden(raiz);
    }

    private void inOrden(Nodo nodo){
        if(nodo != null){
            inOrden(nodo.getIzquierdo());
            nodo.mostrarNodo();
            inOrden(nodo.getDerecho());
        }
    }

    private void preOrden(Nodo nodo){
        if(nodo != null){
            nodo.mostrarNodo();
            preOrden(nodo.getIzquierdo());
            preOrden(nodo.getDerecho());
        }
    }

    private void postOrden(Nodo nodo){
        if(nodo != null){
            postOrden(nodo.getIzquierdo());
            postOrden(nodo.getDerecho());
            nodo.mostrarNodo();
        }
    }
}
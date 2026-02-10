public class Arbol {
    Nodo raiz;

    public Arbol(){
        raiz = null;
    }

    public void insertarNodo(int indice, String nombre){
        Nodo nodo = new Nodo(indice, nombre);

        if(raiz == null){
            raiz = nodo;
        }else{
            Nodo aux = raiz;
            while(aux != null){
                nodo.setPadre(aux);

                if(nodo.getIndice() > aux.getIndice()){
                    aux = aux.getDerecho();
                }else{
                    aux = aux.getIzquierdo();
                }
            }

            if(nodo.getPadre().getIndice() < nodo.getIndice()){
                nodo.getPadre().setDerecho(nodo);
            }else{
                nodo.getPadre().setIzquierdo(nodo);
            }
        }


    }

    public void recorridoInOrden(){
        System.out.println("\nRecorrido in orden");
        inOrden(raiz);
    }

    public void recorridoPreOrden(){
        System.out.println("\nRecorrido pre Orden");
        preOrden(raiz);
    }

    public void recorridoPostOrden(){
        System.out.println("\nRecorrido post Orden");
        postOrden(raiz);
    }

    public String buscarNombreConIndice(int indice){

        Nodo aux = raiz;
        while (aux != null){
            if(indice == aux.getIndice()) return aux.getNombre();
            aux = (aux.getIndice() < indice) ? aux.getDerecho() : aux.getIzquierdo();
        }

        return "No existe";
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
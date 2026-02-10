//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Arbol arbol = new Arbol();

    arbol.insertarNodo(5, "Emmanuel");
    arbol.insertarNodo(8, "Mateo");
    arbol.insertarNodo(4,"Juan");
    arbol.insertarNodo(10, "Nadia");
    arbol.insertarNodo(1, "Svetlana");

    arbol.recorridoInOrden();
    arbol.recorridoPreOrden();
    arbol.recorridoPostOrden();

    System.out.println("\n El nombre con indice 130 es: "+arbol.buscarNombreConIndice(130));
}


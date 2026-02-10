//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Arbol.getInstance().addNodo(8, "EMMADEV");
    Arbol.getInstance().addNodo(9, "JUAN");
    Arbol.getInstance().addNodo(2, "MATEO");
    Arbol.getInstance().addNodo(11, "MARCOS");
    Arbol.getInstance().addNodo(16, "LUCAS");
    Arbol.getInstance().addNodo(1, "BERNABE");

    Arbol.getInstance().recorridoInOrden();
    Arbol.getInstance().recorridoPreOrden();
    Arbol.getInstance().recorridoPostOrden();
}


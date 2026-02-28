//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Arbol.getInstance().addNodo(8, "EMMADEV");
    Arbol.getInstance().addNodo(9, "JUAN");
    Arbol.getInstance().addNodo(1, "MARIA");
    Arbol.getInstance().addNodo(3, "JOSE");
    Arbol.getInstance().addNodo(6, "LUIS");

    Arbol.getInstance().recorridoInOrden();
    Arbol.getInstance().recorridoPreOrden();
    Arbol.getInstance().recorridoPostOrden();
}


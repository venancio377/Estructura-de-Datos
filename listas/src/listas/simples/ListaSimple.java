package listas.simples;

/**
 * Definicion de una lista simple
 * @autor Jonathan Venancio Aguilar Hernandez
 * date 15 de octubre del 2026
 */
public class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

    // O(1): no se recorre la lista
    public void insertarInicio(int valor) {
        Nodo t = new Nodo(valor);
        if (cabeza == null) {
            // Lista vacía: el nuevo nodo es el único elemento
            cabeza = t;
        } else {
            t.setSig(cabeza);  
            cabeza = t;         
        }
    }

    public void recorrer() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getValor());
            actual = actual.getSig();
        }
    }
}
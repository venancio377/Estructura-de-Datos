package listas.simples;

/**
 * Prueba de la lista simple
 * @autor Jonathan Venancio Aguilar Hernandez
 * date 15 de octubre del 2026
 */
public class Principal {
    public static void main(String a[]) {
        ListaSimple lista = new ListaSimple();

        System.out.println("Lista vacía:");
        lista.recorrer();

        lista.insertarInicio(30);
        lista.insertarInicio(20);
        lista.insertarInicio(10);

        System.out.println("Lista nueva:");
        lista.recorrer();
    }
}
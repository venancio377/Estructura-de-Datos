package listas.simples;

/**
 * Definicion de un nodo de una lista simple
 * @autor Jonathan Venancio Aguilar Hernandez
 * date 15 de octubre del 2026
 */
public class Nodo {
    private int valor;
    private Nodo sig;

    public Nodo(int valor) {
        this.valor = valor;
        this.sig = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
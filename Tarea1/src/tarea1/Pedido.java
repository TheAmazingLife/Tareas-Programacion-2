package tarea1;

import java.util.ArrayList;

class Pedido {

    private ArrayList<Articulo> pedido;
    public Pedido() {
        pedido = new ArrayList();
    }

    public void addArticulo(Articulo articulo) {
        pedido.add(articulo);
    }

    public Articulo getArticulo(int pos) {
        if (pedido.isEmpty()) {
            return null;
        } else {
            Articulo articulo = pedido.get(pos);
            return articulo;
        }
    }
    public ArrayList<Articulo> getPedido(){
        return pedido;
    }
    public int getSize(){
        return pedido.size();
    }
}

/*
new features:
getSize() devuelve la longitud del pedido
getPedido() devuelve el array list con el pedido
*/
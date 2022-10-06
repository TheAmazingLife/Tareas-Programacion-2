package tarea1;

class Pedido {

    private ArrayList<Articulo> pedido;
    private int size;
    public Pedido() {
        size = 0;
        pedido = new ArrayList();
    }

    public void addArticulo(Articulo articulo) {
        size++;
        pedido.add(articulo);
    }

    public Articulo getArticulo(int cual) {
        if (pedido.isEmpty()) {
            return null;
        } else {
            Articulo articulo = pedido.get(cual);
            return articulo;
        }
    }
    
    public int getSize(){
        return size;
    }
}

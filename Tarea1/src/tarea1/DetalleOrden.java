package tarea1;

class DetalleOrden {

    private int cantidad;
    private float precioTotal;
    private float precioSinIVA;
    private float IVA;
    private float peso;
    
    
    public DetalleOrden(Pedido pedido) {
        cantidad = pedido.getSize();
        precioTotal = 0;
        precioSinIVA = 0;
        IVA = 0;
        peso = 0;
    }
    
    public float calcPrecio(Pedido pedido) {
        Articulo articulo;
        for(int i = 0; i < pedido.getSize(); i++)
        {
            articulo = pedido.getArticulo(i);
            precioTotal += articulo.getPrecio();
        }
        return (float) (precioTotal);
    }
    
    public float calcPrecioSinIVA(Pedido pedido) {
        Articulo articulo;
        for(int i = 0; i < pedido.getSize(); i++)
        {
            articulo = pedido.getArticulo(i);
            precioSinIVA += articulo.getPrecio() * 0.81;
        }
        return  (float) (precioSinIVA);
    }

    public float calcIVA(Pedido pedido) {
        Articulo articulo;
        for(int i = 0; i < pedido.getSize(); i++)
        {
            articulo = pedido.getArticulo(i);
            IVA += articulo.getPrecio() - articulo.getPrecio() * 0.81;
        }
        return  (float) (IVA);
    }

    public float calcPeso(Pedido pedido) {
        Articulo articulo;
        for(int i = 0; i < pedido.getSize(); i++)
        {
            articulo = pedido.getArticulo(i);
            peso += articulo.getPeso();
        }
        return  (float) (peso);
    }
    
    public String toString(){
        return "Detalle de orden:\nCantidad: " + cantidad + "\nPrecio Total: " + precioTotal + "\nPrecio sin IVA: " + precioSinIVA + "\nPeso: " + peso + "\n";
    }
}
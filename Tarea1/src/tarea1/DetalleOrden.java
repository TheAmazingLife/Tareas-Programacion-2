/*
Contructor
DetalleOrden detalleOrden = new DetalleOrden(int cantidad, Articulo articulo);
 */
package tarea1;

class DetalleOrden {

    private final int cantidad;
    private final Articulo articulo;

    public DetalleOrden(int cantidad, Articulo articulo) {
        this.cantidad = cantidad;
        this.articulo = articulo;
    }

    public float calcPrecio() {
        float precioTotal = (float) (articulo.getPrecio() * cantidad);
        return (float) (precioTotal);
    }

    public float calcPrecioSinIVA() {
        float precioSinIVA = (float) (articulo.getPrecio() * 0.81 * cantidad);
        return (float) (precioSinIVA);
    }

    public float calcIVA() {
        float IVA = (float) (articulo.getPrecio() - articulo.getPrecio() * 0.81 * cantidad);
        return (float) (IVA);
    }

    public float calcPeso() {
        float peso = (float) (articulo.getPeso() * cantidad);
        return (float) (peso);
    }

    public String toString() {
        return "Detalle de orden:\nCantidad: " + cantidad + "\nPrecio Total: " + calcPrecio() + "\nPrecio sin IVA: "
                + calcPrecioSinIVA() + "\nIva: " + calcIVA() + "\nPeso: " + calcPeso() + "\n";
    }
}

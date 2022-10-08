package tarea1;

import java.time.LocalDate;

class OrdenCompra {

    private final Cliente cliente;
    private String estado;
    private Pedido pedido;
    protected LocalDate fecha;

    public OrdenCompra(String estado, Pedido pedido, Cliente cliente, int doc) {
        this.fecha = LocalDate.now();
        this.estado = estado;
        this.pedido = pedido;
        this.fecha = LocalDate.now();
        this.cliente = cliente;

        DocTributario docTributario = null;
        switch (doc) {
            case 1:
                docTributario = new Boleta("111", cliente.getRut(), fecha);
                break;
            case 2:
                docTributario = new Factura("111", cliente.getRut(), fecha);
                break;
        }
    }

    // DocTributario docTributario = new DocTributario(String numero, String rut,
    // int fecha);
    DetalleOrden detalleOrden = new DetalleOrden(pedido);

    public float calcPrecioSinIVA() {
        return detalleOrden.calcPrecioSinIVA(pedido);
    }

    public float calcIVA() {
        return detalleOrden.calcIVA(pedido);
    }

    public float calcPrecio() {
        return detalleOrden.calcPrecio(pedido);
    }

    public float calcPeso() {
        return detalleOrden.calcPeso(pedido);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String ToString() {
        String string = cliente.toString();
        string += detalleOrden.ToString();
        return string;
    }
}

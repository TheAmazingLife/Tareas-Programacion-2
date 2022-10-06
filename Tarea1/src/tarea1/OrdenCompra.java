package tarea1;

import Cliente;
import DetalleOrden;
import Pedido;
import java.time.LocalDate;

class OrdenCompra {

    private final Cliente cliente;
    private String estado;
    private Pedido pedido;
    protected LocalDate fecha;
        
    public OrdenCompra(String estado, Pedido pedido, Cliente cliente) {
        this.fecha = LocalDate.now();
        this.estado = estado;
        this.pedido = pedido;
        this.fecha = LocalDate.now();
        this.cliente = cliente;
    }
     //DocTributario docTributario = new DocTributario(String numero, String rut, int fecha); 
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
    public Cliente getCliente(){
        return cliente;
    }
    public String ToString(){
        String string = cliente.toString();
        string += detalleOrden.ToString();
        return string;
    }
}


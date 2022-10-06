package tarea1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tarea1 {

    public static void main(String[] args) {
        
        // para cliente 1
        Pedido pedido1 = new Pedido();
        Articulo articulo1 = new Articulo((float) 0.3,"Oso de peluche","Oso suavecito",4000);
        Articulo articulo2 = new Articulo((float) 0.6,"Celular","nuevo",180000);
        pedido1.addArticulo(articulo1);
        pedido1.addArticulo(articulo2);
        
        Direccion direccion1 = new Direccion("Avenida Siempre Viva, #742");
        Cliente cliente1 = new Cliente("Homero","11.111.111-1",direccion1);
        OrdenCompra ordenCompra1 = new OrdenCompra("PAGADO", pedido1, cliente1);
        
        System.out.println(ordenCompra1.ToString());
        
        
        // para cliente 2
        Pedido pedido2 = new Pedido();
        Articulo articulo3 = new Articulo((float) 0.5,"Perfume","Fragancia floral",25000);
        Articulo articulo4 = new Articulo((float) 0.5,"Polera","nuevo",15000);
        pedido2.addArticulo(articulo3);
        pedido2.addArticulo(articulo4);
        
        Direccion direccion2 = new Direccion("Avenida Siempre Viva, #742");
        Cliente cliente2 = new Cliente("Marge","22.222.222-2",direccion2);
        OrdenCompra ordenCompra2 = new OrdenCompra("PAGADO", pedido2, cliente2);
        
        System.out.println(ordenCompra2.ToString());
        
        // para cliente 3
        Pedido pedido3 = new Pedido();
        Articulo articulo5 = new Articulo((float) 0.8,"Jeans","nuevo",10000);
        pedido3.addArticulo(articulo5);
        
        Direccion direccion3 = new Direccion("Avenida Siempre Viva, #742");
        Cliente cliente3 = new Cliente("Marge","22.222.222-2", direccion3);
        OrdenCompra ordenCompra3 = new OrdenCompra("PAGADO", pedido3, cliente3);
        
        System.out.println(ordenCompra3.ToString());
    }
    
}
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

class Cliente {

    private final String nombre;
    private final String rut;
    private String direccion;
    
    public Cliente(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getRut(){
        return rut;
    }
    public String getDireccion(){
        return direccion;
    }
    
}

class Direccion {
    private String direccion;
    public Direccion(String direccion) {
        this.direccion = direccion;
    }
}

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
    
    public String ToString(){
        return "Detalle de orden:\nCantidad: " + cantidad + "\nPrecio Total: " + precioTotal + "\nPrecio sin IVA: " + precioSinIVA + "\nPeso: " + peso + "\n";
    }
}

class Articulo {

    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;

    public Articulo(float peso, String nombre, String descripcion, float precio) {
        this.peso = peso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public float getPrecio(){
        return precio;
    }
    public float getPeso(){
        return peso;
    }

}

class DocTributario {

    private String numero;
    private String rut;
    private int fecha;

    public DocTributario(String numero, String rut, int fecha) {
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
    }

}

class Boleta extends DocTributario {

    public Boleta() {

    }
}

class Factura extends DocTributario {

    public Factura() {

    }
}

class Pago {

    private float monto;
    private int fecha;

    public Pago(float monto, int fecha) {
        this.monto = monto;
        this.fecha = fecha;
    }
}

class Efectivo extends Pago {

    public Efectivo() {

    }

    public void calcDevolucion() {

    }

}

class Transferencia extends Pago {

    private String banco;
    private String numCuenta;

    public Transferencia(String banco, String numCuenta) {
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
}

class Tarjeta extends Pago {

    private String tipo;
    private String numTransaccion;

    public Tarjeta(String tipo, String numTransaccion) {
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
}

package tarea1;

public class Tarea1 {

    public static void main(String[] args) {
        
        // creacion de ordenes de venta
        OrdenCompra ordenCompra1 = new OrdenCompra(20,"PAGADO");
        OrdenCompra ordenCompra2 = new OrdenCompra(21,"NO PAGADO");
        OrdenCompra ordenCompra3 = new OrdenCompra(22,"PAGADO");
        // creacion de compradores
        
        // creacion de productos diferentes
        // creacion de pagos
        
    }
    
}

class OrdenCompra {

    private int fecha;
    private String estado;

    DocTributario doctributario = new DocTriburario(String numero , String rut , int fecha

    ); 
    
    public OrdenCompra(int fecha, String estado) {
        this.fecha = fecha;
        this.estado = estado;
    }

    public void calcPrecioSinIVA() {
    }

    public void calcIVA() {
    }

    public void calcPrecio() {
    }

    public void calcPeso() {
    }
}

class Cliente {

    private String nombre;
    private String rut;

    public Cliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
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

    public DetalleOrden(int cantidad) {
        this.cantidad = cantidad;
    }

    public void calcPrecioSinIVA() {
    }

    public void calcIVA() {
    }

    public void calcPeso() {
    }
}

class Articulo {

    private float peso;
    private String nombre;
    private String descripcion;
    private String precio;

    public Articulo(float peso, String nombre, String descripcion, String precio) {
        this.peso = peso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
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

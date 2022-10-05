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

    DocTributario doctributario = new DocTriburario(String numero , String rut , int fecha); 
     
    
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
package tarea1;

import java.util.ArrayList;

public class Tarea1 {

    public static void main(String[] args) {
        
        Bodega bodega = new Bodega();
        
        Articulo articulo = new Articulo((float) 0.3,"Oso de peluche","Oso suavecito",4000);
        bodega.addArticulo(articulo);
        
        articulo = new Articulo((float) 0.6,"Celular","nuevo",180000);
        bodega.addArticulo(articulo);
        
        articulo = new Articulo((float) 0.5,"Perfume","Fragancia floral",25000);
        bodega.addArticulo(articulo);
        
        articulo = new Articulo((float) 0.5,"Polera","nuevo",15000);
        bodega.addArticulo(articulo);
        
        articulo = new Articulo((float) 0.8,"Jeans","nuevo",10000);
        bodega.addArticulo(articulo);

        Cliente cliente1 = new Cliente("Homero","11.111.111-1");
        OrdenCompra ordenCompra1 = new OrdenCompra(20,"PAGADO", bodega);
        
        
        OrdenCompra ordenCompra2 = new OrdenCompra(21,"NO PAGADO", bodega);
        
        Cliente cliente2 = new Cliente("Marge","22.222.222-2");
        OrdenCompra ordenCompra3 = new OrdenCompra(22,"PAGADO", bodega);
    }
    
}
class Bodega {

    private ArrayList<Articulo> bodega;
    private int size;
    public Bodega() {
        size = 0;
        bodega = new ArrayList();
    }

    public void addArticulo(Articulo articulo) {
        size++;
        bodega.add(articulo);
    }

    public Articulo getArticulo(int que) {
        if (bodega.size() == 0) {
            return null;
        } else {
            Articulo articulo = bodega.get(que);
            return articulo;
        }
    }
    
    public int getSize(){
        return size;
    }
}

class OrdenCompra {

    private int fecha;
    private String estado;
    private Bodega bodega;
        
    public OrdenCompra(int fecha, String estado, Bodega bodega) {
        this.fecha = fecha;
        this.estado = estado;
        this.bodega = bodega;
        //DocTributario docTributario = new DocTributario(String numero, String rut, int fecha); 

    }
    
    DetalleOrden detalleOrden = new DetalleOrden(bodega);

    public float calcPrecioSinIVA() {
        return detalleOrden.calcPrecioSinIVA(bodega);
    }

    public float calcIVA() {
        return detalleOrden.calcIVA(bodega);
    }

    public float calcPrecio() {
        return detalleOrden.calcPrecio(bodega);
    }

    public float calcPeso() {
        return detalleOrden.calcPeso(bodega);
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
    
    private float precioTotal;
    private float precioSinIVA;
    private float IVA;
    private float peso;
    
    
    public DetalleOrden(Bodega bodega) {
        cantidad = bodega.getSize();
        precioTotal = 0;
        precioSinIVA = 0;
        IVA = 0;
        peso = 0;
    }
    
    public float calcPrecio(Bodega bodega) {
        Articulo articulo = null;
        for(int i = 0; i < bodega.getSize(); i++)
        {
            articulo = bodega.getArticulo(i);
            precioTotal += articulo.getPrecio();
        }
        return (float) (precioTotal);
    }
    
    public float calcPrecioSinIVA(Bodega bodega) {
        Articulo articulo = null;
        for(int i = 0; i < bodega.getSize(); i++)
        {
            articulo = bodega.getArticulo(i);
            precioSinIVA += articulo.getPrecio() * 0.81;
        }
        return  (float) (precioSinIVA);
    }

    public float calcIVA(Bodega bodega) {
        Articulo articulo = null;
        for(int i = 0; i < bodega.getSize(); i++)
        {
            articulo = bodega.getArticulo(i);
            IVA += articulo.getPrecio() - articulo.getPrecio() * 0.81;
        }
        return  (float) (IVA);
    }

    public float calcPeso(Bodega bodega) {
        Articulo articulo = null;
        for(int i = 0; i < bodega.getSize(); i++)
        {
            articulo = bodega.getArticulo(i);
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

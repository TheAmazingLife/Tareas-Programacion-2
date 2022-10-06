import java.time.LocalDate;
package tarea1;

abstract class Pago {
    protected float monto;
    protected LocalDate fecha;
    protected OrdenCompra ordenCompra;
    protected int numeroCuotas;
}

class Efectivo extends Pago{
    public Efectivo(float monto, int numeroCuotas, OrdenCompra ordenCompra) {
        super();
        this.monto = monto;
        this.numeroCuotas = numeroCuotas;
        fecha = LocalDate.now();
        this.ordenCompra = ordenCompra;
        this.fecha = ordenCompra.getFecha();
        
    }
    
    public float calcDevolucion() {
        float devolucion = 0;
        if (numeroCuotas == 0) {
            if (monto > ordenCompra.calcPrecio()) {
                devolucion = ordenCompra.calcPrecio() - monto;
            }
        } else {
            float valorCuota = 0;
            valorCuota = ordenCompra.calcPrecio()/numeroCuotas;
            if (monto >= valorCuota) {
                devolucion = ordenCompra.calcPrecio() - monto;
            }
        }
        return devolucion;
    }
    
    public String toString() {
        return "Dinero: " + monto + "\n" + "Fecha: " + fecha + "\n";
    }
}

class Transferencia extends Pago {
    private String banco;
    private String numCuenta;
    public Transferencia(String banco, String numCuenta, float monto, int numeroCuotas, OrdenCompra ordenCompra) {
        super();
        this.monto = monto;
        this.numeroCuotas = numeroCuotas;
        fecha = LocalDate.now();
        this.ordenCompra = ordenCompra;
        this.fecha = ordenCompra.getFecha();
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
    public String getBanco(){
        return banco;
    }
    public String getNumCuenta(){
        return numCuenta;
    }
    public float calcDevolucion() {
        float devolucion = 0;
        if (numeroCuotas == 0) {
            if (monto > ordenCompra.calcPrecio()) {
                devolucion = ordenCompra.calcPrecio() - monto;
        } else {
            float valorCuota = 0;
            valorCuota = ordenCompra.calcPrecio()/numeroCuotas;
            if (monto >= valorCuota) {
                devolucion = ordenCompra.calcPrecio() - monto;
            }
        }
        return devolucion;
    }
    public String toString() {
        return "Dinero: " + monto + "\n" + "Fecha: " + fecha + "\n";
    }
}

class Tarjeta extends Pago {
    private String tipo;
    private String numTransaccion;

    public Tarjeta(String tipo, String numTransaccion) {
        super();
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
        fecha = LocalDate.now();
    }
    public Tarjeta(String tipo, String numTransaccion, float monto, int numeroCuotas, OrdenCompra ordenCompra) {
        super();
        this.monto = monto;
        this.numeroCuotas = numeroCuotas;
        fecha = LocalDate.now();
        this.ordenCompra = ordenCompra;
        this.fecha = ordenCompra.getFecha();
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
    public void agregarMonto(float monto){
        this.monto += monto;
    }
    public String getTipo(){
        return tipo;
    }
    public String getNumTransaccion(){
        return numTransaccion;
    }
    public float calcDevolucion() {
        float devolucion = 0;
        if (numeroCuotas == 0) {
            if (monto > ordenCompra.calcPrecio()) {
                devolucion = ordenCompra.calcPrecio() - monto;
            }
        } else {
            float valorCuota = 0;
            valorCuota = ordenCompra.calcPrecio()/numeroCuotas;
            if (monto >= valorCuota) {
                devolucion = ordenCompra.calcPrecio() - monto;
            }
        }
        return devolucion;
    }
    public String toString() {
        return "Dinero: " + monto + "\n" + "Fecha: " + fecha + "\n" +
                "Tipo: "+ tipo + "Numero de Transaccion: " + fecha;
    }
}


/*
Agregar el numero de cuotas en el main Efectivo efectivo = new Efectivo(monto, nroCuotas, ordenCompra);

*/
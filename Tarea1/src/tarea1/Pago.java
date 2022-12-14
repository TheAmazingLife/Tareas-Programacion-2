/*
Contructor
Pago pago = new Efectivo(float monto, int numeroCuotas, OrdenCompra ordenCompra);
Pago pago = new Transferencia(String banco, String numCuenta, float monto, int numeroCuotas, OrdenCompra ordenCompra);
Pago pago = new Tarjeta(String tipo, String numTransaccion, float monto, int numeroCuotas, OrdenCompra ordenCompra)
 */
package tarea1;

import java.time.LocalDate;

abstract class Pago {

    protected float monto;
    protected LocalDate fecha;
    protected OrdenCompra ordenCompra;
    protected int numeroCuotas;

    public Pago(float monto, int numeroCuotas, OrdenCompra ordenCompra) {
        this.monto = monto;
        this.fecha = ordenCompra.getFecha();
        this.ordenCompra = ordenCompra;
        this.numeroCuotas = numeroCuotas;
    }
}

class Efectivo extends Pago {

    public Efectivo(float monto, int numeroCuotas, OrdenCompra ordenCompra) {
        super(monto, numeroCuotas, ordenCompra);
    }

    public float calcDevolucion() {
        float devolucion = 0;
        if (numeroCuotas == 1) {
            devolucion = monto - ordenCompra.calcPrecio();
        } else {
            float valorCuota = 0;
            valorCuota = ordenCompra.calcPrecio() / numeroCuotas;
            devolucion = monto - valorCuota;
        }
        return devolucion;
    }

    public String toString() {
        return "Pago. Dinero: " + monto + " Total a pagar: " + ordenCompra.calcPrecio() + " Numero de cuotas: " + numeroCuotas + " Fecha: " + fecha + " Vuelto: $" + calcDevolucion() + "\n";
    }
}

class Transferencia extends Pago {

    private String banco;
    private String numCuenta;

    public Transferencia(String banco, String numCuenta, float monto, int numeroCuotas, OrdenCompra ordenCompra) {
        super(monto, numeroCuotas, ordenCompra);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }

    public String getBanco() {
        return banco;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public String toString() {
        return "Pago. Dinero: " + monto + " Total a pagar: " + ordenCompra.calcPrecio() + " Numero de cuotas: " + numeroCuotas + " Fecha: " + fecha
                + " Banco: " + banco + " Numero de cuenta: " + numCuenta + "\n";
    }
}

class Tarjeta extends Pago {

    private String tipo;
    private String numTransaccion;

    public Tarjeta(String tipo, String numTransaccion, float monto, int numeroCuotas, OrdenCompra ordenCompra) {
        super(monto, numeroCuotas, ordenCompra);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }

    public void agregarMonto(float monto) {
        this.monto += monto;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumTransaccion() {
        return numTransaccion;
    }

    public String toString() {
        return "Pago. Dinero: " + monto + " Total a pagar: " + ordenCompra.calcPrecio() + " Numero de cuotas: " + numeroCuotas + " Fecha: " + fecha
                + "Tipo: " + tipo + " Numero de Transaccion: " + fecha + "\n";
    }
}

/*
METODO calcular numero de cuotas PENDIENTEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
 */

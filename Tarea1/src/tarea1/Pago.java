import java.time.LocalDate;
package tarea1;

abstract class Pago {
    protected float monto;
    protected LocalDate fecha;
}

class Efectivo extends Pago{
    public Efectivo() {
        super();
        fecha = LocalDate.now();
        monto = 0;
    }
    public void agregarMonto(float monto){
        this.monto += monto;
    }

    public float calcDevolucion(OrdenCompra ) {
        return monto-; //pendiente
    }
    
    public String toString() {
        return "Dinero: " + monto + "\n" + "Fecha: " + fecha + "\n";
    }
}

class Transferencia extends Pago {
    private String banco;
    private String numCuenta;

    public Transferencia(String banco, String numCuenta) {
        super();
        fecha = LocalDate.now();
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
    public void agregarMonto(float monto){
        this.monto += monto;
    }
    public String getBanco(){
        return banco;
    }
    public String getNumCuenta(){
        return numCuenta;
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
    public void agregarMonto(float monto){
        this.monto += monto;
    }
    public String getTipo(){
        return tipo;
    }
    public String getNumTransaccion(){
        return numTransaccion;
    }
    public String toString() {
        return "Dinero: " + monto + "\n" + "Fecha: " + fecha + "\n" +
                "Tipo: "+ tipo + "Numero de Transaccion: " + fecha;
    }
}

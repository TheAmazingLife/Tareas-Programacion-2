import java.time.LocalDate;
package tarea1;

class DocTributario {

    protected String numero;
    protected String rut;
    protected LocalDate fecha;
    protected String direccion;
    
    public String getNumero() {
        return numero;
    }
    public String getRut() {
        return rut;
    }
    public LocalDate getFecha() {
        return fecha;
    }
}

class Boleta extends DocTributario {

    public Boleta(String numero) {
        super();
        this.numero = numero;
    }
    
    public void ordenBoleta(OrdenCompra orden) {
        this.rut = orden.getCliente().getRut();
        this.fecha = orden.getFecha();
        this.direccion = orden.getCliente().getDireccion();
    }
    public String toString(){
        return "Detalles Boleta.\nRut: " + rut + "Direccion: " + direccion + "Fecha: " + fecha;
    }
}

class Factura extends DocTributario {

    public Factura(String numero) {
        super();
        this.numero = numero;
    }
    
    public void ordenBoleta(OrdenCompra orden) {
        this.rut = orden.getCliente().getRut();
        this.fecha = orden.getFecha();
        this.direccion = orden.getCliente().getDireccion();
    }
    public String toString(){
        return "Detalles Boleta.\nRut: " + rut + "Direccion: " + direccion + "Fecha: " + fecha;
    }
}
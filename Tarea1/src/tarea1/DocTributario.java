import java.time.LocalDate;
package tarea1;

class DocTributario {

    protected String numero;
    protected String rut;
    protected LocalDate fecha;
    protected String direccion;
    
    public DocTributario(String numero, String rut, LocalDate fecha) {
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
    }
    
    public String getNumero() {
        return numero;
    }
    public String getRut() {
        return rut;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public String getDireccion() {
        return direccion;
    }
}

class Boleta extends DocTributario {

    public Boleta(String numero, String rut, LocalDate fecha) {
        super(numero, rut, fecha);
    }
    
    public String toString(){
        return "Detalles Boleta.\nRut: " + rut + "Direccion: " + direccion + "Fecha: " + fecha;
    }
}

class Factura extends DocTributario {

    public Factura(String numero, String rut, LocalDate fecha) {
        super(numero, rut, fecha);
    }
    
    public String toString(){
        return "Detalles Boleta.\nRut: " + rut + "Direccion: " + direccion + "Fecha: " + fecha;
    }
}
/*
Contructor
DocTributario docTributario = new DocTributario(String numero, String rut, LocalDate fecha, Direccion direccion);
 */
package tarea1;

import java.time.LocalDate;

abstract class DocTributario {

    protected String numero;
    protected String rut;
    protected LocalDate fecha;
    protected Direccion direccion;

    public DocTributario(String numero, String rut, LocalDate fecha, Direccion direccion) {
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
        this.direccion = direccion;
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

    public Direccion getDireccion() {
        return direccion;
    }
}

class Boleta extends DocTributario {

    public Boleta(String numero, String rut, LocalDate fecha, Direccion direccion) {
        super(numero, rut, fecha, direccion);
    }

    public String toString() {
        return "Detalles Boleta. Rut: " + rut + " Direccion: " + direccion.getDireccion() + " Fecha: " + fecha +  "\n";
    }
}

class Factura extends DocTributario {

    public Factura(String numero, String rut, LocalDate fecha, Direccion direccion) {
        super(numero, rut, fecha, direccion);
    }

    public String toString() {
        return "Detalles Factura. Rut: " + rut + " Direccion: " + direccion.getDireccion() + " Fecha: " + fecha + "\n";
    }
}

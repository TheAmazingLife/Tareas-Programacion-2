/*
Contructor
Cliente cliente = new Cliente(String nombre, String rut, Direccion direccion);
*/
package tarea1;

//hola
class Cliente {

    private final String nombre;
    private final String rut;
    private Direccion direccion;

    public Cliente(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

}

package tarea1;

class Cliente {

    private final String nombre;
    private final String rut;
    private String direccion;
    
    public Cliente(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getRut(){
        return rut;
    }
    public String getDireccion(){
        return direccion;
    }
    
}

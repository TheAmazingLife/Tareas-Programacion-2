package tarea1;

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
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String toString(){
        return "Articulo: " + nombre + " " + descripcion + " " + precio + " " + peso;
    }

}

/*
New Feature: 
.toString() devuelve nombre descripcion precio peso.
.getDescripcion() y .getNombre devuelve la descripcion y el nombre respectivamente
*/
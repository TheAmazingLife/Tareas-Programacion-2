/*-------------------------------------------------------------------
                                     /~\
                                    |oo )
                                    _\=/_
                    ___        #   /  _  \
                   / ()\        \\//|/.\|\\
                 _|_____|_       \/  \_/  ||
                | | === | |         |\ /| ||
                |_|  O  |_|         \_ _/  #
                 ||  O  ||          | | |
                 ||__*__||          | | |
                |~ \___/ ~|         []|[]
                /=\ /=\ /=\         | | |
________________[_]_[_]_[_]________/_]_[_\_________________________
*/
package tarea1;

import java.time.LocalDate;

public class Tarea1 {

    public static void main(String[] args) {
        
        // para cliente 1
        Articulo articulo1 = new Articulo((float) 0.5, "Galletas", "Sabor Chocolate", 1590);
        Articulo articulo2 = new Articulo((float) 0.5, "Jugo", "Sabor Frambuesa", 1590);

        Direccion direccion1 = new Direccion("Avenida Siempre Viva, #742");
        Cliente cliente1 = new Cliente("Homero Simpson", "11.111.111-1", direccion1);
        OrdenCompra ordenCompra1 = new OrdenCompra("EN CURSO", cliente1, 1);
        
        ordenCompra1.anadirDetalle(2, articulo1);
        ordenCompra1.anadirDetalle(1, articulo2);
        
        Efectivo efectivo = new Efectivo(10000, 0, ordenCompra1);
        ordenCompra1.finalizarCompra();
        System.out.println(ordenCompra1.ToString());

        // para cliente 2
        Articulo articulo3 = new Articulo((float) 2, "Bebida", "Sabor Coca - Cola", 1200);
        Articulo articulo4 = new Articulo((float) 0.6, "Cerveza", "Marca Duff", 1000);

        Cliente cliente2 = new Cliente("Marge Simpson", "22.222.222-2", direccion1);
        OrdenCompra ordenCompra2 = new OrdenCompra("EN CURSO", cliente2, 2);
        
        ordenCompra2.anadirDetalle(1, articulo3);
        ordenCompra2.anadirDetalle(12, articulo4);
        
        Transferencia transferencia = new Transferencia("Bancoestado","22.222.222",50000,0,ordenCompra2);
        ordenCompra2.finalizarCompra();
        System.out.println(ordenCompra2.ToString());
        
    }
}

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
        Articulo articulo2 = new Articulo((float) 0.5, "Jugo", "Sabor Frambuesa", 700);

        Direccion direccion1 = new Direccion("Avenida Siempre Viva, #742");
        Cliente cliente1 = new Cliente("Homero Simpson", "11.111.111-1", direccion1);
        OrdenCompra ordenCompra1 = new OrdenCompra("EN CURSO", cliente1, 1);

        ordenCompra1.anadirDetalle(2, articulo1);
        ordenCompra1.anadirDetalle(1, articulo2);

        Efectivo efectivo = new Efectivo(10000, 1, ordenCompra1);
        ordenCompra1.finalizarCompra();
        System.out.print(ordenCompra1.toString());
        System.out.println(efectivo.toString());

        // para cliente 2
        Articulo articulo3 = new Articulo((float) 2, "Bebida", "Sabor Coca - Cola", 1200);
        Articulo articulo4 = new Articulo((float) 0.6, "Cerveza", "Marca Duff", 1000);

        Cliente cliente2 = new Cliente("Marge Simpson", "22.222.222-2", direccion1);
        OrdenCompra ordenCompra2 = new OrdenCompra("EN CURSO", cliente2, 1);

        ordenCompra2.anadirDetalle(1, articulo3);
        ordenCompra2.anadirDetalle(12, articulo4);

        Transferencia transferencia = new Transferencia("Bancoestado", "22.222.222", 13200, 1, ordenCompra2);
        ordenCompra2.finalizarCompra();
        System.out.print(ordenCompra2.toString());
        System.out.println(transferencia.toString());

        // para cliente 2 (de nuevo)
        Articulo articulo5 = new Articulo((float) 0.6, "Krusty Burger", "Sabor clasico", 1750);
        Articulo articulo6 = new Articulo((float) 0.3, "Rosquillas", "rosada", 1500);

        OrdenCompra ordenCompra3 = new OrdenCompra("EN CURSO", cliente2, 2);

        ordenCompra3.anadirDetalle(4, articulo5);
        ordenCompra3.anadirDetalle(10, articulo6);

        Tarjeta tarjeta1 = new Tarjeta("DEBITO", "#1111", 22000, 1, ordenCompra3);
        ordenCompra3.finalizarCompra();

        System.out.print(ordenCompra3.toString());
        System.out.println(tarjeta1.toString());

        // para cliente 3
        Articulo articulo7 = new Articulo((float) 0.6, "Pizza", "Pepperoni ", 13500);

        Direccion direccion2 = new Direccion("308 de Negra Arroyo Lane");
        Cliente cliente3 = new Cliente("Walter White", "33.333.333-3", direccion2);

        OrdenCompra ordenCompra4 = new OrdenCompra("EN CURSO", cliente3, 1);

        ordenCompra4.anadirDetalle(1, articulo7);

        Tarjeta tarjeta2 = new Tarjeta("DEBITO", "#1112", 13500, 1, ordenCompra4);
        ordenCompra4.finalizarCompra();

        System.out.print(ordenCompra4.toString());
        System.out.println(tarjeta2.toString());

    }
}

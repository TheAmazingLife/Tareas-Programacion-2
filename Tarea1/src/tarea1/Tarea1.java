package tarea1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tarea1 {

    public static void main(String[] args) {
        // para cliente 1
        Pedido pedido1 = new Pedido();
        Articulo articulo1 = new Articulo((float) 0.3,"Oso de peluche","Oso suavecito",4000);
        Articulo articulo2 = new Articulo((float) 0.6,"Celular","nuevo",180000);
        pedido1.addArticulo(articulo1);
        pedido1.addArticulo(articulo2);
        
        Direccion direccion1 = new Direccion("Avenida Siempre Viva, #742");
        Cliente cliente1 = new Cliente("Homero","11.111.111-1",direccion1);
        
        OrdenCompra ordenCompra1 = new OrdenCompra("PAGADO", pedido1, cliente1,1);
        Efectivo efectivo = new Efectivo(10000, ordenCompra1);
        System.out.println(ordenCompra1.ToString());
        
        // para cliente 2
        Pedido pedido2 = new Pedido();
        Articulo articulo3 = new Articulo((float) 0.5,"Perfume","Fragancia floral",25000);
        Articulo articulo4 = new Articulo((float) 0.5,"Polera","nuevo",15000);
        pedido2.addArticulo(articulo3);
        pedido2.addArticulo(articulo4);
        
        Direccion direccion2 = new Direccion("Avenida Siempre Viva, #742");
        Cliente cliente2 = new Cliente("Marge","22.222.222-2",direccion2);
        
        OrdenCompra ordenCompra2 = new OrdenCompra("PAGADO", pedido2, cliente2,2);
        Transferencia transferencia = new Transferencia("Bancoestado","22.222.222",10000, ordenCompra2);

        System.out.println(ordenCompra2.ToString());
        
        // para cliente 3
        Pedido pedido3 = new Pedido();
        Articulo articulo5 = new Articulo((float) 0.8,"Jeans","nuevo",10000);
        pedido3.addArticulo(articulo5);
        
        Direccion direccion3 = new Direccion("Avenida Siempre Viva, #742");
        Cliente cliente3 = new Cliente("Marge","22.222.222-2", direccion3);
        OrdenCompra ordenCompra3 = new OrdenCompra("PAGADO", pedido3, cliente3,1);
        Tarjeta tarjeta = new Tarjeta("debito","0000", 100000, ordenCompra3);
        System.out.println(ordenCompra3.ToString());
    }
}

package main.java.tp8.interfaz;

public class MainParte1 {

    public static void main(String[] args) {
        // Creamos dos clientes
        Cliente c1 = new Cliente("Cliente Uno", "cliente1@email.com");
        Cliente c2 = new Cliente("Cliente Dos", "cliente2@email.com");
        
        // Creamos un pedido para cada cliente
        Pedido pedido = new Pedido();
        pedido.setCliente(c1);
        Pedido pedido2 = new Pedido();
        pedido2.setCliente(c2);
       
        // Creamos 3 productos
        Producto p1 = new Producto("Heladera", 1000000);
        Producto p2 = new Producto("Televisor", 500000);
        Producto p3 = new Producto("Lavarropa", 750000);
        
        // Agregamos 2 productos al pedido del cliente 1
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p3);
        
        // Notificamos el estado en proceso del pedido del cliente 1
        pedido.cambiarEstado(Pedido.Estado.CREADO);
        
        // Calculamos el total del pedido del cliente 1
        double total = pedido.calcularTotal();
        
        // Creamos un nuevo pago con PayPal
        PayPal pago = new PayPal("cliente1@email.com");
        
        // Procesamos el pago del cliente 1
        pago.procesarPago(total);
        
        // Notificamos el estado del pedido pagado
        pedido.cambiarEstado(Pedido.Estado.PAGADO);
       
        // Agregamos un producto al pedido del cliente 2
        pedido2.agregarProducto(p2);
        // Notificamos su estado en proceso
        pedido2.cambiarEstado(Pedido.Estado.CREADO);
        
        // Calculamos el total del pedido del cliente 2
        double total2 = pedido2.calcularTotal();
        
        // Creamos un pago con tarjeta (con descuento)
        TarjetaCredito pago2 = new TarjetaCredito("4532-1234-5678-9012", 0.10);
        
        // Aplicamos descuento y procesamos el pago del cliente 2
        double totalConDescuento = pago2.aplicarDescuento(total2);
        pago2.procesarPago(totalConDescuento);
        
        // Notificamos al cliente 2 su estado de pedido pagado
        pedido2.cambiarEstado(Pedido.Estado.PAGADO);    
    }
}
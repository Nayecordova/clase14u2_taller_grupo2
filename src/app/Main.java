package app;

import modelos.FacturaCompra;
import modelos.PagoTarjeta;
import modelos.PagoTransferencia;
import servicios.ProcesadorCheckout;

public class Main {
    public static void main(String[] args) {
        ProcesadorCheckout checkout = new ProcesadorCheckout();
        PagoTarjeta tarjeta = new PagoTarjeta("Cliente 1", "4821");
        PagoTransferencia transferencia = new PagoTransferencia("Banco Pacifico", "2201948");
        FacturaCompra f1 = new FacturaCompra("FAC-001", "Cliente 1", 120.50);
        FacturaCompra f2 = new FacturaCompra("FAC-002", "Cliente 2", 85.00);

        // TODO [Issue #3 - Integrante 3]: Ejecutar dos compras cambiando el MetodoPago sin modificar ProcesadorCheckout.

        // Prueba 1: pago con tarjeta
        System.out.println("=== Compra 1: Tarjeta ===");
        checkout.ejecutarCompra(tarjeta, 120.50, f1, f1);

        // Prueba 2: el mismo checkout, ahora con transferencia (sin modificar ProcesadorCheckout)
        System.out.println("\n=== Compra 2: Transferencia ===");
        checkout.ejecutarCompra(transferencia, 85.00, f2, f2);

        // Prueba 3: pago rechazado (monto inválido)
        System.out.println("\n=== Compra 3: Pago rechazado ===");
        checkout.ejecutarCompra(transferencia, -10.00, f2, f2);
    }
}

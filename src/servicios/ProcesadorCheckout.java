package servicios;

import interfaces.Exportable;
import interfaces.MetodoPago;
import interfaces.Persistible;

public class ProcesadorCheckout {

    public void ejecutarCompra(MetodoPago metodo, double monto, Exportable comprobante, Persistible registro) {
        System.out.println("Procesando pago con: " + metodo.getNombreMetodo());

        boolean exito = metodo.procesarPago(monto);

        if (exito) {
            System.out.println(comprobante.exportar());

            boolean guardado = registro.guardar();
            if (guardado) {
                System.out.println("Compra registrada correctamente.");
            } else {
                System.out.println("No se pudo guardar el registro.");
            }
        } else {
            System.out.println("El pago fue rechazado. No se genera comprobante.");
        }
    }
}

package modelos;

import interfaces.Exportable;
import interfaces.Persistible;

public class FacturaCompra implements Exportable, Persistible {
    private String numero;
    private String cliente;
    private double total;

    public FacturaCompra(String numero, String cliente, double total) {
        this.numero = numero;
        this.cliente = cliente;
        this.total = total;
    }

    @Override
    public String exportar() {
        return "{\"numero\": \"" + numero + "\", \"cliente\": \"" + cliente + "\", \"total\": " + total + "}";
    }

    @Override
    public boolean guardar() {
        System.out.println("Respaldo exitoso: Factura #" + numero + " del cliente " + cliente + " guardada en el sistema.");
        return true;
    }
}

package modelos;

import interfaces.MetodoPago;

public class PagoTarjeta implements MetodoPago {
    private String titular;
    private String ultimosCuatro;

    public PagoTarjeta(String titular, String ultimosCuatro) {
        this.titular = titular;
        this.ultimosCuatro = ultimosCuatro;
    }

    @Override
    public boolean procesarPago(double monto) {
        if (monto <= 0) {
            System.out.println("[Tarjeta] Monto invalido: " + monto);
            return false;
        }
        System.out.println("[Tarjeta] Pago aprobado por $" + monto
                + " para " + titular + " (**** " + ultimosCuatro + ").");
        return true;
    }

    
    public String getNombreMetodo() {
        return "Tarjeta (**** " + ultimosCuatro + ")";
    }
}

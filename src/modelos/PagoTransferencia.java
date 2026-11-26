package modelos;

import interfaces.MetodoPago;

public class PagoTransferencia implements MetodoPago {
    private String banco;
    private String cuenta;

    public PagoTransferencia(String banco, String cuenta) {
        this.banco = banco;
        this.cuenta = cuenta;
    }

    @Override
    public boolean procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Transferencia aprobada por $" + monto + " desde el banco " + banco + " (Cuenta: " + cuenta + ")");
            return true;
        }
        System.out.println("Error: El monto de la transferencia debe ser mayor a 0.");
        return false;
    }

    @Override
    public String obtenerNombreMetodo() {
        return "Transferencia Bancaria - " + banco + " (" + cuenta + ")";
    }
}
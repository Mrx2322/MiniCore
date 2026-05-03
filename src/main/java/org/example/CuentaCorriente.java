package org.example;

public class CuentaCorriente extends Cuenta{
    public CuentaCorriente(String id, String titular, double saldo) {
        super(id, titular, saldo);
    }

    @Override
    public double depositar(double monto) {
        System.out.println ("Depositando " + monto + " en la cuenta corriente de " + getTitular());
        super.depositar(monto);
        return getSaldo();
    }

    @Override
    public void retirar(double monto) {
        System.out.println ("Retirando " + monto + " de la cuenta de corriente de " + getTitular());
        if (getSaldo() + 500 >= monto) { // Permite un sobregiro de hasta 500
            setSaldo(getSaldo() - monto);
            System.out.println("retiro exitoso de " + monto);
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + monto);
        }
    }
}

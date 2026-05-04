package org.example.cuenta;

public class CuentaAhorros extends Cuenta {
    public CuentaAhorros(String id, String titular, double saldo) {
        super(id, titular, saldo);
    }

    @Override
    public double depositar(double monto) {
        System.out.println ("Depositando " + monto + " en la cuenta de ahorros de " + getTitular());
        super.depositar(monto);
        return getSaldo();
    }

    @Override
    public void retirar(double monto) {
        System.out.println ("Retirando " + monto + " de la cuenta de ahorros de " + getTitular());
        if (getSaldo() >= monto) {
            setSaldo(getSaldo() - monto);
            System.out.println("retiro exitoso de " + monto);
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + monto);
        }
    }
}

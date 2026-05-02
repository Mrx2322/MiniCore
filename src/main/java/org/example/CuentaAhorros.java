package org.example;

import java.math.BigDecimal;

public class CuentaAhorros extends Cuenta {
    public CuentaAhorros(String id, String titular, BigDecimal saldo) {
        super(id, titular, saldo);
    }

    @Override
    public void depositar( double monto) {
        System.out.println ("Depositando " + monto + " en la cuenta de ahorros de " + getTitular());
    }
    @Override
    public void retirar(double monto) {
        System.out.println ("Retirando " + monto + " de la cuenta de ahorros de " + getTitular());
        if (getSaldo() >= monto + 500) {
            System.out.println("retiro exitoso de " + monto);
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + monto);
        }
    }
}

package org.example;

import java.math.BigDecimal;

public class CuentaCorriente extends Cuenta{
    public CuentaCorriente(String id, String titular, java.math.BigDecimal saldo) {
        super(id, titular, saldo);
    }

    @Override
    public void depositar(double monto) {
        System.out.println ("Depositando " + monto + " en la cuenta de corriente de " + getTitular());
    }
    @Override
    public void retirar(double monto) {
        System.out.println ("Retirando " + monto + " de la cuenta de corriente de " + getTitular());
    }
}

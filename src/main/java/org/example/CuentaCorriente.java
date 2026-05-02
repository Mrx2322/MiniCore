package org.example;

import java.math.BigDecimal;

public class CuentaCorriente extends Cuenta{
    public CuentaCorriente(String id, String titular, BigDecimal saldo) {
        super(id, titular, saldo);
    }

    @Override
    public void depositar(BigDecimal monto) {
        if (monto.compareTo(BigDecimal.ZERO) <= 0) {
            throw new MontoInvalidoException("Monto invalido para depositar: " + monto);
        }
        System.out.println("Depositando " + monto + " en la cuenta de corriente de " + getTitular());
        setSaldo(getSaldo().add(monto));
    }
    @Override
    public void retirar(BigDecimal monto) {
        if (monto.compareTo(BigDecimal.ZERO) <= 0) {
            throw new MontoInvalidoException("Monto invalido para retirar: " + monto);
        }
        System.out.println("Retirando " + monto + " de la cuenta de corriente de " + getTitular());
        if (getSaldo().compareTo(monto) >= 0) {
            setSaldo(getSaldo().subtract(monto));
            System.out.println("Retiro exitoso de " + monto);
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + monto);
        }
    }
}

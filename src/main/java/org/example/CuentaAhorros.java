package org.example;

import java.math.BigDecimal;

public class CuentaAhorros extends Cuenta {
    public CuentaAhorros(String id, String titular, BigDecimal saldo) {
        super(id, titular, saldo);
    }

    @Override
    public void depositar(BigDecimal monto) {

    }
}

package org.example;

import java.math.BigDecimal;

public class CuentaCorriente extends Cuenta{
    public CuentaCorriente(String id, String titular, java.math.BigDecimal saldo) {
        super(id, titular, saldo);
    }

    @Override
    public void depositar(BigDecimal monto) {

    }
}

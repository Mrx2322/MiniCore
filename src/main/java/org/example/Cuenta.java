package org.example;

import java.math.BigDecimal;

public abstract class Cuenta {
    // Atributos privados
    private String id;
    private String titular;
    private BigDecimal saldo;


    // Constructor
    public Cuenta(String id, String titular, BigDecimal saldo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar (){}

    public void retirar(BigDecimal monto){
        if (monto.compareTo(saldo) > 0) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo = saldo.subtract(monto);
    }
}

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

    // Métodos Getter y Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}

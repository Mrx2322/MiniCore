
package org.example.cuenta;

public abstract class Cuenta {
    // Atributos privados
    private String id;
    private String titular;
    private double saldo;


    // Constructor
    public Cuenta(String id, String titular, double saldo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }

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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //METODOS
    public double depositar(double monto) {
        if (monto > 0) {
            setSaldo(getSaldo() + monto);
        } else {
            throw new MontoInvalidoException("El monto a depositar debe ser positivo");
        }
        return getSaldo();
    }

    public abstract void retirar(double monto);

    public void transferir(Cuenta cuentaDestino, double monto) throws SaldoInsuficienteException {
        System.out.println("Transfiriendo " + monto + " de " + getTitular() + " a " + cuentaDestino.getTitular());

        if (getSaldo() < monto) {
            throw new SaldoInsuficienteException("Saldo insuficiente para transferir " + monto);
        }

        this.retirar(monto);
        cuentaDestino.depositar(monto);

        System.out.println("Transferencia exitosamente");
    }
}

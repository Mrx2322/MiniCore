package org.example;

public class Main {
    static void main() {
        CuentaAhorros cuentaAhorro = new CuentaAhorros("001", "Juan Perez", 1000);
        CuentaCorriente cuentaCorriente = new CuentaCorriente("002", "Maria Lopez", 500);

        System.out.println("Saldo de la cuenta de juan Perez: " + cuentaAhorro.getSaldo());
        System.out.println("Saldo de la cuenta de Maria lopez: " + cuentaCorriente.getSaldo());

        cuentaAhorro.retirar(500.0);
        cuentaCorriente.retirar(600.0);
    }
}

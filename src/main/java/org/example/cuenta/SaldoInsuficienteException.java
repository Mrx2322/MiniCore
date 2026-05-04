package org.example.cuenta;

public class SaldoInsuficienteException extends RuntimeException {
  public SaldoInsuficienteException(String message) {
    super(message);
  }
}

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.cuenta.CuentaCorriente;
import org.example.cuenta.SaldoInsuficienteException;
import org.junit.jupiter.api.Test;

public class TestCuentaCorriente {

    CuentaCorriente cuentaCorriente = new CuentaCorriente("001", "Juan Perez", 1000);

    @Test
    void depositar() {
        assertEquals(1000, cuentaCorriente.getSaldo());
        cuentaCorriente.depositar(500);
        assertEquals(1500, cuentaCorriente.getSaldo());
    }

    @Test
    void retirar() {
        assertEquals(1000, cuentaCorriente.getSaldo());
        cuentaCorriente.retirar(500);
        assertEquals(500, cuentaCorriente.getSaldo());
    }

    @Test
    void retirarUsandoCredito() {
        assertEquals(1000, cuentaCorriente.getSaldo());
        cuentaCorriente.retirar(1500);
        assertEquals(-500, cuentaCorriente.getSaldo());
    }

    @Test
    void retirarUsandoCreditoExcesivo() {
        assertEquals(1000, cuentaCorriente.getSaldo());

        SaldoInsuficienteException exception = assertThrows(
                SaldoInsuficienteException.class,
                () -> cuentaCorriente.retirar(2000)
        );

        assertEquals("Saldo insuficiente para retirar 2000.0", exception.getMessage());

        assertEquals(1000, cuentaCorriente.getSaldo());
    }

}

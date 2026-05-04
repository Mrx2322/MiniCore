import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.cuenta.CuentaAhorros;
import org.junit.jupiter.api.Test;

public class TestCuentaAhorros {

    CuentaAhorros cuentaAhorros = new CuentaAhorros("001", "Juan Perez", 1000);

    @Test
    void depositar() {
        assertEquals(1000, cuentaAhorros.getSaldo());
        cuentaAhorros.depositar(500);
        assertEquals(1500, cuentaAhorros.getSaldo());
    }

    @Test
    void retirar() {
        assertEquals(1000, cuentaAhorros.getSaldo());
        cuentaAhorros.retirar(500);
        assertEquals(500, cuentaAhorros.getSaldo());
    }

}

package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {
    @Test
    public void validarAlgoSomenteNoUsuarioNome() {
        Assumptions.assumeTrue("Nome".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}

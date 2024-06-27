package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTest {
    @Test
//    @EnabledIfEnvironmentVariable(named = "USER", matches = "Nome")
//    @DisabledIfEnvironmentVariable(named = "USER", matches = "Nome")
//    @EnabledOnOs({OS.LINUX, OS.MAC})
//    @EnabledOnJre(JRE.JAVA_17)
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
    public void validarAlgoSomenteNoUsuarioNome() {
        Assertions.assertEquals(10, 5 + 5);
    }
}

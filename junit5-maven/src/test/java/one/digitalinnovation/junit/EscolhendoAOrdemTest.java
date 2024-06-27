package one.digitalinnovation.junit;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTest {

//    @Order(4)
    @DisplayName("Teste que valida se o usuario foi criado")
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

//    @Order(3)
    @DisplayName("B")
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

//    @Order(2)
    @DisplayName("C")
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

//    @Order(1)
    @DisplayName("D")
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}

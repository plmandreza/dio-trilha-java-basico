package one.digitalinnovation.junit;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

//import org.junit.jupiter.api.Assertions;

//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNull;
//import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test
    void validarLancamentos() {
        int [] primeiroLancamento = {10, 20, 30, 40, 50};
        int [] segundoLancamento = {10, 20, 30, 40, 50};

//        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
//        assertArrayEquals(primeiroLancamento, segundoLancamento);
        fail("Erro no teste");
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDate.now());

        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}

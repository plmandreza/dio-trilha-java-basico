package one.digitalinnovation.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configurarConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("Joao", LocalDate.of(2000,1,1)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.removeDados(new Pessoa("Joao", LocalDate.of(2000,1,1)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao() {
    BancoDeDados.finalizarConexao();
    }
}

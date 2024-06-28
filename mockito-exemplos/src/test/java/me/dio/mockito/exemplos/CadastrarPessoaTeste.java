package me.dio.mockito.exemplos;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
//    @BeforeAll
//    void setUp() {
//    MockitoAnnotations.initMocks(this);
//    }

    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

//    private ApiDosCorreios apiDosCorreios = Mockito.mock(ApiDosCorreios.class);

    @Test
    public void validarDadosDeCadastro() {
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("AM", "Manaus", "Rua Um", "Apto", "Centro");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("123456789").thenReturn(dadosLocalizacao));
        Pessoa pessoa = cadastrarPessoa.cadastraPessoa("Nome", "123456", LocalDate.now(), "123456789");

        assertEquals("Nome", pessoa.getNome());
        assertEquals("123456", pessoa.getDocumento());
        assertEquals("AM", pessoa.getEndereco().getUf());
        assertEquals("Apto", pessoa.getEndereco().getComplemento());
    }
}

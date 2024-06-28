package me.dio.mockito.exemplos;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {

//    @Mock
//    private List<String> letras;

    @Spy
    private List<String> letras;

//    @Test
//    public void adicionarItemNaLista() {
//        Mockito.when(letras.get(0)).thenReturn("B");
//
//        Assertions.assertEquals("B", letras.get(0));
//    }

    @Test
    public void verificarComportamentoDaClasse() {
//        Mockito.verifyNoInteractions(NomeDaClasse);
    }


}

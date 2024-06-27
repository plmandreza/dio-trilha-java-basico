package one.digitalinnovation.junit;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    //fez algo
    public static void iniciarConexao() {
        LOGGER.info("Iniciou conexao");
    }

    //fez algo
    public static void finalizarConexao() {
        LOGGER.info("Finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa) {
        //insere pessoa no BD
        LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa) {
        //remove pessoa no BD
        LOGGER.info("Removeu dados");
    }
}


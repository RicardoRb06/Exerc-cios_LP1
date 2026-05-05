import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    public void qualEscolaridadeDiretor() {
        Cidade cidade = new Cidade("Santos Dumont", "MG");
        Escola escola = new Escola(cidade, new Professor(cidade, "doutor"));
        assertEquals("doutor", escola.obterEscolaridadeDiretor());
    }

    @Test
    public void verificaErroDiretorNull() {
        try{
            Escola escola = new Escola(new Cidade("SD", "MG"), null);
            fail();
        } catch (NullPointerException e){
            assertEquals("Diretor não pode ser null", e.getMessage());
        }
    }
}
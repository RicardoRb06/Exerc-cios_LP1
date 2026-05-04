import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    public void qualEscolaridadeDiretor() {
        Escola escola = new Escola(new Professor("doutor"));
        assertEquals("doutor", escola.obterEscolaridadeDiretor());
    }

    @Test
    public void verificaErroDiretorNull() {
        try{
            Escola escola = new Escola(null);
            fail();
        } catch (NullPointerException e){
            assertEquals("Diretor não pode ser null", e.getMessage());
        }
    }
}
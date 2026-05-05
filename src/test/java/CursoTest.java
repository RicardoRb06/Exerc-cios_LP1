import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    public void qualEscolaridadeCoordenador() {
        Cidade cidade = new Cidade("Santos Dumont", "MG");
        Escola escola = new Escola(cidade, new Professor(cidade, "doutor"));
        Curso curso = new Curso(escola, new Professor(cidade,"doutorado"), new TipoEnsino("ensino fundamental"));
        assertEquals("doutorado", curso.obterEscolaridadeCoordenador());
    }

    @Test
    public void verificaErroCoordenadorNull() {
        try{
            Cidade cidade = new Cidade("Santos Dumont", "MG");
            Escola escola = new Escola(cidade, new Professor(cidade, "doutor"));
            Curso curso = new Curso(escola, null, new TipoEnsino("ensino fundamental"));
            fail();
        } catch (NullPointerException e){
            assertEquals("Coordenador não pode ser null", e.getMessage());
        }
    }

}
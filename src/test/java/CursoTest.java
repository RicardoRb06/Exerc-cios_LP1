import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    public void qualEscolaridadeCoordenador() {
        Cidade cidade = new Cidade("Santos Dumont", "MG");
        Curso curso = new Curso(new Professor(cidade,"doutorado"));
        assertEquals("doutorado", curso.obterEscolaridadeCoordenador());
    }

    @Test
    public void verificaErroCoordenadorNull() {
        try{
            Curso curso = new Curso(null);
            fail();
        } catch (NullPointerException e){
            assertEquals("Coordenador não pode ser null", e.getMessage());
        }
    }

}
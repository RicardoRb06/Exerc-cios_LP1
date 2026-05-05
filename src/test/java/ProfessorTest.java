import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    public void qualEscolaridadeProfessor(){
        Cidade cidade = new Cidade("Santos Dumont", "MG");
        Professor professor = new Professor(cidade, "doutorado");
        assertEquals("doutorado", professor.obterEscolaridade());
    }

    @Test
    public void qualCidadeProfessor(){
        Cidade cidade = new Cidade("Santos Dumont", "MG");
        Professor professor = new Professor(cidade, "doutorado");
        assertEquals("Santos Dumont", professor.obterCidadeNaturalidade());
    }

    @Test
    public void verificaEscolaridadeNull() {
        try{
            Cidade cidade = new Cidade("Santos Dumont", "MG");
            Professor professor = new Professor(cidade, null);
            fail();
        } catch (NullPointerException e){
            assertEquals("Escolaridade não pode ser null", e.getMessage());
        }
    }
}
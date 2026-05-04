import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    public void qualEscolaridadeProfessor(){
        Professor professor = new Professor(new Escolaridade("doutorado"));
        assertEquals("doutorado", professor.obterEscolaridade());
    }

    @Test
    public void verificaEscolaridadeNull() {
        try{
            Professor professor = new Professor(null);
            fail();
        } catch (NullPointerException e){
            assertEquals("Escolaridade não pode ser null", e.getMessage());
        }
    }
}
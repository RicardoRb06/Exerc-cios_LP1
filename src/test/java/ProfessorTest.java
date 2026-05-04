import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    public void qualEscolaridadeProfessor(){
        Professor professor = new Professor();
        professor.setEscolaridade(new Escolaridade("doutor"));
        assertEquals("doutor", professor.obterEscolaridade());
    }

}
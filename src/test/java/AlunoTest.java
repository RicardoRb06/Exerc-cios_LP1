import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AlunoTest {

    @Test
    public void qualEstadoNaturalidade() {
        Cidade cidade = new Cidade("Santos Dumont", "MG");
        Aluno aluno = new Aluno(cidade);
        assertEquals("MG", aluno.obterEstadoNaturalidade());
    }
  
}
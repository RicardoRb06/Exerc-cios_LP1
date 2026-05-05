import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AlunoTest {

    @Test
    public void qualEstadoNaturalidade() {
        Cidade cidade = new Cidade("Santos Dumont", "MG");
        Aluno aluno = new Aluno(cidade);
        assertEquals("MG", aluno.obterEstadoNaturalidade());
    }

    @Test
    public void qualEstadoEstuda() {
        Cidade cidade = new Cidade("Santos Dumont", "MG");
        Cidade cidade1 = new Cidade("Rio de janeiro", "RJ");
        Curso curso = new Curso(cidade, new Professor(cidade, "doutorado"));
        Aluno aluno = new Aluno(cidade);
        aluno.setCurso(curso);
        assertEquals("RJ", aluno.obterEstadoEstuda());
    }
}
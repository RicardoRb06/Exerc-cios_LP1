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
        Curso curso = new Curso(cidade1, new Professor(cidade1, "doutorado"), new TipoEnsino("ensino fundamental"));
        Aluno aluno = new Aluno(cidade);
        aluno.setCurso(curso);
        assertEquals("RJ", aluno.obterEstadoEstuda());
    }

    @Test
    public void verificaCursoNull() {
        try{
            Cidade cidade = new Cidade("Santos Dumont", "MG");
            Aluno aluno = new Aluno(cidade);
            String estado = aluno.obterEstadoEstuda();
            fail();
        } catch (NullPointerException e){
            assertEquals("Curso não pode ser null", e.getMessage());
        }
    }
}
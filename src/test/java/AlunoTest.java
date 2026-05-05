import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AlunoTest {

    @Test
    public void quemCoordenadorCurso(){
        Cidade cidade = new Cidade("Santos Dumont", "MG");
        Aluno aluno = new Aluno(cidade);
        Professor professor = new Professor(cidade, "doutorado");
        professor.setNome("Marco");
        Escola escola = new Escola(cidade, professor);
        Curso curso = new Curso(escola, professor, new TipoEnsino("ensino superior"));
        aluno.setCurso(curso);

        assertEquals("Marco", aluno.obterCoordenadorCurso());
    }

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
        Professor professor = new Professor(cidade1, "doutorado");
        Curso curso = new Curso(new Escola(cidade1, professor), professor, new TipoEnsino("ensino fundamental"));
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
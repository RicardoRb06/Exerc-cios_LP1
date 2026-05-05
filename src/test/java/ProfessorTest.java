import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    public void quemDiretorCurso() {
        Cidade cidade = new Cidade("Santos Dumont", "MG");
        Professor professor = new Professor(cidade, "doutorado");
        Professor professor1 = new Professor(cidade, "doutorado");

        professor.setNome("Marco");
        professor1.setNome("Sandro");

        Curso curso = new Curso(cidade, professor, "superior");
        professor1.setContratacao(curso);

        assertEquals("Marco", professor1.getDiretor());
    }

    @Test
    public void qualTipoEnsinoProfessor(){
        Cidade cidade = new Cidade("Santos Dumont", "MG");
        Professor professor = new Professor(cidade, "doutorado");
        Curso curso = new Curso(cidade, professor, new TipoEnsino("ensino fundamental"));
        professor.setContratacao(curso);
        assertEquals("ensino fundamental", professor.obterTipoEnsino());
    }

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
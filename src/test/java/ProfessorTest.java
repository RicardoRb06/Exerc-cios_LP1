import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    public void quemCoordenador() {
        Cidade cidade = new Cidade("Santos Dumont", "MG");
        Professor professor = new Professor(cidade, "doutorado");
        Professor professor1 = new Professor(cidade, "doutorado");
        Escola escola = new Escola(cidade, professor);

        professor.setNome("Marco");
        professor1.setNome("Sandro");

        Curso curso = new Curso(escola, professor1, new TipoEnsino("superior"));
        professor.setContratacao(curso);

        assertEquals("Sandro", professor.obterCoordenadorNome());
    }

    @Test
    public void quemDiretorCurso() {
        Cidade cidade = new Cidade("Santos Dumont", "MG");
        Professor professor = new Professor(cidade, "doutorado");
        Professor professor1 = new Professor(cidade, "doutorado");
        Escola escola = new Escola(cidade, professor);

        professor.setNome("Marco");
        professor1.setNome("Sandro");

        Curso curso = new Curso(escola, professor, new TipoEnsino("superior"));
        professor1.setContratacao(curso);

        assertEquals("Marco", professor1.obterDiretorNome());
    }

    @Test
    public void qualTipoEnsinoProfessor(){
        Cidade cidade = new Cidade("Santos Dumont", "MG");
        Professor professor = new Professor(cidade, "doutorado");
        Escola escola = new Escola(cidade, professor);
        Curso curso = new Curso(escola, professor, new TipoEnsino("ensino fundamental"));
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
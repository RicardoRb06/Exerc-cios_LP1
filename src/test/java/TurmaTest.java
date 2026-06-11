import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {

    @Test
    void deveRetornarNomeProfessor() {
        Professor professor = new Professor("Marco");
        Disciplina disciplina = new Disciplina("LP1");
        Turma turma = new Turma(professor, disciplina);

        assertEquals("Marco", turma.getNomeProfessor());
    }

    @Test
    void deveRetornarNomesAlunos() {
        Professor professor = new Professor("Marco");
        Disciplina disciplina = new Disciplina("LP1");

        String alunoNome0 = "Ricardo";
        String alunoNome1 = "Pedro";

        Aluno aluno0 = new Aluno(alunoNome0);
        Aluno aluno1 = new Aluno(alunoNome1);

        ArrayList<String> nomesAlunos = new ArrayList<String>();
        nomesAlunos.add(alunoNome0);
        nomesAlunos.add(alunoNome1);

        Turma turma = new Turma(professor, disciplina, aluno0, aluno1);

        assertEquals(nomesAlunos, turma.getNomeAlunos());
    }
}
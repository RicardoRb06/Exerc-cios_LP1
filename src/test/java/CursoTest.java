import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarNomeProfessor(){
        Professor professor0 = new Professor("Marco");
        Professor professor1 = new Professor("Sandro");

        Disciplina disciplina = new Disciplina("---");

        Turma turma0 = new Turma(professor0, disciplina);
        Turma turma1 = new Turma(professor1, disciplina);

        Curso curso = new Curso(turma0, turma1);

        ArrayList<String> nomesProfessores = new ArrayList<String>();
        nomesProfessores.add(professor0.getNome());
        nomesProfessores.add(professor1.getNome());

        assertEquals(nomesProfessores, curso.getProfessorNomes());
    }

    @Test
    void deveRetornarNomesAlunosMatriculadosTurma() {
        Professor professor = new Professor("Marco");
        Disciplina disciplina = new Disciplina("LP1");

        String alunoNome0 = "Ricardo";
        String alunoNome1 = "Pedro";
        String alunoNome2 = "Guilherme";
        String alunoNome3 = "Yan";

        Aluno aluno0 = new Aluno(alunoNome0);
        Aluno aluno1 = new Aluno(alunoNome1);
        Aluno aluno2 = new Aluno(alunoNome2);
        Aluno aluno3 = new Aluno(alunoNome3);

        Turma turma0 = new Turma(professor, disciplina, aluno0, aluno1);
        Turma turma1 = new Turma(professor, disciplina, aluno2, aluno3);

        Curso curso = new Curso(turma0, turma1);

        ArrayList<String> nomesAlunos = new ArrayList<String>();
        nomesAlunos.add(alunoNome0);
        nomesAlunos.add(alunoNome1);
        nomesAlunos.add(alunoNome2);
        nomesAlunos.add(alunoNome3);

        assertEquals(nomesAlunos, curso.getAlunoNomes());
    }

    @Test
    void deveRetornarAlunosMatriculados() {

        String alunoNome0 = "Ricardo";
        String alunoNome1 = "Pedro";

        Aluno aluno0 = new Aluno(alunoNome0);
        Aluno aluno1 = new Aluno(alunoNome1);

        Curso curso = new Curso(aluno0, aluno1);

        ArrayList<String> nomesAlunos = new ArrayList<String>();
        nomesAlunos.add(alunoNome0);
        nomesAlunos.add(alunoNome1);

        assertEquals(nomesAlunos, curso.getAlunoNomes());
    }

    @Test
    void deveRetornarDisciplinas(){

        String disciplinaNome0 = "LP1";
        String disciplinaNome1 = "LP2";

        Professor professor = new Professor("Marco");
        Disciplina disciplina0 = new Disciplina(disciplinaNome0);
        Disciplina disciplina1 = new Disciplina(disciplinaNome1);

        Turma turmaLp1 = new Turma(professor, disciplina0);
        Turma turmaLp2 = new Turma(professor, disciplina1);

        Curso curso = new Curso(turmaLp1, turmaLp2);

        ArrayList<Disciplina> nomesDisciplinas = new ArrayList<Disciplina>();
        nomesDisciplinas.add(disciplina0);
        nomesDisciplinas.add(disciplina1);

        assertEquals(nomesDisciplinas, curso.getDisciplinas());
    }

}
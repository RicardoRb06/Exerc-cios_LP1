import java.util.ArrayList;

public class Curso {
    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos;

    public Curso() {
        this.turmas = new ArrayList<Turma>();
        this.alunos = new ArrayList<Aluno>()
    }

    public Curso(Aluno ... alunos) {
        this.turmas = new ArrayList<Turma>();
        this.alunos = new ArrayList<Aluno>();
        for(Aluno aluno : alunos){
            this.alunos.add(aluno);
        }
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}

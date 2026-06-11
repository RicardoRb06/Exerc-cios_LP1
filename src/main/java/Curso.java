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

    public Curso(Turma ... turmas) {
        this.turmas = new ArrayList<Turma>();
        this.alunos = new ArrayList<Aluno>();

        for(Turma turma : turmas){
            this.matricularTurma(turma);
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

    public void matricularTurma(Turma turma) {
        this.turmas.add(turma);

        for(Aluno aluno : turma.getAlunos()){
            if(this.alunos.contains(aluno)){
                this.alunos.add(aluno);
            }
        }
    }

}

import java.util.ArrayList;

public class Turma {

    private Professor professor;
    private Disciplina disciplina;
    private ArrayList<Aluno> alunos;

    public Turma(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<Aluno>();
    }

    public Turma(Professor professor, Disciplina disciplina, Aluno ... aluno) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<Aluno>();
        for (Aluno alunos : aluno) {
            this.alunos.add(aluno);
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getNomeProfessor(){
        return this.professor.getNome();
    }

    public ArrayList<String> getNomeAlunos(){
        ArrayList<String> alunosNome = new ArrayList<String>();

        for(Aluno aluno : alunos){
            alunosNome.add(aluno);
        }

        return alunosNome;
    }
}

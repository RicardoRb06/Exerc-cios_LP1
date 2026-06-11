import java.util.ArrayList;

public class Curso {
    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos;

    public Curso() {
        this.turmas = new ArrayList<Turma>();
        this.alunos = new ArrayList<Aluno>();
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

    public ArrayList<String> getProfessorNomes(){
        ArrayList<String> professorNomes = new ArrayList<String>();

        for (Turma turma : this.turmas){
            professorNomes.add(turma.getNomeProfessor());
        }

        return  getAlunoNomes();
    }

    public ArrayList<String> getAlunoNomesTurma(Turma turma){
        if(!this.turmas.contains(turma)) {
            throw new IllegalArgumentException("Turma não esta no curso");
        }

        ArrayList<String> alunoNomes = new ArrayList<String>();

        for (Aluno aluno : turma.getAlunos()){
            alunoNomes.add(aluno.getNome());
        }

        return alunoNomes;
    }

    public ArrayList<String> getAlunoNomes() {
        ArrayList<String> alunoNomes = new ArrayList<String>();

        for (Aluno aluno : this.alunos){
            alunoNomes.add(aluno.getNome());
        }

        return alunoNomes;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

        for (Turma turmas : this.turmas){
            disciplinas.add(turmas.getDisciplina());
        }

        return disciplinas;
    }

    public boolean isAlunoInTurma(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public void removeAluno(Aluno aluno) {
        if(!this.alunos.contains(aluno)){
            throw new IllegalArgumentException("Aluno não esta matriculado nesse curso");
        }
        this.alunos.remove(aluno);
    }

    public void removeTurma(Turma turma) {
        if(!this.turmas.contains(turma)){
            throw new IllegalArgumentException("Turma não esta presente no curso");
        }
        this.turmas.remove(turma);
    }
}

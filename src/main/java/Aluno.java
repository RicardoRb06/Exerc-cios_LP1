public class Aluno extends Pessoa{
    private Curso curso;

    public Aluno(Cidade naturalidade) {
        super(naturalidade);
    }

    public Aluno(Cidade naturalidade, String escolaridade) {
        super(naturalidade, escolaridade);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String obterEstadoEstuda(){
        if (this.curso == null) {
            throw new NullPointerException("Curso não pode ser null");
        }
        return this.curso.obterEstado();
    }

    public String obterCoordenadorCurso(){
        if (this.curso == null) {
            throw new NullPointerException("Curso não pode ser null");
        }
        this.curso.obterCoordenadorNome();
    }
}

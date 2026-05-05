public class Professor extends Pessoa{
    private Curso contratacao;

    public Professor(Cidade cidade, String escolaridade) {
        super(cidade, escolaridade);
    }

    public Curso getContratacao() {
        return contratacao;
    }

    public void setContratacao(Curso contratacao) {
        this.contratacao = contratacao;
    }

    public String obterTipoEnsino(){
        if(this.contratacao == null){
            throw new NullPointerException("Curso não pode ser null");
        }
        contratacao.obterTipoEnsino();
    }
}

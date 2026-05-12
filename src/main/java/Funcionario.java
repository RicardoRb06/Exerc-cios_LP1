public class Funcionario {

    private String nome;
    private Escolaridade escolaridade;
    private Departamento alocacao;
    private Filial filial;

    public Funcionario(String nome, Departamento alocacao) {
        this.setNome(nome);
        this.setAlocacao(alocacao);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escolaridade getEscolaridade() {
        return this.escolaridade.getEscolaridade();
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Departamento getAlocacao() {
        return this.alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public Filial getFilial() {
        return this.filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }
}

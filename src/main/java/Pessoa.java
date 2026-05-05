public abstract class Pessoa {
    private String nome;
    private Escolaridade escolaridade;
    private Cidade naturalidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        if(escolaridade == null) {
            throw new NullPointerException("Escolaridade não pode ser null");
        }
        this.escolaridade = new Escolaridade(escolaridade);
    }

    public Cidade getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        if (naturalidade == null){
            throw new NullPointerException("Naturalidade não pode ser null");
        }
        this.naturalidade = naturalidade;
    }

    public Pessoa(Cidade naturalidade) {
        this.setNaturalidade(naturalidade);
    }

    public Pessoa(Cidade naturalidade, String escolaridade) {
        this.setNaturalidade(naturalidade);
        this.setEscolaridade(escolaridade);
    }

    public String obterEstadoNaturalidade() {
        return naturalidade.obterEstado();
    }

    public String obterCidadeNaturalidade() {
        return naturalidade.getNome();
    }

    public String obterEscolaridade() {
        if(escolaridade == null){
            throw new NullPointerException("Essa pessoa não tem escolaridade");
        }
        return escolaridade.getNome();
    }
}

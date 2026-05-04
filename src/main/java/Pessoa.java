public abstract class Pessoa {
    private Escolaridade escolaridade;

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        if(escolaridade == null) {
            throw new NullPointerException("Escolaridade não pode ser null");
        }
        this.escolaridade = escolaridade;
    }

    public Pessoa() {
    }

    public Pessoa(Escolaridade escolaridade) {
        this.setEscolaridade(escolaridade);
    }

    public String obterEscolaridade() {
        if(escolaridade == null){
            throw new NullPointerException("Essa pessoa não tem escolaridade");
        }
        return escolaridade.getNome();
    }
}

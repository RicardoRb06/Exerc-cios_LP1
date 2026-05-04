public abstract class Pessoa {
    private Escolaridade escolaridade;

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        if(escolaridade == null) {
            throw new NullPointerException("Escolaridade não pode ser null");
        }
        this.escolaridade = new Escolaridade(escolaridade);
    }

    public Pessoa() {
    }

    public Pessoa(String escolaridade) {
        this.setEscolaridade(escolaridade);
    }

    public String obterEscolaridade() {
        if(escolaridade == null){
            throw new NullPointerException("Essa pessoa não tem escolaridade");
        }
        return escolaridade.getNome();
    }
}

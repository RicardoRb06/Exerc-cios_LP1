public abstract class Pessoa {
    private Escolaridade escolaridade;

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String obterEscolaridade() {
        if(escolaridade == null){
            throw new NullPointerException("Essa pessoa não tem escolaridade");
        }
        return escolaridade.getNome();
    }
}

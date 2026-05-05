public class Escola {
    private Professor diretor;
    private Cidade cidade;

    public Escola(Cidade cidade, Professor diretor) {
        this.setDiretor(diretor);
        this.setCidade(cidade);
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Professor getDiretor() {
        return diretor;
    }

    public void setDiretor(Professor diretor) {
        if(diretor == null){
            throw new NullPointerException("Diretor não pode ser null");
        }
        this.diretor = diretor;
    }

    public String obterEstado() {
        return this.cidade.obterEstado();
    }

    public String obterDiretorNome(){
        return this.diretor.getNome();
    }

    public String obterEscolaridadeDiretor() {
        return diretor.obterEscolaridade();
    }
}

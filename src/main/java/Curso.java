public class Curso {
    private Professor coordenador;
    private Cidade cidade;
    private TipoEnsino tipoEnsino

    public Curso(Cidade cidade, Professor coordenador, TipoEnsino tipoEnsino) {
        this.setCidade(cidade);
        this.setCoordenador(coordenador);
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        if(coordenador == null){
            throw new NullPointerException("Coordenador não pode ser null");
        }
        this.coordenador = coordenador;
    }

    public String obterEscolaridadeCoordenador() {
        return this.coordenador.obterEscolaridade();
    }

    public String obterEstado() {
        return this.cidade.obterEstado();
    }

    public String obterTipoEnsino() {
        this.tipoEnsino.getNome();
    }
}

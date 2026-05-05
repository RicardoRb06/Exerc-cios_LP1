public class Curso {
    private Professor coordenador;
    private Escola escola;
    private TipoEnsino tipoEnsino;

    public Curso(Escola escola, Professor coordenador, TipoEnsino tipoEnsino) {
        this.setEscola(escola);
        this.setCoordenador(coordenador);
        this.setTipoEnsino(tipoEnsino);
    }

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
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
        return this.escola.obterEstado();
    }

    public String obterTipoEnsino() {
        return this.tipoEnsino.getNome();
    }

    public String obterCoordenadorNome(){
        return this.coordenador.getNome();
    }

    public String obterDiretorNome(){
        return this.escola.obterDiretorNome();
    }
}

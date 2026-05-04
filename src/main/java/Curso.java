public class Curso {
    private Professor coordenador;

    public Curso(Professor coordenador) {
        this.setCoordenador(coordenador);
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
}

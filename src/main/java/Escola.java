public class Escola {
    private Professor diretor;

    public Escola(Professor diretor) {
        this.setDiretor(diretor);
    }

    public Professor getDiretor() {
        return diretor;
    }

    public void setDiretor(Professor diretor) {
        if(coordenador == null){
            throw new NullPointerException("Diretor não pode ser null");
        }
        this.diretor = diretor;
    }

    public String obterEscolaridadeDiretor() {
        return diretor.obterEscolaridade();
    }
}

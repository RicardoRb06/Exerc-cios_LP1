public class Cidade {
    private String nome;
    private Estado estado;

    public Cidade(String nome, String estado) {
        this.setNome(nome);
        this.setEstado(estado);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){
            throw new NullPointerException("Cidade não pode ser null");
        }
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = new Estado(estado);
    }
}

public class Estado {
    private String nome;

    public Estado(String nome) {
         this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){
            throw new NullPointerException("Estado não pode ser null");
        }
        this.nome = nome;
    }
}

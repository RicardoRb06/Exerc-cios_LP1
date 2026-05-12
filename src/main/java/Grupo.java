public class Grupo {

    private String nome;
    private Pais sede;
    private Funcionario presidente;

    public Grupo(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getSede() {
        return this.sede;
    }

    public void setSede(Pais sede) {
        this.sede = sede;
    }

    public Funcionario getPresidente() {
        return this.presidente;
    }

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }

    public String getNomePaisSede() {
        return this.sede.getNome();
    }

    public String getNomePresidente() {
        return this.presidente.getNome();
    }

    public String escolaridadePresidente(){
        if (presidente == null){
            throw new NullPointerException("Presidente não pode ser null");
        }
        return presidente.getEscolaridade();
    }
}

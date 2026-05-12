public class Empresa {
    private Funcionario diretor;
    private Grupo grupo;

    public Empresa() {
    }

    public String getDiretor() {
        if (diretor == null){
            throw new NullPointerException("Diretor não pode ser null");
        }
        return diretor.getNome();
    }

    public void setDiretor(Funcionario diretor) {
        this.diretor = diretor;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public String getPaisSede() {
        if (grupo == null){
            throw new NullPointerException("Grupo não pode ser null");
        }
        return grupo.getNomePaisSede();
    }
}

public class Filial {
    private Empresa empresa;
    private Cidade cidade;

    public Filial(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getEstado(){
        if (cidade == null){
            throw new NullPointerException("Cidade não pode ser null");
        }
        return cidade.getNomeEstado();
    }

    public String getNomeDiretor(){
        return empresa.getDiretor();
    }
}

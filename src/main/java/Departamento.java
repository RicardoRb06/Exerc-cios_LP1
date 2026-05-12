public class Departamento {
    private Empresa empresa;
    private Funcionario chefia;

    public Departamento(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Funcionario getChefia() {
        return chefia;
    }

    public void setChefia(Funcionario chefia) {
        this.chefia = chefia;
    }

    public String getPaisSede() {
        return empresa.getPaisSede();
    }

    public String getEscolaridadeChefe() {
        if (chefia == null){
            throw new NullPointerException("Chefia não pode ser null");
        }
        return chefia.getEscolaridade();
    }
}

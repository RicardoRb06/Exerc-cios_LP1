import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    public void deveRetornarEscolaridadeChefe() {
        Empresa empresa = new Empresa();
        Departamento departamento = new Departamento(empresa);
        Funcionario funcionario = new Funcionario("Fulano");
        Escolaridade escolaridade = new Escolaridade("doutorado");

        departamento.setChefia(funcionario);
        funcionario.setEscolaridade(escolaridade);

        assertEquals("doutorado", departamento.getEscolaridadeChefe());
    }

    @Test
    public void deveCriticarFuncionarioNull() {
        try {
            Empresa empresa = new Empresa();
            Departamento departamento = new Departamento(empresa);
            departamento.getEscolaridadeChefe();
            fail();
        } catch(NullPointerException e){
            assertEquals("Chefia não pode ser null", e.getMessage());
        }
    }
}
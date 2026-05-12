import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    public void deveRetornarPaisAlocacao() {
        Funcionario funcionario = new Funcionario("Fulano");
        Pais pais = new Pais("Brasil");
        Grupo grupo = new Grupo("grupo");
        Empresa empresa = new Empresa();
        Departamento departamento = new Departamento(empresa);

        empresa.setGrupo(grupo);
        grupo.setSede(pais);
        funcionario.setAlocacao(departamento);

        assertEquals("Brasil", funcionario.getPaisAlocacao());
    }

}
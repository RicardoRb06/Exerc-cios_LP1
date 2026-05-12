import org.junit.jupiter.api.Test;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {

    @Test
    public void deveRetornarEscolaridadePresidente(){
        Grupo grupo = new Grupo("Grupo");
        Funcionario funcionario = new Funcionario("Fulano");
        Escolaridade escolaridade = new Escolaridade("doutorado");

        funcionario.setEscolaridade(escolaridade);
        grupo.setPresidente(funcionario);

        assertEquals("doutorado", grupo.escolaridadePresidente());
    }

    @Test
    public void deveCriticarEscolaridadePresidenteNull(){
        try {
            Grupo grupo = new Grupo("Grupo");
            grupo.escolaridadePresidente();
            fail();
        } catch(NullPointerException e){
            assertEquals("Presidente não pode ser null", e.getMessage());
        }
    }

}
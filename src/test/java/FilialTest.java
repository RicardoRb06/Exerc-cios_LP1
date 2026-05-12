import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {

    @Test
    void deveRetornarNomeEstado() {
        Empresa empresa = new Empresa();
        Filial filial = new Filial(empresa);
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado("MG", pais);
        Cidade cidade = new Cidade("JF", estado);

        filial.setCidade(cidade);

        assertEquals("MG", filial.getEstado());
    }

    @Test
    public void deveCriticarCidadeNull(){
        try {
            Empresa empresa = new Empresa();
            Filial filial = new Filial(empresa);
            filial.getEstado();
            fail();
        } catch(NullPointerException e){
            assertEquals("Cidade não pode ser null", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeDiretor() {
        Empresa empresa = new Empresa();
        Filial filial = new Filial(empresa);
        Funcionario funcionario = new Funcionario("Fulano");

        empresa.setDiretor(funcionario);

        assertEquals("Fulano", filial.getNomeDiretor());
    }
}
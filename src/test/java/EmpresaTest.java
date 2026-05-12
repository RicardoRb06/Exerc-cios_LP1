import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveCriticarEmpresaNull() {
        try {
            Empresa empresa = new Empresa();
            empresa.getPaisSede();
            fail();
        } catch(NullPointerException e){
            assertEquals("Grupo não pode ser null", e.getMessage());
        }
    }
}
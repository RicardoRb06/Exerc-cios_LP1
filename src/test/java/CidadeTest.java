import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    public void deveTestarNomeNull(){
        try{
            Cidade cidade = new Cidade(null, "MG");
            fail();
        }catch (NullPointerException e){
            assertEquals("Nome não pode ser null", e.getMessage());
        }
    }
}
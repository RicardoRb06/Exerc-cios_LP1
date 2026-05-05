import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoTest {

    @Test
    public void verificaEstadoNull(){
        try{
            Estado estado = new Estado(null);
            fail();
        }catch (NullPointerException e){
            assertEquals("Estado não pode ser null", e.getMessage());
        }
    }

}
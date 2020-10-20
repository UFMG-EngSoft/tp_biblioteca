package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import biblioteca.exemplar.Exemplar;

public class ExemplarTeste {

    @Test
    public void testeInstanciaExemplar() {
        int id = 157;
        int edicao = 7;
        Exemplar exemplar = new Exemplar(id, edicao);
        
        assertEquals(id, exemplar.getId());
        assertEquals(edicao, exemplar.getEdicao());
    }
}
package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import biblioteca.assinatura.Assinatura;

public class AssinaturaTeste {

    @Test
    public void testeInstanciaAssinatura() {
        int idPeriodico = 157;
        int idUsuario = 1;
        Assinatura assinatura = new Assinatura(idPeriodico, idUsuario);
        
        assertEquals(idPeriodico, assinatura.getIdPeriodico());
        assertEquals(idUsuario, assinatura.getIdUsuario());
    }
}
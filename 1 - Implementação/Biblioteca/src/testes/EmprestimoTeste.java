package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

import biblioteca.emprestimo.Emprestimo;

public class EmprestimoTeste {

    @Test
    public void testeInstanciaEmprestimo() {
        int idExemplar = 123; 
        int idUsuario = 1567;
        boolean ativo = true;
        Date dataEmprestimo = new Date(15, 10, 2020); 
        Date dataDevolucao = new Date(28, 10, 2020); 
        Date dataPrevistaDevolucao = new Date(01, 11, 2020); 
        float valorMulta = 10.00f;
        Emprestimo assinatura = new Emprestimo(idExemplar, idUsuario, ativo, dataEmprestimo, dataDevolucao, 
                                dataPrevistaDevolucao, valorMulta);
        
        assertEquals(idExemplar, assinatura.getIdExemplar());
        assertEquals(idUsuario, assinatura.getIdUsuario());
        assertEquals(ativo, assinatura.isAtivo());
        assertEquals(dataEmprestimo, assinatura.getDataEmprestimo());
        assertEquals(dataDevolucao, assinatura.getDataDevolucao());
        assertEquals(dataPrevistaDevolucao, assinatura.getDataPrevistaDevolucao());
        assertEquals(valorMulta, assinatura.getValorMulta());
    }
}
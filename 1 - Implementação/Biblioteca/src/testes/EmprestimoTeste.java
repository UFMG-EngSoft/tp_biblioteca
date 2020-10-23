package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        Emprestimo emprestimo = new Emprestimo(idExemplar, idUsuario, ativo, dataEmprestimo, dataDevolucao, 
                                dataPrevistaDevolucao, valorMulta);
        
        assertEquals(idExemplar, emprestimo.getIdExemplar());
        assertEquals(idUsuario, emprestimo.getIdUsuario());
        assertEquals(ativo, emprestimo.isAtivo());
        assertEquals(dataEmprestimo, emprestimo.getDataEmprestimo());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
        assertEquals(dataPrevistaDevolucao, emprestimo.getDataPrevistaDevolucao());
        assertEquals(valorMulta, emprestimo.getValorMulta());
    }

    @Test
    public void testeCalcularMulta() {
        int qtdDiasAtraso = 5;
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setValorMulta(10.00f);

        assertEquals(15.00f, emprestimo.calcularMulta(qtdDiasAtraso));
    }

    @Test
    public void testeValidarEmprestimo() {
        Emprestimo emprestimo = new Emprestimo();
        assertTrue(emprestimo.validarEmprestimo());
    }
}
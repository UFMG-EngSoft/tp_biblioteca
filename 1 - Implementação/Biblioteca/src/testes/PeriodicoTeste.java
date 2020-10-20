package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import biblioteca.exemplar.Periodico;

public class PeriodicoTeste {

    @Test
    public void testeInstanciaPeriodico() {
        int id = 157;
        int numeroExemplares = 50;
        int periodoMaximoEmprestimo = 15;
        String descricao = "Tudo que existe de curiosidades!";
        boolean disponivel = true;
        String nome = "Revista Recreio";
        String editora = "Abril";
        String ISSN = "2903809";
        Periodico periodico = new Periodico(id, numeroExemplares, periodoMaximoEmprestimo, descricao, disponivel, nome, editora, ISSN);
        
        assertEquals(id, periodico.getId());
        assertEquals(numeroExemplares, periodico.getNumeroExemplares());
        assertEquals(periodoMaximoEmprestimo, periodico.getPeriodoMaximoEmprestimo());
        assertEquals(descricao, periodico.getDescricao());
        assertEquals(disponivel, periodico.isDisponivel());
        assertEquals(nome, periodico.getNome());
        assertEquals(editora, periodico.getEditora());
        assertEquals(ISSN, periodico.getISSN());
    }
}
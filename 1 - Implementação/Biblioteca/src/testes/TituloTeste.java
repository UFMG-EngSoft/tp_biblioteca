package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import biblioteca.exemplar.Titulo;

public class TituloTeste {

    @Test
    public void testeInstanciaTitulo() {
        int id = 157;
        int numeroExemplares = 50;
        int periodoMaximoEmprestimo = 15;
        String descricao = "Livro dos três porquinhos!";
        boolean disponivel = true;
        String nome = "Os Três Porquinhos";
        Titulo titulo = new Titulo(id, numeroExemplares, periodoMaximoEmprestimo, descricao, disponivel, nome);
        
        assertEquals(id, titulo.getId());
        assertEquals(numeroExemplares, titulo.getNumeroExemplares());
        assertEquals(periodoMaximoEmprestimo, titulo.getPeriodoMaximoEmprestimo());
        assertEquals(descricao, titulo.getDescricao());
        assertEquals(disponivel, titulo.isDisponivel());
        assertEquals(nome, titulo.getNome());
    }
}
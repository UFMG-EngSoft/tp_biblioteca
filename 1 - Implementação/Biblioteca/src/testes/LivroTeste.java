package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import biblioteca.exemplar.Livro;

public class LivroTeste {

    @Test
    public void testeInstanciaLivro() {
        int id = 157;
        int numeroExemplares = 50;
        int periodoMaximoEmprestimo = 15;
        String descricao = "Livro dos três porquinhos!";
        boolean disponivel = true;
        String nome = "Os Três Porquinhos";
        String autor = "Marcos";
        String ISBN = "74982714";
        Livro livro = new Livro(id, numeroExemplares, periodoMaximoEmprestimo, descricao, disponivel, nome, autor, ISBN);
        
        assertEquals(id, livro.getId());
        assertEquals(numeroExemplares, livro.getNumeroExemplares());
        assertEquals(periodoMaximoEmprestimo, livro.getPeriodoMaximoEmprestimo());
        assertEquals(descricao, livro.getDescricao());
        assertEquals(disponivel, livro.isDisponivel());
        assertEquals(nome, livro.getNome());
        assertEquals(autor, livro.getAutor());
        assertEquals(ISBN, livro.getISBN());
    }
}
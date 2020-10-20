package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import biblioteca.exemplar.Jornal;

public class JornalTeste {

    @Test
    public void testeInstanciaJornal() {
        int id = 157;
        int numeroExemplares = 50;
        int periodoMaximoEmprestimo = 15;
        String descricao = "Noticias de ponta!";
        boolean disponivel = true;
        String nome = "O Tempo";
        String editorChefe = "Mateus";
        Jornal jornal = new Jornal(id, numeroExemplares, periodoMaximoEmprestimo, descricao, disponivel, nome, editorChefe);
        
        assertEquals(id, jornal.getId());
        assertEquals(numeroExemplares, jornal.getNumeroExemplares());
        assertEquals(periodoMaximoEmprestimo, jornal.getPeriodoMaximoEmprestimo());
        assertEquals(descricao, jornal.getDescricao());
        assertEquals(disponivel, jornal.isDisponivel());
        assertEquals(nome, jornal.getNome());
        assertEquals(editorChefe, jornal.getEditorChefe());
    }
}
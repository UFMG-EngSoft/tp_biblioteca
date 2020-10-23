package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import biblioteca.usuario.Usuario;
import java.util.Date;

public class UsuarioTeste {

    @Test
    public void testeInstanciaUsuario() {
        int id = 1;
        String nome = "Alex";
        String sexo = "Masculino";
        Date dataNascimento = new Date(15, 10, 2020);
        String login = "Aluno";
        String senha = "123456";
        Usuario usuario = new Usuario(id, nome, sexo, dataNascimento, login, senha);
        
        assertEquals(id, usuario.getId());
        assertEquals(nome, usuario.getNome());
        assertEquals(sexo, usuario.getSexo());
        assertEquals(dataNascimento, usuario.getDataNascimento());
        assertEquals(login, usuario.getLogin());
        assertEquals(senha, usuario.getSenha());
    }

    @Test
    public void testeSolicitarEmprestimo() {
        Usuario usuario = new Usuario();
        assertTrue(usuario.solicitarEmprestimo());
    }

    @Test
    public void testeRealizarDevolucao() {
        Usuario usuario = new Usuario();
        assertTrue(usuario.realizarDevolucao());
    }

    @Test
    public void testePagarMultaPorAtraso() {
        Usuario usuario = new Usuario();
        assertTrue(usuario.pagarMultaPorAtraso());
    }

    @Test
    public void testeIndicarPerda() {
        Usuario usuario = new Usuario();
        assertTrue(usuario.indicarPerda());
    }

    @Test
    public void testeAssinarPeriodico() {
        Usuario usuario = new Usuario();
        assertTrue(usuario.assinarPeriodico());
    }
}
package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
}
package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

import biblioteca.usuario.Professor;

public class ProfessorTeste {

    @Test
    public void testeInstanciaProfessor() {
        int id = 1;
        String nome = "Alex";
        String sexo = "Masculino";
        Date dataNascimento = new Date(15, 10, 2020);
        String login = "Aluno";
        String senha = "123456";
        Professor professor = new Professor(id, nome, sexo, dataNascimento, login, senha);
        
        assertEquals(id, professor.getId());
        assertEquals(nome, professor.getNome());
        assertEquals(sexo, professor.getSexo());
        assertEquals(dataNascimento, professor.getDataNascimento());
        assertEquals(login, professor.getLogin());
        assertEquals(senha, professor.getSenha());
    }

    @Test
    public void testeConfigurarDisponibilidadeTitulo() {
        Professor professor = new Professor();
        assertTrue(professor.configurarDisponibilidadeTitulo());
    }
}
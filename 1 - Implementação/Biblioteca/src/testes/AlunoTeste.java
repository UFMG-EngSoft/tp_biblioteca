package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;
import biblioteca.usuario.Aluno;

public class AlunoTeste {

    @Test
    public void testeInstanciaAluno() {
        int id = 1;
        String nome = "Alex";
        String sexo = "Masculino";
        Date dataNascimento = new Date(15, 10, 2020);
        String login = "Aluno";
        String senha = "123456";
        String matricula = "2018856723";
        Aluno aluno = new Aluno(id, nome, sexo, dataNascimento, login, senha, matricula);

        assertEquals(id, aluno.getId());
        assertEquals(nome, aluno.getNome());
        assertEquals(sexo, aluno.getSexo());
        assertEquals(dataNascimento, aluno.getDataNascimento());
        assertEquals(login, aluno.getLogin());
        assertEquals(senha, aluno.getSenha());
        assertEquals(matricula, aluno.getMatricula());
    }
}
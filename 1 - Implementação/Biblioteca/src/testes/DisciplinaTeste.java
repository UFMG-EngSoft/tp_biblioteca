package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import biblioteca.disciplina.Disciplina;

public class DisciplinaTeste {

    @Test
    public void testeInstanciaDisciplina() {
        int id = 157;
        String nome = "Victor";
        Disciplina disciplina = new Disciplina(id, nome);
        
        assertEquals(id, disciplina.getId());
        assertEquals(nome, disciplina.getNome());
    }
}